package assignment_902.entities;

import java.util.List;
import java.util.Scanner;

import assignment_902.utils.AirplaneValidator;
import assignment_902.utils.FixedwingValidator;

public class Fixedwing extends Airplane{
	public String planeType;
	public Double minNeededRunwaySize;

	public Fixedwing() {
		super();
	}

	public Fixedwing(String iD, String model, Double speed, Double emptyWeight, 
			Double maxTakeoffWeight, String planeType, Double minNeededRunwaySize) {
		super(iD, model, speed, emptyWeight, maxTakeoffWeight);
		this.planeType = planeType;
		this.minNeededRunwaySize = minNeededRunwaySize;
	}

	@Override
	public String toString() {
		return "Fixedwing [ID=" + ID + ", model=" + model + ", speed=" + speed + ", emptyWeight=" + emptyWeight
				+ ", maxTakeoffWeight=" + maxTakeoffWeight + ", planeType=" + planeType + ", minNeededRunwaySize="
				+ minNeededRunwaySize + "]";
	}
	
	@SuppressWarnings("resource")
	public void input(Double maxFixedwingParkingPlace, List<Airport> airports) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (ID == null) {
					System.out.print("Enter ID (Ex: FW00000): ");
					String ID = sc.nextLine();
					this.ID = FixedwingValidator.isID(ID,airports) ? ID : null;
				}
				if (model == null) {
					System.out.print("Enter model: ");
					String model = sc.nextLine();
					this.model = AirplaneValidator.isModel(model) ? model : null;
				}
				if (speed == null) {
					System.out.print("Enter speed: ");
					this.speed = Double.valueOf(sc.nextLine());
				}
				if (emptyWeight == null) {
					System.out.print("Enter empty weight: ");
					this.emptyWeight = Double.valueOf(sc.nextLine());
				}
				if (maxTakeoffWeight == null) {
					System.out.print("Enter max takeoff weight: ");
					this.maxTakeoffWeight = Double.valueOf(sc.nextLine());
				}
				if (planeType == null) {
					System.out.print("Enter plane type: ");
					String planeType = sc.nextLine();
					this.planeType = FixedwingValidator.isPlaneType(planeType) ? planeType : null;
				}
				if (minNeededRunwaySize == null) {
					System.out.print("Enter min needed runway size: ");
					Double minNeededRunwaySize = Double.valueOf(sc.nextLine());
					this.minNeededRunwaySize = FixedwingValidator.isParked(minNeededRunwaySize, maxFixedwingParkingPlace) ? minNeededRunwaySize : null;
				}
				
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	@Override
	public void fly() {
		System.out.println("Fixed-wing fly");
	}

	public Double getRunwaySize() {
		return minNeededRunwaySize;
	}

	public void setRunwaySize(Double minNeededRunwaySize) {
		this.minNeededRunwaySize = minNeededRunwaySize;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Double getMinNeededRunwaySize() {
		return minNeededRunwaySize;
	}

	public void setMinNeededRunwaySize(Double minNeededRunwaySize) {
		this.minNeededRunwaySize = minNeededRunwaySize;
	}

}
