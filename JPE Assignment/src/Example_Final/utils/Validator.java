package Example_Final.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Example_Final.exception.InvalidDOBException;
import Example_Final.exception.InvalidFullNameException;
import Example_Final.exception.InvalidPhoneNumberException;

public class Validator {
	public static boolean isFullName(String name) throws InvalidFullNameException {
		if (name.length() > 50 || name.length() < 10) {
			throw new InvalidFullNameException("Name length is more than 50 and at least 10");
		}
		return true;
	}
	
	public static boolean isDOB(String dob) throws InvalidDOBException{
		try {
			LocalDate.parse(dob,DateTimeFormatter.ofPattern("d/M/yyyy"));
		} catch (Exception e) {
			throw new InvalidDOBException("Date of birth is invalid");
		}
		return true;
	}
	
	public static boolean isPhone(String phone) throws InvalidPhoneNumberException{
		if (phone.matches("^((090)|(098)|(091)|(031)|(035)|(038))\\d{7}$")) return true;
		else throw new InvalidPhoneNumberException("Phone is invalid");
	}
	
}
