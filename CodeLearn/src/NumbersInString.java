
public class NumbersInString {
	public static int numbersInString(String str){
		int result = 0;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 48 && str.charAt(i) < 58)
				sum++;
			else {
				if (sum > 0) {
					for (int j = 1; j <= sum; j++) {
						result += j;
					}
				}
				sum = 0;
			}
		}
		if (sum > 0) {
			for (int j = 1; j <= sum; j++) {
				result += j;
			}
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
