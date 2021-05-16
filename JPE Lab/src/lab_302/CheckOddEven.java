/*
	@Author : thuan
	@Date : May 9, 2021
*/

package lab_302;

import java.util.Scanner;

public class CheckOddEven {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter value for number: ");
		int number = scanner.nextInt();
		
		System.out.println("The number is " + number);
		if (number % 2 == 0)
			System.out.println("Even number");
		else 
			System.out.println("Odd number");
		System.out.println("-------------");
		System.out.println("Bye");
	}
}
