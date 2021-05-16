/*
	@Author : thuan
	@Date : May 15, 2021
*/

package a1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class test {
	public static void main(String[] args) {
		String date = "11/11/21113";
		Date a = null;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		try {
			a = dateFormat.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(dateFormat.format(a));
	}
}
