package Example_Final.exception;

public class InvalidFullNameException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InvalidFullNameException(String s) {
		super(s);
	}
}
