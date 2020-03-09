
public class CountIngredientMul {
	public static boolean checkSNT (int b) {
		if (b <= 2) return true;
		for (int i=2;i<=Math.sqrt(b);i++) {
			if (b % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int countIngredientMul(int n){
		int result = 0;
		if (n == 1) return 1;
		if (checkSNT(n)) return 2;
		int length = n/2;
		for (int i = 1; i <= length; i++) {
			if (n == 1) break;
			if (n % i == 0) {
				result++;
				n/=i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(countIngredientMul(10));
	}

}
