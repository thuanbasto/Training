import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthBiggestFrequency {
	public static int kthBiggestFrequency(int[] a, int k){
		if (a.length == 0 || k > 1000 || k > a.length || k <= 0) return -1;
		int arr[] = new int[100001];
		Set<Integer> set = new HashSet<Integer>();
		int number = -1;
		// count number
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) return -1;
			arr[a[i]]++;
		}
		// remove duplicate number
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				set.add(arr[i]);
		}
		// get numbers can be result and add into list
		List<Integer> list = new ArrayList<Integer>(set);
		if (k > list.size()) return -1;
		number = list.get(list.size()-k);
		list.removeAll(list);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[i] == number) {
				list.add(i);
			}
		}
		// find the number fist appearance
		if (list.size() == 1) return list.get(0);
		for (int i = 0; i < a.length; i++) {
			for (Integer integer : list) {
				if (a[i] == integer) return a[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = {3,2,6,1,1,-1};
		System.out.println(kthBiggestFrequency(a, 1));
	}

}
