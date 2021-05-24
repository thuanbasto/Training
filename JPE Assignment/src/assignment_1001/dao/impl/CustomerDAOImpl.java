package assignment_1001.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import assignment_1001.dao.CustomerDAO;
import assignment_1001.entity.Customer;
import assignment_1001.utils.DatabaseConnection;

public class CustomerDAOImpl implements CustomerDAO{
	
	@Override
	public List<Customer> getCustomers() {
		String sql = "SELECT * FROM Customer";
		List<Customer> customers = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection();
				Statement statement = conn.createStatement();
				ResultSet rs = statement.executeQuery(sql);) {
			while (rs.next()) {
				Customer customer = new Customer(rs.getInt("customer_id"), rs.getString("customer_name"));
				customers.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	
//	DELIMITER $$
//	DROP PROCEDURE `sms`.`addCustomer`;
//	CREATE PROCEDURE addCustomer (customerName nvarchar(255), OUT addStatus boolean)
//	MODIFIES SQL DATA
//	BEGIN
//		INSERT INTO Customer (customer_name) VALUES (customerName);
//	    IF (ROW_COUNT() > 0) THEN
//			SET addStatus = true;
//		ELSE
//			SET addStatus = false;
//		END IF;
//	END $$
//	DELIMITER ;
	
	@Override
	public boolean add(Customer customer) {
		String sql = "{CALL addCustomer(?, ?)}";
		try (Connection conn = DatabaseConnection.getConnection();CallableStatement statement = conn.prepareCall(sql);) {
			statement.setString(1, customer.getCustomerName());
			statement.execute();
			
			return statement.getBoolean(2);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Customer customer) {
		String sql = "UPDATE Customer SET customer_name = ? WHERE customer_Id = ?";
		try (Connection conn = DatabaseConnection.getConnection();PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setString(1, customer.getCustomerName());
			statement.setInt(2, customer.getCustomerId());
			int result = statement.executeUpdate();
			
			if (result > 0) return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

//	DROP PROCEDURE IF EXISTS `sms`.`deleteCustomer`;
//	DELIMITER $$
//	CREATE PROCEDURE deleteCustomer (customerId int, OUT addStatus boolean)
//	MODIFIES SQL DATA
//	BEGIN
//		DECLARE EXIT HANDLER FOR SQLEXCEPTION
//	    BEGIN
//			SET addStatus = false;
//	        ROLLBACK;
//	    END;
//		START TRANSACTION;
//		DELETE FROM LineItem WHERE order_Id IN (SELECT order_Id FROM `Order` WHERE customer_id = customerId);
//	    DELETE FROM `Order` WHERE customer_id = customerId;
//	    DELETE FROM Customer WHERE customer_id = customerId;
//		SET addStatus = true;
//	    COMMIT;
//	END $$
//	DELIMITER ;
	
	@Override
	public boolean delete(int customerId) {
		String sql = "{CALL deleteCustomer(?, ?)}";
		try (Connection conn = DatabaseConnection.getConnection();CallableStatement statement = conn.prepareCall(sql);) {
			statement.setInt(1, customerId);
			statement.execute();
			
			return statement.getBoolean(2);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
