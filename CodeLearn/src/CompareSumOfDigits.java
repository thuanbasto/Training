
public class CompareSumOfDigits {
	public static int compareSumOfDigits(String input) {
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 0; i < input.length(); i++) {
			int temp = Integer.valueOf(String.valueOf(input.charAt(i)));
			if (temp % 2 == 0)
				sumEven+=temp;
			else
				sumOdd+=temp;
		}
		return sumOdd-sumEven;
	}
	public static void main(String[] args) {

	}

}
