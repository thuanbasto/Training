package assignment_901.service;

import java.util.List;
import java.util.Scanner;
import static assignment_901.main.Test.customers;

import assignment_901.entities.Customer;

public class CustomerService {
	
	
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
	
	public static void display() {
		System.out.println("Showw all customers");
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
	
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
}
