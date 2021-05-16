/*
	@Author : thuan
	@Date : May 7, 2021
*/

package assignment_101;

import java.util.Scanner;

public class Exercise5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter the radius: ");
		double radius = new Scanner(System.in).nextDouble();
		System.out.println("Perimeter is = " + Math.PI * radius * 2);
		System.out.println("Area is = " + Math.PI * radius * radius);
	}
}
