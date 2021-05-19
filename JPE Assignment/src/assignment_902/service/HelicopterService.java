package assignment_902.service;

import java.util.List;

import assignment_902.entities.Airport;
import assignment_902.entities.Helicopter;

public class HelicopterService {
	public static void display(List<Airport> airports) {
		System.out.println("List of helicopter");
		for (Airport airport : airports) {
			airport.helicopters.forEach(helicopter -> {
				System.out.println(helicopter + ", Airport ID=" + airport.ID + ", Airport name=" + airport.name);
			});
		}
	}
	
	public static void addHelicopter(List<Airport> airports, String ID) {
		Helicopter helicopter = new Helicopter();
		airports.forEach(airport -> {
			if (airport.ID.equals(ID)) {
				System.out.println("Add new helicopter to Airport " + ID);
				helicopter.input(airports);
				airport.helicopters.add(helicopter);
				System.out.println("Add successly!");
			}
		});
	}
}
