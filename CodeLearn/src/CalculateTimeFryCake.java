
public class CalculateTimeFryCake {
	public static int calculateTimeFryCake(int n, int k){
		if (n <= k){
            return 10;
        }
		int result = 2*n/k*5;
		if (2*n%k != 0) {
			result = result+5;
		}
		return result;
	}
	public static int calculateTimeFryCake2(int n, int k){
		if (n <= k){
            return 10;
        }
        double temp = (double)(n*2)/k;
		int result = (int) temp;
		System.out.println(temp);
		if (temp <= 3.0) {
			return result*5+5;
		}
		if (temp > result) {
			result ++;
		}
		return result*5;
	}

	public static void main(String[] args) {
		System.out.println(calculateTimeFryCake(18,17));
		System.out.println(calculateTimeFryCake2(18,17));
	}

}
