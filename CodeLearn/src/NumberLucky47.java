
public class NumberLucky47 {
	public static boolean numberLucky47(long n){
		if (n % 4 == 0 || n % 7 == 0 || n % 11 == 0) return true; 
		for (long i = n%7; i < n; i+=7) {
			if (i%4 == 0) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(numberLucky47(1000200500022554441L));
	}

}
