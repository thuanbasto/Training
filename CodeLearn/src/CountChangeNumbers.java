import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountChangeNumbers {
	public static Set<Integer> result = new HashSet<Integer>();
	public static int[] countChangeNumbers(int n, int k){
		if (k == 0) {
			result.add(n);
			int b[] = {n};
			return b;
		}
		if ((n-1)/3%2 != 0 && (n-1)%3 ==0)
			countChangeNumbers((n-1)/3, k-1);
		if (n*2%2 == 0) {
			countChangeNumbers(n*2, k-1);
		}
		
		int[] a = new int[result.size()];
		int index = 0;
		for (int i : result) {
			a[index++] = i;
		}
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {
		int a[] = countChangeNumbers(10, 5);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
