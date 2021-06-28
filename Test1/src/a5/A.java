package a5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class A {
	public static void main(String args[]) {
//		LocalDate a = LocalDate.parse("1/11/1111",DateTimeFormatter.ofPattern("d/M/yyyy"));
		Date date = new Date("1/1/1111 1:1:1");
		System.out.println(date);
	}
}

class B extends A {
}
