/*
	@Author : thuan
	@Date : May 8, 2021
*/

package assignment_301;

import java.util.Scanner;

public class Exercise3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int array[];
		int number;
		int count = 0;
		String index = "";
		
		System.out.println("Enter the lenght of array: ");
		array = new int[Integer.valueOf(input.nextLine())];
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter value at index: " +(i + 1));
            array[i] = Integer.valueOf(input.nextLine());
            
            System.out.println("Do you want to continue(N/n)? ");
            String check = input.nextLine();
            if (check.equals("N") || check.equals("n")) break;
        } 

        System.out.println("Enter the number you want to check: ");
        number = Integer.valueOf(input.nextLine());
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
                index += i + " ";
            }
        }
        
        System.out.println("Amount of frequence: " + count);
        System.out.println("Indexs: " + index);
	}
}
