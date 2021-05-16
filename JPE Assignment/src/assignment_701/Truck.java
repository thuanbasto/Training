/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_701;

public class Truck extends Car{
	public int weight;
	
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	double getSalePrice() {
		return weight > 2000 ? regularPrice * 0.9 : regularPrice * 0.8;
	}
}
