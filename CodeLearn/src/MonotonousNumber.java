
public class MonotonousNumber {
	public static boolean monotonousNumber(String num){
		if (num.length() == 1) {
			return true;
		}
		boolean check = false;
		if (num.charAt(0) > num.charAt(1)) check = true;
		else if (num.charAt(0) == num.charAt(1)) return false;
		// 32435465768
		for (int i = 1; i < num.length()-1; i++) {
			if (check == false) {
				if (num.charAt(i) <= num.charAt(i+1)) return false;
				check = true;
			} else {
				if (num.charAt(i) >= num.charAt(i+1)) return false;
				check = false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
