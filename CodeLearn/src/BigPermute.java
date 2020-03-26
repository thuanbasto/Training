
public class BigPermute {
	public static int bigPermute(int n){
		long temp = 1;
		long d = 1000000007;
		for (long i = n; i > 1; i--) {
			temp = temp*i%d;
		}
		return (int)temp;
	}

	public static void main(String[] args) {

	}

}
