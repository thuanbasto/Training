/*
	@Author : thuan
	@Date : May 9, 2021
*/

package lab_301;

public class MultiDimensionArrayDemo {
	public static void main(String[] args) {
		int[][] matrix = { {1,2} , {3,4} };
		System.out.println("Element at second row and first column is: " + matrix[1][0]);
		System.out.println("Number of row: " + matrix.length);
		System.out.println("Number of column " + matrix[0].length);
	}
}
