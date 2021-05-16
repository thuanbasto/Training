/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_701;

public class Sedan extends Car{
	public int length;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}
	
	@Override
	double getSalePrice() {
		return length > 20 ? regularPrice * 0.95 : regularPrice * 0.90;
	}

}
