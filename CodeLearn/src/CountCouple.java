import java.util.HashMap;
import java.util.Map;

public class CountCouple {
	public static int countCouple(int[] a) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) == null)
				map.put(a[i], 1);
			else
				map.put(a[i], map.get(a[i]) + 1);
		}
		for (Integer i : map.keySet()) {
			if (map.get(i) > 1) {
				result += map.get(i)/2;
			}
		}
		return result;
	}
	public static void main(String[] args) {

	}

}
