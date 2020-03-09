
public class CountCaseWin {
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
	public static int countCaseWins(int n){
		double result = 0;
		double a = 0;
		double b = 0;
		int k = (n-1)/2+1;
		a = factorial(n)/factorial(k);
		b = 1/factorial(n-k);
		a = a*b;
		result = (int)a;
		return (int) result;
	}

	public static void main(String[] args) {
		System.out.println(countCaseWins(35));
		System.out.println(factorial(35	));
	}	

}
