/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_702;

import java.util.Scanner;

public class Teacher extends Person{
	public double basicSalary;
	public double subsidy;
	
	public Teacher() {
	}
	
	public Teacher(String fullName, String gender, String phone, String email, double basicSalary, double subsidy) {
		super(fullName, gender, phone, email);
		this.basicSalary = basicSalary;
		this.subsidy = subsidy;
	}
	
	public double calculateSalary() {
		return basicSalary + subsidy;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t Basic salary: " + basicSalary + "\t Subsidy: " + subsidy;
	}
	
	@SuppressWarnings("resource")
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (basicSalary == 0) {
					System.out.print("Enter basic salary: ");
					this.basicSalary = Double.valueOf(scanner.nextLine());
				}
				if (subsidy == 0) {
					System.out.print("Enter subsidy: ");
					this.subsidy= Double.valueOf(scanner.nextLine());
				}
				
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
