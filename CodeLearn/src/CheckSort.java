import java.util.HashMap;
import java.util.Map;

public class CheckSort {
	public static boolean checkSort(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) == null)
				map.put(a[i], 1);
			else
				map.put(a[i], map.get(a[i]) + 1);
		}
		int sum = 1;
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] == temp) {
				sum++;
			} else {
				if (map.get(a[i-1]) != sum) {
					return false;
				}
				sum = 1;
				temp =  a[i];
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int a[]  = {3,1,1};
		System.out.println(checkSort(a));
	}

}
