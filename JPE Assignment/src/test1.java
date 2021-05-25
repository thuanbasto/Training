

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.StringTokenizer;

import assignment_1001.dao.OrderDAO;
import assignment_1001.dao.impl.OrderDAOImpl;
import assignment_1001.entity.Order;

public class test1 {
	public static OrderDAO orderDAO = new OrderDAOImpl();
	public static void main(String[] args) throws IOException {
		read();
	}
	
	@SuppressWarnings("deprecation")
	public static void read() {
		StringTokenizer tokenizer;
		try (FileReader fileIn = new FileReader("data.csv"); BufferedReader reader = new BufferedReader(fileIn)) {
			String str;
			while ((str = reader.readLine()) != null) {
				Order order = new Order();
				tokenizer = new StringTokenizer(str, ",");
				while (tokenizer.hasMoreTokens()) {
					order.setOrderDate(new Date(tokenizer.nextToken()));
					order.setCustomerId(Integer.valueOf(tokenizer.nextToken()));
					order.setEmployeeId(Integer.valueOf(tokenizer.nextToken()));
					order.setTotal(Double.valueOf(tokenizer.nextToken()));
		        }
				System.out.println(order);
				orderDAO.add(order);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
