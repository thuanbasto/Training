package assignment_1001.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import assignment_1001.dao.LineItemDAO;
import assignment_1001.entity.LineItem;
import assignment_1001.utils.DatabaseConnection;

public class LineItemDAOImpl implements LineItemDAO{

	@Override
	public List<LineItem> getLineItems() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LineItem getLineItem(int lineItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(LineItem lineItem) {
		String sql = "INSERT INTO LineItem VALUES(?,?,?,?)";
		try (Connection conn = DatabaseConnection.getConnection();PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setInt(1, lineItem.getOerderId());
			statement.setInt(2, lineItem.getProductId());
			statement.setInt(3, lineItem.getQuantity());
			statement.setDouble(4, lineItem.getPrice());
			
			if (statement.executeUpdate() > 0) return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	@Override
	public void update(LineItem lineItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int lineItemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LineItem> getAllItemsByOrderId(int orderId) {
		String sql = "SELECT * FROM LineItem WHERE Order_Id = ?";
		List<LineItem> lineItems = new ArrayList<>();
		try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement statement = conn.prepareStatement(sql);) {
			statement.setInt(1, orderId);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int order_Id = rs.getInt("order_id");
				int product_Id = rs.getInt("product_id");
				int quantity = rs.getInt("quantity");
				double price = rs.getDouble("price");
				LineItem lineItem = new LineItem(order_Id, product_Id, quantity, price);
				lineItems.add(lineItem);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lineItems;
	}

//	DELIMITER $$
//
//	CREATE FUNCTION computeOrderTotal (order_id int)
//	RETURNS double READS SQL DATA
//	BEGIN
//		DECLARE total double;
//	    SET total = 0;
//	    SELECT SUM(price * quantity) 'total_price' INTO total FROM lineitem WHERE lineitem.order_id = order_id;
//	    RETURN total;
//	END $$
//	DELIMITER ;
	
	@Override
	public Double computeOrderTotal(int orderId) {
		String sql = "SELECT computeOrderTotal(?)";
		double total = 0;
		try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement statement = conn.prepareStatement(sql);) {
			statement.setInt(1, orderId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) total = rs.getDouble(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return total;
	}

}
