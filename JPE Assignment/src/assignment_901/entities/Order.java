/*
	@Author : thuan
	@Date : May 15, 2021
*/

package assignment_901.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import assignment_901.utils.Validator;

public class Order {
	private String number;
	private Date date;
	
	public Order() {
	}

	public Order(String number, Date date) {
		super();
		this.number = number;
		this.date = date;
	}

	@SuppressWarnings({ "resource", "deprecation" })
	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (number == null) {
					System.out.print("Enter number (10): ");
					String number = scanner.nextLine();
					if (Validator.isNumber(number)) 
						this.number = number;
					else
						throw new Exception("Number is incorret. Try again");
				}
				if (date == null) {
					System.out.print("Enter date (dd/MM/yyyy): ");
					String date = scanner.nextLine();
					if (Validator.isDate(date)) 
						this.date = new Date(date);
					else
						throw new Exception("Date is incorret. Try again");
				}
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return "[number=" + number + ", date=" + dateFormat.format(date) + "]";
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
