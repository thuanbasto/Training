/*
	@Author : thuan
	@Date : May 15, 2021
*/

package assignment_901;

import java.text.SimpleDateFormat;

public class Validator {
	public static boolean isPhone(String phone) {
		try {
			Integer.valueOf(phone);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean isNumber(String number) {
		try {
			Integer.valueOf(number);
		} catch (Exception e) {
			return false;
		}
		return number.length() == 10;
	}
	
	public static boolean isDate(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(date);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
