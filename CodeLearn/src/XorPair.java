
public class XorPair {
	public static long xorPair(int[] a){
		long odd = 0;
		long even = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) even++;
			else odd++;
		}
		return odd*even;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
