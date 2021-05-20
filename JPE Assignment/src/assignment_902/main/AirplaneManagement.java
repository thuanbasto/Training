package assignment_902.main;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment_902.entities.Airport;
import assignment_902.service.AirportService;
import assignment_902.utils.IOService;

public class AirplaneManagement {
	public static void main(String[] args) throws IOException {
		String checkContinue = "";
		Scanner scanner = new Scanner(System.in);
		List<Airport> airports = new ArrayList<>();

//		airports.add(new Airport("AP00001", "Ha Noi", 100.0, 100.0, 100.0, new ArrayList<>(), new ArrayList<>()));
//		airports.add(new Airport("AP00002", "Can Tho", 200.0, 200.0, 200.0, new ArrayList<>(), new ArrayList<>()));
//		airports.add(new Airport("AP00003", "Da Nang", 300.0, 300.0, 300.0, new ArrayList<>(), new ArrayList<>()));
//		airports.add(new Airport("AP00004", "Sai Gon", 400.0, 400.0, 400.0, new ArrayList<>(), new ArrayList<>()));
		
		try {
			airports = IOService.read(airports);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		do {
			System.out.println("Choose function: ");
			System.out.println("1. Add a new Airport");
			System.out.println("2. Add a Fixed-wing to an Airport");
			System.out.println("3. Remove a Fixed-wing to an Airport");
			System.out.println("4. Add a Helicopter to an Airport");
			System.out.println("5. Remove a Helicopter to an Airport");
			System.out.println("6. Change plane type and min needed runway size of fixed wing airplane");
			System.out.println("7. Display list of all airport information, sorted by airport ID ");
			System.out.println("8. Display the status of one airport, selected by airport ID");
			System.out.println("9. Display list of all fixed wing airplanes with its parking airport ID and name");
			System.out.println("10. Display list of all helicopters with its parking airport ID and name");
			System.out.println("11. Exit");
			System.out.print("Enter the number: ");
			String number = scanner.nextLine();
				switch (number) {
				case "1":
					AirportService.addAirport(airports);
					IOService.write(airports);
					break;
				case "2":
					AirportService.addFixedwing(airports);
					IOService.write(airports);
					break;
				case "3":
					AirportService.removeFixedwing(airports);
					IOService.write(airports);
					break;
				case "4":
					AirportService.addHellicopter(airports);
					IOService.write(airports);
					break;
				case "5":
					AirportService.removeHelicopter(airports);
					IOService.write(airports);
					break;
				case "6":
					AirportService.chanePlaneTypeAndRunwaySizeOfFixedWing(airports);
					IOService.write(airports);
					break;
				case "7":
					AirportService.displayBySortedID(airports);
					IOService.write(airports);
					break;
				case "8":
					AirportService.displayStatusAirport(airports);
					break;
				case "9":
					AirportService.displayFixedwing(airports);
					break;
				case "10":
					AirportService.displayHelicopter(airports);
					break;
				case "11":
					checkContinue = "n";
					break;
				}
			System.out.println("---------------");
		} while (!"n".equalsIgnoreCase(checkContinue));
		System.out.println("Bye !");
		scanner.close();
	}
}
