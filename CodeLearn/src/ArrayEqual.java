import java.util.HashSet;
import java.util.Set;

public class ArrayEqual {
	public static int arrayEqual(int[] a){
		int result = Integer.MAX_VALUE;
		System.out.println(result);
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer i : set) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				if (sum > result) {
					break;
				}
				if (i != a[j]) {
					sum += Math.abs(i-a[j]);
				} 
			}
			if (sum < result) result = sum;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3};
		System.out.println(arrayEqual(a));
	}

}
