import java.util.Arrays;

public class MaxPoint2 {
	long maxPoint(int[] a, int k) {
		long result = k;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (result >= a[i]) {
				result += a[i];
			}
		}
		return result;
	}
}
