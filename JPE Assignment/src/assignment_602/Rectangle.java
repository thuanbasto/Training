/*
	@Author : thuan
	@Date : May 12, 2021
*/

package assignment_602;

public class Rectangle implements Shape{
	private int length;
	private int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public int calculatePerimeter() {
		return 2 * (length + width);
	}

	@Override
	public int calculateArea() {
		return length * width;
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public void setLengthWidth(int length, int width) {
		this.length = length;
		this.width = width;
	}

	
	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Lenght: " + length + "\t Width: " + width + "\t Area: " + calculateArea() + "\t Perimeter: " + calculatePerimeter();
	}
}
