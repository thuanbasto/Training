/*
	@Author : thuan
	@Date : May 9, 2021
*/

package assignment_401;

public class Exercise2 {
	public static void maximum(Integer[] list) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		if (list.length < 2) {
			System.out.println("Lenght of array must be larger 2!");
			return;
		}
		
		for (Integer i : list) {
			if (i > max) {
				secondMax = max;
				max = i;
			}
			if (i != max && secondMax < i) secondMax = i;
		}
		System.out.println("Max :" + max);
		System.out.println("Second max :" + secondMax);
	}
	public static void main(String[] args) {
		Integer list[] = {1};
		maximum(list);
	}
}
