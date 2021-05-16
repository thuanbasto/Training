/*
	@Author : thuan
	@Date : May 8, 2021
*/

package assignment_301;

public class Exercise4 {
	public static void main(String[] args) {
		int[] myIntArray = { 43, 32, 53, 23, 12, 34, 3, 12, 43, 32 };
		int length = myIntArray.length;
		System.out.print("Original Array: ");
		for (int i = 0; i < length; i++) {
			System.out.print(myIntArray[i] + " ");
		}
		
		// reverse array
		System.out.println();
		System.out.print("Reversed Array: ");
		for (int i = 0; i < length / 2; i++) {
			myIntArray[i] = myIntArray[i] + myIntArray[length - i - 1];
			myIntArray[length - i - 1] =  myIntArray[i] - myIntArray[length - i - 1];
			myIntArray[i] = myIntArray[i] - myIntArray[length - i - 1];
		}
		for (int i = 0; i < length; i++) {
			System.out.print(myIntArray[i] + " ");
		}
	}
}
