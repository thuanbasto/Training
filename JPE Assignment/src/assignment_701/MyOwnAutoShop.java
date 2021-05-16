/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_701;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Sedan sedan1 = new Sedan(100, 2000, "Red", 100);
		Sedan sedan2 = new Sedan(102, 4000, "Yellow", 600);
		Sedan sedan3 = new Sedan(103, 6000, "Blue", 200);
		
		Ford ford1 = new Ford(200, 3000, "Red", 2010, 100);
		Ford ford2 = new Ford(220, 5000, "Blue", 2021, 1030);
		
		Truck truck1 = new Truck(400, 2000, "Blue", 2000);
		Truck truck2 = new Truck(500, 23000, "Black", 3000);
		
		Car[] cars = new Car[7];
		cars[0] = sedan1;
		cars[1] = sedan2;
		cars[2] = sedan3;
		cars[3] = ford1;
		cars[4] = ford2;
		cars[5] = truck1;
		cars[6] = truck2;
		
		for (Car car : cars) {
			System.out.println("Sale Price: " +  car.getSalePrice());
		}
	}
}
