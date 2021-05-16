/*
	@Author : thuan
	@Date : May 12, 2021
*/

package assignment_602;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle[] rectangles;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the lenght of array: ");
		rectangles = new Rectangle[Integer.valueOf(scanner.nextLine())];

		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle();
			System.out.println("Enter value for reactangle at index " + (i + 1) + " in array");

			try {
				System.out.print("Enter the lenght: ");
				int lenght = Integer.valueOf(scanner.nextLine());
				System.out.print("Enter the width: ");
				int width = Integer.valueOf(scanner.nextLine());

				rectangles[i].setLengthWidth(lenght, width);
			} catch (Exception e) {
				System.err.println("Wrong value");
				i--;
			}

		}
		scanner.close();
		
		// 2
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
		
		// 3 
		int maxArea = Integer.MIN_VALUE;
		// get max area
		for (Rectangle rectangle : rectangles) {
			if (rectangle.calculateArea() > maxArea) maxArea = rectangle.calculateArea();
		}
		// print reactangle has area equal max area
		System.out.println("These reactangle have biggest area");
		for (Rectangle rectangle : rectangles) {
			if (rectangle.calculateArea() == maxArea) System.out.println(rectangle);
		}
		
		// get 4
		int minPerimeter = Integer.MAX_VALUE;
		// get minimum perimeter
		for (Rectangle rectangle : rectangles) {
			if (rectangle.calculatePerimeter() < minPerimeter) minPerimeter = rectangle.calculatePerimeter();
		}
		// print reactangle has area equal max area
		System.out.println("These reactangle have minimum perimeter");
		for (Rectangle rectangle : rectangles) {
			if (rectangle.calculatePerimeter() == minPerimeter) System.out.println(rectangle);
		}
		
	}
}
