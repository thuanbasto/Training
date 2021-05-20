/*
	@Author : thuan
	@Date : May 15, 2021
*/

package assignment_901.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment_901.utils.Validator;


public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String phone;
	private String address;
	private List<Order> orders;
	
	public Customer() {
	}

	public Customer(String name, String phone, String address, List<Order> orders) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.orders = orders;
	}
	
	@SuppressWarnings("resource")
	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (name == null) {
					System.out.print("Enter name: ");
					this.name = scanner.nextLine();
				}
				if (phone == null) {
					System.out.print("Enter phone: ");
					String phone = scanner.nextLine();
					if (Validator.isPhone(phone)) 
						this.phone = phone;
					else
						throw new Exception("Phone is incorret. Try again");
				}
				if (address == null) {
					System.out.print("Enter address: ");
					this.address = scanner.nextLine();
				}
				if (orders == null) {
					List<Order> orders = new ArrayList<Order>();
					int i = 1;
					String checkContinue;
					do {
						System.out.println("Enter order " + i + ": ");
						Order order = new Order();
						order.input();
						orders.add(order);
						i++;
						
						System.out.print("Do you want to continue enter value for the orders (n/N to stop)? ");
						checkContinue = scanner.nextLine();
					} while (!"n".equalsIgnoreCase(checkContinue));
					this.orders = orders;
				}
				
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	@Override
	public String toString() {
		String orderStr = "";
		for (Order order : orders) {
			orderStr += order.toString();
		}
		return "Customer[ name=" + name + ", phone=" + phone + ", address=" + address + ", Order=[" + orderStr +"] ]" ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
