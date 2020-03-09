
public class ChangeNumbers {
	public static int changeNumbers(int n, int k){
		long temp = n;
		while(k > 0) {
			if (temp % 2 ==0) temp /=2;
			else temp = temp*3+1;
			k--;
		}
		return (int)temp;
	}

	public static void main(String[] args) {
		System.out.println(changeNumbers(123, 4));
	}

}
