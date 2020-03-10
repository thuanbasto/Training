
public class LastDigitDiffZero {
	public static int lastDigitDiffZero(int n){
		int giaithua = 1;
		for (int i = n; i > 0; i--) {
			giaithua *= i;
			while(giaithua%10 == 0) giaithua/=10;
			giaithua%=100;
		}
		return giaithua%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
