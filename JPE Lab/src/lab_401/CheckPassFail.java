/*
	@Author : thuan
	@Date : May 10, 2021
*/

package lab_401;

import java.util.Scanner;

public class CheckPassFail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter value for number: ");
		int mark = scanner.nextInt();
		
		System.out.println("The mark is " + mark);
		scanner.close();
		
		if (mark >= 50)
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		
		System.out.println("------------");
		System.out.println("CHECK DONE");
	}
}
