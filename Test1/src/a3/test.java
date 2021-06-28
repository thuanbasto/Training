package a3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class test {
	public static void main(String[] args) {
//		Set<Student> students = new HashSet<Student>();
//		students.add(new Student("Ducky", 6));
//		students.add(new Student("Clover", 8));
//		students.add(new Student("Hugo", 7));
//		students.add(new Student("Clover", 8));
//		System.out.println(students);
		
//		Set<String> list = new HashSet<String>();
//		list.add("Hugo");
//		list.add("Ducky");
//		list.add("Clover");
//		list.add("Clover");
//		System.out.println(list);
		
		Set<Object> set = new TreeSet<>();
		set.add(new Integer(1));
		set.add("2");
		set.add("1");
		
		Iterator it = set.iterator();
		while (it.hasNext()) System.out.print(it.next() + " ");
	}
}
class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "[" + this.name + ", " + this.age + "]";
	}
}