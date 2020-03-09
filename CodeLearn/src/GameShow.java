import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameShow {
	public static int[] gameShow(int[] a, int k){
		int min = Integer.MAX_VALUE;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] - k) < min) {
				min = Math.abs(a[i] - k);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] - k) == min) {
				list.add(i);
			}
		}
		Collections.sort(list);
		int result[] = new int[list.size()];
		int count = 0;
		for (Integer i : list) {
			result[count++] = i;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {3,1,4,2};
		gameShow(a, 4);
	}

}
