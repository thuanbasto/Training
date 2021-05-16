/*
	@Author : thuan
	@Date : May 7, 2021
*/

package assignment_101;

import java.util.Scanner;

public class Exercise7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter the first integer: ");
		double first = new Scanner(System.in).nextDouble();
		System.out.print("Enter the second integer: ");
		double second = new Scanner(System.in).nextDouble();
		
		System.out.println(first + " != " + second + " = " + (first != second));
		System.out.println(first + " < " + second + " = " + (first < second));
		System.out.println(first + " <= " + second + " = " + (first <= second));
	}
}
