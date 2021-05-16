/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_702;

import java.util.Scanner;

public class Student extends Person{
	public String studentId;
	public double theory;
	public double practice;
	
	public Student() {
	}
	
	public Student(String fullName, String gender, String phone, String email, String studentId, double theory, double practice) {
		super(fullName, gender, phone, email);
		this.studentId = studentId;
		this.theory = theory;
		this.practice = practice;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t Student ID: " + studentId + "\t Theory: " + theory + "\t Practice: " + practice;
	}
	
	public double calculateFinalMark() {
		return (theory + practice)/2;
	}

	@SuppressWarnings("resource")
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (studentId == null) {
					System.out.print("Enter student Id: ");
					this.studentId = scanner.nextLine();
				}
				if (theory == 0) {
					System.out.print("Enter theory: ");
					double theory = Double.valueOf(scanner.nextLine());
					if (Validator.isTheoryOrPactice(theory)) 
						this.theory = theory;
					else
						throw new Exception("Theory is incorret. Must be greater 0 and less than 10!");
				}
				if (practice == 0) {
					System.out.print("Enter practice: ");
					double practice = Double.valueOf(scanner.nextLine());
					if (Validator.isTheoryOrPactice(practice)) 
						this.practice = practice;
					else
						throw new Exception("Practice is incorret. Must be greater 0 and less than 10!");
				}
				
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
}
