package assignment_1001.dao;

import java.util.List;

import assignment_1001.entity.LineItem;

public interface LineItemDAO {
	public List<LineItem> getLineItems();
	public LineItem getLineItem(int lineItemId);
	public boolean add(LineItem lineItem);
	public void update(LineItem lineItem);
	public void delete(int lineItemId);
	public List<LineItem> getAllItemsByOrderId(int orderId);
	public Double computeOrderTotal(int orderId);
}
