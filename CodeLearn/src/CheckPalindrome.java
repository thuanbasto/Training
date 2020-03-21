
public class CheckPalindrome {
	public static boolean checkPalindrome(String inputString){
		int length = inputString.length()/2;
		for (int i = 0; i < length; i++) {
			if (inputString.charAt(i) != inputString.charAt(inputString.length()-1-i))
				return false;
		}
		return true;
	}

 	public static void main(String[] args) {

	}

}
