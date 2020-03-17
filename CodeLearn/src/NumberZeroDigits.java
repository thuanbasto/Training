
public class NumberZeroDigits {
	public static long numberZeroDigits(long n){
		long result = 0;
		while (n != 0) {
			result += n/5;
			n/=5;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(numberZeroDigits(100));
	}

}
