import java.util.Arrays;

public class SwapArray {
	public static int swapArray(int[] a){
		int result = 0;
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		Arrays.sort(a);
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) result++;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {9,0,4,12,1};
		System.out.println(swapArray(a));
	}

}
