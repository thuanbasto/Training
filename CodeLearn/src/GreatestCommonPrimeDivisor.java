
public class GreatestCommonPrimeDivisor {
	public static boolean isPrime(int n){
	    if (n < 2) return false;
	    for (int i = 2;i<= Math.sqrt(n);i++){
	        if (n%i == 0) return false;
	    }
	    return true;
	}
	public static int greatestCommonPrimeDivisor(int a, int b){
		int result = 0;
		int length = 0;
		if (a>b) 
			length = b;
		else 
			length = a;
		for (int i = 2; i <= length; i++) {
			if (isPrime(i)) {
				if (a % i == 0 && b % i == 0) 
					result = i;
			}
		}
		if (result == 0) return -1;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
