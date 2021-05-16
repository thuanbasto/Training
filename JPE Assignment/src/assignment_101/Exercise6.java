/*
	@Author : thuan
	@Date : May 7, 2021
*/

package assignment_101;

import java.util.Scanner;

public class Exercise6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter the Width: ");
		double width = new Scanner(System.in).nextDouble();
		System.out.print("Enter the Height: ");
		double height = new Scanner(System.in).nextDouble();
		
		System.out.println("Area is = " + width * height);
		System.out.println("Perimeter is = " + 2 * (width + height));
	}
}
