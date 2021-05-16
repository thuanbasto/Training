/*
	@Author : thuan
	@Date : May 6, 2021
*/

package a1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class hello1 extends hello5{
	int j;
	int k;
	public static int ABC =  10;
	static int si = 10;
	int i;
	
	public hello1() {
	}
	
	public hello1(int j) {
	}

	public hello1(int j2, int k2) {
	}

	public void apply(int i) {
		System.out.println("ok");
	}
	
	public double me(byte by) {
		double d = 10;
		return (long) by / d* 3;
	}
	
	public static void main(String[] args) {
		Set<Integer> a = new HashSet<Integer>(Arrays.asList(3,5,4));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(3,5,4));
		Set<Integer> c = new LinkedHashSet<Integer>(Arrays.asList(3,5,4));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Map<Integer,Integer> d = new HashMap<Integer,Integer>();
		Map<Integer,Integer> e = new TreeMap<Integer,Integer>();
		Map<Integer,Integer> f = new LinkedHashMap<Integer,Integer>();
		
		d.put(3, 5);d.put(5, 4);d.put(4, 3); 
		e.put(3, 5);e.put(5, 4);e.put(4, 3);
		f.put(3, 5);f.put(5, 4);f.put(4, 3);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}
}

class hello2 extends hello1{
	public hello2(int j) {
		
	}
	
	public hello2(int j, int k) {
		super(j,k);
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