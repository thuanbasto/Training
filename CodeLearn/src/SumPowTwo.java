
public class SumPowTwo {
	public static int sumPowTwo(long n){   
		int result = 0;
		long arr[] = new long[1023];
		for (int i = 0; i < 1023; i++) {
			arr[i] = (long) Math.pow(2, i);
		}
		int count = 1022;
		while (n > 0) {
			if (n < arr[count]) {
				count--;
			} else {
				n -= arr[count];
				count--;
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sumPowTwo(27));
	}

}
