package assignment_902.utils;

import java.util.List;

import assignment_902.entities.Airport;

public class FixedwingValidator {
	public static boolean isID(String ID, List<Airport> airports) {
		for (Airport airport : airports) {
			airport.fixedwings.forEach(fixedwing -> {
				if (fixedwing.ID.equals(ID)) throw new RuntimeException("ID has been exits"); 
			});
		}
		if (ID.matches("[F][W][0-9]{5}")) return true;
		throw new RuntimeException("ID incorret. Ex: FW00001");
	}
	
	public static boolean isPlaneType(String planeType) {
		if ("CAG".equals(planeType) || "LGR".equals(planeType) || "PRV".equals(planeType)) return true;
		throw new RuntimeException("Plane type incorret. Ex: CAG, LGR, PRV");
	}
	
	public static boolean isParked(Double minNeededRunwaySize, Double maxFixedwingParkingPlace) {
		if (minNeededRunwaySize <= maxFixedwingParkingPlace) return true;
		throw new RuntimeException("Its min runway size does not excess the airport runway size.");
	}
}
