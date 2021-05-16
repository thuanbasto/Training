/*
	@Author : thuan
	@Date : May 8, 2021
*/

package assignment_301;

public class Exercise1 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Average of all 100 first numbers: " + sum/100);
	}
}
