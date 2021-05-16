/*
	@Author : thuan
	@Date : May 10, 2021
*/

package lab_401;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int sum = 0;
		double average;
		int lowerBound = 1;
		int upperBound = 100;
		
		for (int number = lowerBound; number <= upperBound; number++) {
			sum += number;
		}
		average = sum / upperBound;
		System.out.println("Average of all 100 first numbers: " + average);
	}
}
