package assignment_902.service;

import java.util.List;
import java.util.Scanner;

import assignment_902.entities.Airport;
import assignment_902.entities.Fixedwing;
import assignment_902.utils.FixedwingValidator;

public class FixedwingService {
	public static void display(List<Airport> airports) {
		System.out.println("List of fixedwing");
		for (Airport airport : airports) {
			airport.fixedwings.forEach(fixedwing -> {
				System.out.println(fixedwing.toString() + ", Airport ID=" + airport.ID + ", Airport name=" + airport.name);
			});
		}
	}
	
	public static void addFixedwing(List<Airport> airports, String ID) {
		Fixedwing fixedwing = new Fixedwing();
		airports.forEach(airport -> {
			if (airport.ID.equals(ID)) {
				System.out.println("Add new Fixedwing to Airport " + ID);
				fixedwing.input(airport.maxFixedwingParkingPlace, airports);
				airport.fixedwings.add(fixedwing);
				System.out.println("Add successly!");
			}
		});
	}
	
	@SuppressWarnings("resource")
	public static void chanePlaneTypeAndRunwaySizeOfFixedWing(Fixedwing fixedwing, Double maxFixedwingParkingPlace) {
		Scanner sc = new Scanner(System.in);
		
		fixedwing.planeType = null;
		fixedwing.minNeededRunwaySize = null;
		
		while (true) {
			try {
				if (fixedwing.planeType == null) {
					System.out.print("Enter plane type: ");
					String planeType = sc.nextLine();
					fixedwing.planeType = FixedwingValidator.isPlaneType(planeType) ? planeType : null;
				}
				if (fixedwing.minNeededRunwaySize == null) {
					System.out.print("Enter min needed runway size: ");
					Double minNeededRunwaySize = Double.valueOf(sc.nextLine());
					fixedwing.minNeededRunwaySize = FixedwingValidator.isParked(minNeededRunwaySize, maxFixedwingParkingPlace) ? minNeededRunwaySize : null;
				}
				
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
