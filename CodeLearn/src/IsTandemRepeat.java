
public class IsTandemRepeat {
	public static boolean isTandemRepeat(String inputString){
		if (inputString.length() % 2 != 0) return false;
		for (int i = 1; i <= inputString.length()/2; i++) {
			String temp = inputString.substring(0,i);
			String check = "";
			while(check.length() < inputString.length())
				check = check.concat(temp);
			if (check.equals(inputString))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
