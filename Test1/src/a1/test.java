/*
	@Author : thuan
	@Date : May 15, 2021
*/

package a1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class test {
	public static void main(String[] args) {
		String date = "11/11/2111";
		Date a = null;
		LocalDate localDate = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		try {
			a = dateFormat.parse(date);
			localDate = a.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		dateFormat = new SimpleDateFormat("yyyy");
		System.out.println(dateFormat.format(a));
		System.out.println(localDate.getYear());
		System.out.println(ZoneId.systemDefault());
		System.out.println(a.toInstant());
		System.out.println(a.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
	}
}
