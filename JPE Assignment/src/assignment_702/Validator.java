/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_702;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validator {
	private static final String VALID_EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]" + "+\\.[a-zA-Z]{2,6}$";

	public static boolean isEmail(String emailAddress) {
		return emailAddress.matches(VALID_EMAIL_REGEX);
	}
	
	public static boolean isBirthDate(String birthDate) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		simpleDateFormat.setLenient(false);
		try {
			System.out.println(simpleDateFormat.parse(birthDate));
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	public static boolean isTheoryOrPactice(double number) {
		if (number >= 0 && number <= 10) return true;
		return false;
	}
	
}
