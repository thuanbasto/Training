
public class CheckStrongPassword {
	public static boolean checkStrongPassword(String password){
		return password.matches(".*[A-Z].*") && password.matches(".*[!@#$%^&*()-+].*") &&
				password.matches(".*[a-z]*") && password.matches(".*\\d*") && password.length() > 6; 
	}	

	public static void main(String[] args) {
		System.out.println(checkStrongPassword("a123123"));
	}

}
