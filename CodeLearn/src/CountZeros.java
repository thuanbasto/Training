
public class CountZeros {
	public static int countZeroDigit(int a, int b){
		int result = 0;
		for (int i = a; i <= b; i++) {
			String temp = ""+i;
			for (int j = 0; j < temp.length(); j++) {
				if (Integer.valueOf(temp.charAt(j)) == 48) result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(countZeroDigit(0, 10));
	}

}
