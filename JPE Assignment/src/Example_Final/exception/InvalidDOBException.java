package Example_Final.exception;

public class InvalidDOBException extends Exception{
	private static final long serialVersionUID = 1L;

	public InvalidDOBException(String s) {
		super(s);
	}
}
