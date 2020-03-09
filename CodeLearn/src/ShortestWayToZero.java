
public class ShortestWayToZero {
	public static long shortestWayToZero(long n, long k){
		long result = 0;
		while (n > 0) {
			if (n % k == 0) {
				n = n/k;
			} else {
				n -= n%k;
			}
			result++;
		}
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
