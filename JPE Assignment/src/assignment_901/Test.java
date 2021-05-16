/*
	@Author : thuan
	@Date : May 15, 2021
*/

package assignment_901;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	@SuppressWarnings("resource")
	public static List<Customer> createCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
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
	
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>();
		customers = createCustomer();
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}
}
