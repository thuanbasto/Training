
public class SquareNumber {
	public static int squareNumber(int n){
		if (n == 0 || n == 1) {
			return 1;
		}
//		if (Math.pow((int)Math.sqrt(n),2) == n) return 1;
		for (int i = (int) Math.sqrt(n); i >= 2; i--) {
			int temp = (int) Math.pow(i, 2);
			if (n % temp == 0) {
				return n/temp;
			}
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(squareNumber(100));
	}

}
