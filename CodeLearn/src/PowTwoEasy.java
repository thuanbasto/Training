
public class PowTwoEasy {
	public static long factorial(int n) {
		if (n == 0) {
			return 1;
		}
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	public static int powTwoEasy(int n) {
		int result = 0;
		long temp = factorial(n);
		for (int i = 0; i < n; i++) {
			if (temp/(long)Math.pow(2, i) % 2 != 0) {
				return i;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(powTwoEasy(4));
	}

}
