package assignment_1001.dao;

import java.util.List;

import assignment_1001.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();
	public Customer getCustomer(int customerId);
	public boolean add(Customer customer);
	public boolean update(Customer customer);
	public boolean delete(int customerId);
}
