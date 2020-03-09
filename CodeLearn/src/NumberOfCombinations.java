
public class NumberOfCombinations {
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
	public static long numberOfCombinations(int n, int k){
	    long result = factorial(n)/(factorial(k)*(factorial(n-k)));
		return result;
	}

	public static void main(String[] args) {	
		System.out.println(numberOfCombinations(35, 33));
	}

}
