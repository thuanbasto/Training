/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_702;

import java.util.Scanner;


public abstract class Person {
	public String fullName;
	public String gender;
	public String phone;
	public String email;
	
	public Person() {
	}
	
	public Person(String fullName, String gender, String phone, String email) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Name: " + fullName + "\t Gender: " + gender + "\t Phone: " + phone + "\t Email: " + email;
	}

	@SuppressWarnings("resource")
	public void input() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (fullName == null) {
					System.out.print("Enter full name: ");
					this.fullName = scanner.nextLine();
				}
				if (gender == null) {
					System.out.print("Enter gender: ");
					this.gender = scanner.nextLine();
				}
				if (phone == null) {
					System.out.print("Enter phone: ");
					this.phone = scanner.nextLine();
				}
				if (email == null) {
					System.out.print("Enter email: ");
					String email = scanner.nextLine();
					if (Validator.isEmail(email)) 
						this.email = email;
					else
						throw new Exception("Email is incorret. Try again");
				}
				
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
