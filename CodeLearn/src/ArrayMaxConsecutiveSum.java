
public class ArrayMaxConsecutiveSum {
	public static int arrayMaxConsecutiveSum(int[] a, int k) {
		int temp = 0;
		int max = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (count < k) {
				count++;
				temp += a[i];
			} else {
				temp = temp + a[i] - a[i-k];
			}
			if (temp > max) max = temp;
		}	
		return max;
	}
	public static void main(String[] args) {
		int a[] = {2, 3, 5, 1, 6};
		System.out.println(arrayMaxConsecutiveSum(a, 2));
	}

}
