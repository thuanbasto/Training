/*
	@Author : thuan
	@Date : May 6, 2021
*/

package a1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class hello1 extends hello5{
	int j;
	int k;
	static int si = 10;
	int i;
	
	public hello1() {
		i = 1;
	}

	public void apply() {
		System.out.println("ok1");
	}
	
	public double me(byte by) {
		double d = 10;
		return (long) by / d* 3;
	}
	
	public static void m1(CharSequence s) {
		System.out.println("char");
	}
	
	public static void m1(Object s) {
		System.out.println("object");
	}
	
	public static void m1(String s) {
		System.out.println("String");
		
	}
	
	public static void main(String[] args) {
		hello1 h = new hello2();
		h.apply();
		System.out.println(h.si);
		int[] arr2[] = new int[3][];
		LocalDate date = LocalDate.parse("2018-11-11");
		date.minusYears(-5);
		System.out.println(date.minusYears(-5));
		m1(null);
		System.out.println(new Boolean("abc"));
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("A");
		list.add("A");
		list.remove("A");
		System.out.println(list.size());
	}
}

class hello2 extends hello1{
	static int si = 20;
	public hello2() {
		
	}
	
	public void apply(int a) {
		System.out.println("ok2");
	}
}





interface hello4{
	void a();
	default void b() {
		
	};
}
abstract class hello5{
	int a = 1;
	
}
abstract class hello6 extends hello1{
	int a = 1;
	
}