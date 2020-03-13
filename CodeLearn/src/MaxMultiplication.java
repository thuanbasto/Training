
public class MaxMultiplication {
	public static int maxMultiplication(int[] a){
		long max = Long.MIN_VALUE;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]*a[j] > max)
					max = a[i]*a[j];
			}
		}
		if (max > 0) return (int)max;
		return 0;
	}

	public static void main(String[] args) {

	}

}
