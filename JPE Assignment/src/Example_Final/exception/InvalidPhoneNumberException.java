package Example_Final.exception;

public class InvalidPhoneNumberException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InvalidPhoneNumberException(String s) {
		super(s);
	}
}
