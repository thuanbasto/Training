import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthBiggest {
	public static int kthBiggest(int[] arr, int k){
		int result = 0;
		Set<Integer> list = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i : list) {
			list2.add(i);
		}
		Collections.sort(list2);
		if (k > list2.size()) return -1;
		else result = list2.get(list2.size()-k);
		return result;
	}

	public static void main(String[] args) {

	}

}
