package assignment_902.service;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import assignment_902.entities.Airport;

public class AirportService {
	public static boolean searchAirport(String ID, List<Airport> airports) {
		for (Airport airport : airports) {
			if (airport.ID.equals(ID)) {
				System.out.println(airport);
				return true;
			}
		}
		return false;
	}
	
	public static void displayBySortedID(List<Airport> airports) {
		System.out.println("List information of Airport");
		airports.sort(new Comparator<Airport>() {
			@Override
			public int compare(Airport o1, Airport o2) {
				return o1.ID.compareTo(o2.ID);
			}
		});
		airports.forEach(airport -> System.out.println(airport));
	}
	
	public static void displayFixedwing(List<Airport> airports) {
		System.out.println("List of fixedwing");
		airports.forEach(airport -> {
			airport.fixedwings.forEach(fixedwing -> System.out.println(fixedwing + " Airport ID = " + airport.ID + ", Airport Name = " + airport.name));
		});
	}
	
	public static void displayHelicopter(List<Airport> airports) {
		System.out.println("List of Helicopter");
		airports.forEach(airport -> {
			airport.helicopters.forEach(helicopter -> System.out.println(helicopter + " Airport ID = " + airport.ID + ", Airport Name = " + airport.name));
		});
	}
	
	public static void addAirport(List<Airport> airports) {
		System.out.println("Create airport");
		Airport airport = new Airport();
		airport.input(airports);
		airports.add(airport);	
	}
	
	@SuppressWarnings("resource")
	public static void addFixedwing(List<Airport> airports) {
		System.out.print("Enter the Airport ID to add fixedwing: ");
		Scanner sc = new Scanner(System.in);
		String ID = sc.nextLine();
		if (searchAirport(ID, airports)) {
			FixedwingService.addFixedwing(airports, ID);
		} else {
			System.out.println("Not found ID = " + ID);
		}
	}
	
	@SuppressWarnings("resource")
	public static void addHellicopter(List<Airport> airports) {
		System.out.print("Enter the Airport ID to add hellicopter: ");
		Scanner sc = new Scanner(System.in);
		String ID = sc.nextLine();
		if (searchAirport(ID, airports)) {
			HelicopterService.addHelicopter(airports, ID);
		} else {
			System.out.println("Not found ID = " + ID);
		}
	}
	
	@SuppressWarnings("resource")
	public static void removeFixedwing(List<Airport> airports) {
		displayFixedwing(airports);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fixedwing ID to delete: ");
		String ID = sc.nextLine();
		boolean check = false;
		
		for (int i = 0; i < airports.size(); i++) {
			if (check) break;
			for (int j = 0; j < airports.get(i).fixedwings.size(); j++) {
				if (airports.get(i).fixedwings.get(j).ID.equals(ID)) {
					System.out.println("Remove: " + airports.get(i).fixedwings.get(j));
					airports.get(i).fixedwings.remove(j);
					check = true;
					break;
				}
			} 
		}
		
		if (!check) System.out.println("Not found ID = " + ID);

//		airports.forEach(airport -> {
//			airport.fixedwings.forEach(fixedwing -> {
//				if (fixedwing.ID.equals(ID)) {
//					System.out.println("Remove: " + fixedwing);
//					airport.fixedwings.remove(fixedwing);
//				}
//			});
//		});
	}
	
	@SuppressWarnings("resource")
	public static void removeHelicopter(List<Airport> airports) {
		displayHelicopter(airports);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the helicopter ID to delete: ");
		String ID = sc.nextLine();
		boolean check = false;
		
		for (int i = 0; i < airports.size(); i++) {
			if (check) break;
			for (int j = 0; j < airports.get(i).helicopters.size(); j++) {
				if (airports.get(i).helicopters.get(j).ID.equals(ID)) {
					System.out.println("Remove: " + airports.get(i).helicopters.get(j));
					airports.get(i).helicopters.remove(j);
					check = true;
					break;
				}
			} 
		}
		
		if (!check) System.out.println("Not found ID = " + ID);
	}

	@SuppressWarnings("resource")
	public static void chanePlaneTypeAndRunwaySizeOfFixedWing(List<Airport> airports) {
		displayFixedwing(airports);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fixedwing ID to change: ");
		String ID = sc.nextLine();
		boolean check = false;
		
		for (int i = 0; i < airports.size(); i++) {
			if (check) break;
			for (int j = 0; j < airports.get(i).fixedwings.size(); j++) {
				if (airports.get(i).fixedwings.get(j).ID.equals(ID)) {
					System.out.println("Change: " + airports.get(i).fixedwings.get(j));
					FixedwingService.chanePlaneTypeAndRunwaySizeOfFixedWing(airports.get(i).fixedwings.get(j), airports.get(i).maxFixedwingParkingPlace);
					check = true;
					break;
				}
			} 
		}
		
		if (!check) System.out.println("Not found ID = " + ID);
	}

	@SuppressWarnings("resource")
	public static void displayStatusAirport(List<Airport> airports) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the airport ID: ");
		String ID = sc.nextLine();
		
		if (!searchAirport(ID, airports)) System.out.println("Not found ID = " + ID);
	}
}
