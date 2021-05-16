/*
	@Author : thuan
	@Date : May 7, 2021
*/

package assignment_201;

public class Exercise4 {
	/** 
	 * surfaceArea = 2 * PI * radius^2 + 2 * PI * radius * height
	 * baseArea = 2 * PI * radius * height
	 * Volume = PI * radius^2 * height
	*/ 
	public static void main(String[] args) {
		double radius = 5.2;
		double height = 9.76;
		double surfaceArea = (2 * Math.PI * Math.pow(radius,2)) + (2 * Math.PI * radius * height); 
		double baseArea = 2 * Math.PI * radius * height;
		double volume = Math.PI * Math.pow(radius,2) * height;
		
		System.out.println("Surface area = " + surfaceArea); 
		System.out.println("Base area = " + baseArea);
		System.out.println("Volume = " + volume);
		
	}
}
