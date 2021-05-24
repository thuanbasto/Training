package assignment_1001.service;

import java.util.List;
import java.util.Scanner;

import assignment_1001.dao.OrderDAO;
import assignment_1001.dao.impl.OrderDAOImpl;
import assignment_1001.entity.Order;

public class OrderService {
	public OrderDAO orderDAO = new OrderDAOImpl();
	
	@SuppressWarnings("resource")
	public void getAllOrdersByCustomerId() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the customer id: ");
			int id = Integer.valueOf(scanner.nextLine());
			List<Order> orders = orderDAO.getOrdersByCustomerID(id);
			System.out.println("----------- List order by customer id  ----------");
			orders.forEach(order -> System.out.println(order));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void addOrder() {
		Order order = new Order();
		order.input();
		if (orderDAO.add(order)) System.out.println("Add order successfully");
		else System.out.println("Add order failed");
	}


	@SuppressWarnings("resource")
	public void updateOrderTotal() {
		Scanner scanner = new Scanner(System.in);
		try {
			Order order = new Order();
			System.out.print("Enter order id: ");
			order.setOrderId(Integer.valueOf(scanner.nextLine()));
			System.out.print("Enter total: ");
			order.setTotal(Double.valueOf(scanner.nextLine()));
			
			if (orderDAO.updateOrderTotal(order)) System.out.println("Update order successfully");
			else System.out.println("Update order failed");
		} catch (Exception e) {
			System.out.println("Update order failed");
			e.printStackTrace();
		}
	}
}
