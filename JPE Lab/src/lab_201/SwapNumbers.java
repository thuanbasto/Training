/*
	@Author : thuan
	@Date : May 7, 2021
*/

package lab_201;

import java.util.Scanner;

public class SwapNumbers {
	public void swap(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("In swap: num1 = " + num1 + ", num2 = " + num2);
	}
	
	public static void main(String[] args) {
		SwapNumbers swapNumbers = new SwapNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number 1: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("Input number 2: ");
		int num2 = Integer.parseInt(scanner.nextLine());
		System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);
		swapNumbers.swap(num1, num2);
		System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
		scanner.close();
	}
}
