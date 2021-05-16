/*
	@Author : thuan
	@Date : May 15, 2021
*/

package assignment_901.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment_901.entities.Customer;

public class Test {
	public static List<Customer> customers = new ArrayList<Customer>();

	@SuppressWarnings("resource")
	public static List<Customer> createCustomer() {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		String checkContinue;
		do {
			System.out.println("Enter Customer " + i + ": ");
			Customer customer = new Customer();
			customer.input();
			customers.add(customer);
			i++;
			
			System.out.print("Do you want to continue enter value for the Customer (n/N to stop)? ");
			checkContinue = scanner.nextLine();
		} while (!"n".equalsIgnoreCase(checkContinue));
		return customers;
	}
	
	public static void findAll() {
		System.out.println("Showw all customers");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	
//	public static void display(List<Customer> customers) {
//		System.out.println("Display");
//		for (Customer customer : customers) {
//			System.out.println(customer);
//		}
//	}
	
	public static void search(String phone) {
		System.out.println("Search by phone: " + phone);
		for (Customer customer : customers) {
			if (customer.getPhone().equals(phone))
				System.out.println(customer);
		}
	}
	
	public static void remove(String phone) {
		System.out.println("Remove by phone: " + phone);
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getPhone().equals(phone)) {
				System.out.println(customers.get(i));
				customers.remove(i);
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		String checkContinue = "";
		Scanner scanner = new Scanner(System.in);
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
				createCustomer();
				break;
			case "2":
				findAll();
				break;
			case "3":
				System.out.println("Enter phone number for search: ");
				String phone = scanner.nextLine();
				search(phone);
				break;
			case "4":
				System.out.println("Enter phone number for remove: ");
				phone = scanner.nextLine();
				remove(phone);
				break;
			case "5":
				checkContinue = "n";
				break;
			}
			System.out.println();
		} while (!"n".equalsIgnoreCase(checkContinue));
		System.out.println("Bye !");
		scanner.close();
//		customers.add(new Customer("thuan1", "12", "11", new ArrayList<Order>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
//		customers.add(new Customer("thuan2", "12", "12", new ArrayList<Order>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
//		customers.add(new Customer("thuan3", "14", "13", new ArrayList<Order>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
//		customers.add(new Customer("thuan4", "15", "14", new ArrayList<Order>(Arrays.asList(new Order("1", new Date("11/11/1111")), new Order("2", new Date("11/11/1111"))))));
//		customers = createCustomer();
	}
}
