/*
	@Author : thuan
	@Date : May 15, 2021
*/

package assignment_901.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment_901.entities.Customer;
import assignment_901.service.CustomerService;
import assignment_901.service.IOService;

public class Test {
	public static List<Customer> customers = new ArrayList<Customer>();

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String checkContinue = "";
		Scanner scanner = new Scanner(System.in);
		
//		customers.add(new Customer("thuan1", "12", "11", new ArrayList<>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
//		customers.add(new Customer("thuan2", "12", "12", new ArrayList<>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
//		customers.add(new Customer("thuan3", "14", "13", new ArrayList<>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
//		customers.add(new Customer("thuan4", "15", "14", new ArrayList<>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
		
		IOService.read();
		
		do {
			System.out.println("Choose function: ");
			System.out.println("1. Add a new Customer");
			System.out.println("2. Show all Customers");
			System.out.println("3. Search Customer");
			System.out.println("4. Remove Customer");
			System.out.println("5. Exit");
			System.out.print("Enter the number: ");
			String number = scanner.nextLine();
			switch (number) {
			case "1":
				CustomerService.createCustomer();
				IOService.write();
				break;
			case "2":
				CustomerService.display();
				break;
			case "3":
				System.out.println("Enter phone number for search: ");
				String phone = scanner.nextLine();
				CustomerService.search(phone);
				break;
			case "4":
				System.out.println("Enter phone number for remove: ");
				phone = scanner.nextLine();
				CustomerService.remove(phone);
				IOService.write();
				break;
			case "5":
				checkContinue = "n";
				break;
			}
			System.out.println();
		} while (!"n".equalsIgnoreCase(checkContinue));
		System.out.println("Bye !");
		scanner.close();

	}
}
