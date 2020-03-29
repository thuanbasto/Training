import java.util.ArrayList;
import java.util.List;

public class MaxSumArray2 {
	public static int[] maxSumArray(int[] a, int k) {
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int arr[] = new int[k];
		
		for (int i = 0; i < a.length; i++) {
			if (i >= k) {
				sum += a[i];
				sum -= list.remove(0);
				list.add(a[i]);
				if (sum > max) {
					max = sum;
					int index = 0;
					for (Integer s : list) {
						arr[index++] = s;
					}
				}
			} else {
				sum += a[i];
				list.add(a[i]);
				if (i == k-1) {
					max = sum;
					int index = 0;
					for (Integer s : list) {
						arr[index++] = s;
					}
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int a[] = {3,6,7,6,3,8,5};
		a = maxSumArray(a, 4);
		for (int i : a) {
			System.out.print(i +" ");
		}
	}

}
