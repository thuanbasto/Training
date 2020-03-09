
public class RoundSqrt {
	public static int roundSqrt(int n){
		int result = 0;
		int length =(int)Math.sqrt(n);
		for (int i = length;; i++) {
			if (Math.pow(i, 2) >= n) {
				result = (int) (Math.pow(i, 2) - n);
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(roundSqrt(-10));
	}

}
