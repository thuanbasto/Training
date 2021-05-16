/*
	@Author : thuan
	@Date : May 8, 2021
*/

package assignment_301;

import java.util.Scanner;

public class Exercise2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringArray[] = null;
        boolean check = false;
        String sValue;
        
        System.out.println("Enter the lenght of array: ");
        stringArray = new String[Integer.valueOf(input.nextLine())];
        
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Enter value at index: " +(i + 1));
            stringArray[i] = input.nextLine();
        } 

        System.out.println("Enter the string you want to check: ");
        sValue = input.nextLine();
        
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(sValue)) {
                check = true;
                break;
            }
        }
        
        if (check) 
            System.out.println("Check " + sValue + " in Array: Contained!");
        else
            System.out.println("Check " + sValue + " in Array: No Contain!");
	}
}
