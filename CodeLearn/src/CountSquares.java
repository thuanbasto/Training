
public class CountSquares {
	public static int countSquares(long m, long n){
		long result = m*n;
		int count = 2;
		while (m >= count && n >= count) {
			System.out.println(result);
			if (m % count != 0 && n % count !=0) {
				result += (m/count+1)*(n/count+1);
			} else if (m % count != 0) {
				result += (m/count+1)*(n/count);
			} else if (n % count !=0) {
				result += (m/count)*(n/count+1);
			} else {
				result += (m/count)*(n/count);
			}
			count++;
		}
		int a = (int)result%1000000007;
		return a;
	}

	public static void main(String[] args) {
		System.out.println(countSquares(4,7));
	}

}
