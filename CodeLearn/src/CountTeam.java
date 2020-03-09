
public class CountTeam {
	public static long convertBinaryToDec(String number) {
		long sum = 0;
		for(int i=0;i<number.length();i++) {
			if (number.charAt(i) == '1') {
				sum+= Math.pow(2, number.length()-1-i);
			}
		}
		return sum;
	}
	public static long factorial(long n) {
		if (n == 0) {
			return 1;
		}
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public static String countTeam(String s)
	{
		long number = convertBinaryToDec(s);
		System.out.println(number);
		if (number < 2) {
			return "even";
		} else {
			if (number % 3 == 0) {
				return "even";
			}
		}
	    return "odd";
	}

	public static void main(String[] args) {
		System.out.println(countTeam("1001"));
		System.out.println(countTeam("00111100011011011"));
		System.out.println(countTeam("100010100110"));
		System.out.println(countTeam("111110000010001010"));
	}	

}
