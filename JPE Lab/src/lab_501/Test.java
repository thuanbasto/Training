/*
	@Author : thuan
	@Date : May 11, 2021
*/

package lab_501;

public class Test {
	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		System.out.println("1. Create employee:");
		for (int i = 0; i < employees.length; i++) {
			System.out.println("- Enter employee[" + (i + 1) + "]: ");
			employees[i] = new Employee();
			employees[i].input();
		}
		System.out.println("2. Display employee’s salary >=1000:");
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getSalary() >= 1000) {
				System.out.println(employees[i]);
			}
		}
	}
}
