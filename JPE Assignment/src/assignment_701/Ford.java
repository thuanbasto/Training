/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_701;

public class Ford extends Car{
	public int year;
	public int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}

	@Override
	double getSalePrice() {
		return regularPrice - manufacturerDiscount;
	}

}
