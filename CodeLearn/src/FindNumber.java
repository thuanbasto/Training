
public class FindNumber {
	public static boolean checkSNT (int b) {
		for (int i=2;i<=Math.sqrt(b);i++) {
			if (b % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int findNumber(int n){
		int count = 0;
		for (int i = 2;; i++) {
			if (checkSNT(i)) {
				count++;
			}
			if (count == n) return n*i;
		}
	}

	public static void main(String[] args) {

	}

}
