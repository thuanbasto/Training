package assignment_1001.dao;

import java.util.List;

import assignment_1001.entity.Order;

public interface OrderDAO {
	public List<Order> getOrders();
	public Order getOrder(int orderId);
	public boolean add(Order order);
	public boolean update(Order order);
	public boolean updateOrderTotal(Order order);
	public void delete(int orderId);
	public List<Order> getOrdersByCustomerID(int customerId);
}
