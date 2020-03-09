
public class MaxSumArray {
	public static int maxSumArray(int[] a){
		int result = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] + result > 0) {
				result = a[i] + result;
				if (result > max) max = result;
			} else {
				if (result > max) max = result;
				result = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
	}

}
