
public class PrimeSum {
	public static boolean isPrime(int n){
	    if (n < 2) return false;
	    for (int i = 2;i<= Math.sqrt(n);i++){
	        if (n%i == 0) return false;
	    }
	    return true;
	}

	public static int primeSum(int n){
		int result = 0;
		if (n < 1) return 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i))
				result+=i;
		}
		return result;
	}

}
