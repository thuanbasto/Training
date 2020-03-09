public class CountNumber {
	public static boolean checkSNT(long n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int number(long x){
		int result = 0;
		long temp = x;
		int count = 2;
		
		if (x > 100000 || !checkSNT(x)) {
			return 0;
		} else if (x*2 >= 100000) return 1;
		while (temp <= 100000) {
			boolean check = true;
			for (int i = 2; i < x; i++) {
				if (temp % i == 0) {
					check = false;
					break;
				}
			}
			temp = x*count++;
			if (!check) continue;
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(number(33757));
	}

}
