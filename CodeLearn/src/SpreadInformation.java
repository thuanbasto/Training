import java.util.Arrays;

public class SpreadInformation {
	public static int spreadInformation(int[] a, int k) {
		int result = 1;
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if (Math.abs(a[i] - a[i+1]) > k) {
				result++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int a[] = {1, 3, 2, 5, 10, 8};
		int k = 2;
		System.out.println(spreadInformation(a, k));
	}

}
