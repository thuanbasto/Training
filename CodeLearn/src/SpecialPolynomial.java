
public class SpecialPolynomial {
	public static int specialPolynomial(int x, int n){
		int k = 0;
		int sum = 0;
		while (sum + Math.pow(x, k) <= n) {
			sum += Math.pow(x, k);
			k++;
		}
		return k-1;
	}

	public static void main(String[] args) {
		System.out.println(specialPolynomial(10,11));
	}

}
