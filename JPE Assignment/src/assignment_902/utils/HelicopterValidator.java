package assignment_902.utils;

import java.util.List;

import assignment_902.entities.Airport;

public class HelicopterValidator {
	public static boolean isID(String ID, List<Airport> airports) {
		for (Airport airport : airports) {
			airport.helicopters.forEach(helicopter -> {
				if (helicopter.ID.equals(ID)) throw new RuntimeException("ID has been exits"); 
			});
		}
		if (ID.matches("[R][W][0-9]{5}")) return true;
		throw new RuntimeException("ID incorret. Ex: RW00001");
	}
	
	public static boolean isMaxTakeoffWeight(Double maxTakeoffWeight, Double emptyWeight) {
		if (maxTakeoffWeight < emptyWeight * 1.5) return true;
		throw new RuntimeException("The max takeoff weight of helicopter does not excess 1.5 times of its empty weight");
	}
}
