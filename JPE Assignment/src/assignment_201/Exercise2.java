/*
	@Author : thuan
	@Date : May 7, 2021
*/

package assignment_201;

import java.util.Scanner;

public class Exercise2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Input first number: ");
		int a = new Scanner(System.in).nextInt();
		System.out.print("Input second number: ");
		int b = new Scanner(System.in).nextInt();
		System.out.print("Input third number: ");
		int c = new Scanner(System.in).nextInt();
		System.out.print("Input fourth number: ");
		int d = new Scanner(System.in).nextInt();

		if (a == b && a == c && a == d)
			System.out.println("Numbers are equal!");
		else 
		System.out.println("Numbers are not equal!");
	}
}
