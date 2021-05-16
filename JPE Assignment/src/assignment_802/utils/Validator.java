/*
	@Author : thuan
	@Date : May 15, 2021
*/

package assignment_802.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

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
			Date d = dateFormat.parse(date);
			dateFormat = new SimpleDateFormat("yyyy");
			if (Integer.valueOf(dateFormat.format(d)) < 1000) return false;
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
