
public class CountNumberLucky1 {
	public static int countNumberLucky1(int n){
		int result = 0;
		for (long i = n%7; i <= n; i+=7) {
			if (i%4 == 0) result++;
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
