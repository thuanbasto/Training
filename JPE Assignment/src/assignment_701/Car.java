/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_701;

public abstract class Car {
	public int speed;
	public double regularPrice;
	public String color;

	public Car(int speed, double regularPrice, String color) {
		super();
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	abstract double getSalePrice();
}
