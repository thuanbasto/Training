/*
	@Author : thuan
	@Date : May 7, 2021
*/

package lab_202;

public class Child extends Parent implements MyInterface{
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		Parent obj2 = new Child();
		
		System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent)); // t
		System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child)); // f
		System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface)); // f
		System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent)); // t
		System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child)); // t
		System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface)); // t
	}
	
	
}
