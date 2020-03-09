
public class IsSquareFreeInteger {
	public static boolean checkSNT(int n) {
		if (n == 2) return true;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0) return false;
		}
		return true;
	}
	public static boolean isSquareFreeInteger(int n){
		for (int i = 2; i <= n; i++) {
			if (n%i == 0) {
				if (checkSNT(i)) {
					n/=i;
				}
			}
		}
		if (n == 1) return true;
		return false;
	}

	public static void main(String[] args) {

	}

}
