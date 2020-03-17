
public class SumMod {
	public static int sumMod(long n, long m){
		long a = (int)(m/n);
		long b = m%n;
		long ans = ((n * (n - 1) / 2) * a + (b * (b + 1)) / 2) % 1000000007;
		return (int)ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
