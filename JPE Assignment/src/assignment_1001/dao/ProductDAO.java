package assignment_1001.dao;

import java.util.List;

import assignment_1001.entity.Product;

public interface ProductDAO {
	public List<Product> getProducts();
	public Product getProduct(int productId);
	public void add(Product product);
	public void update(Product product);
	public void delete(int productId);
}
