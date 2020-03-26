import java.util.ArrayList;
import java.util.List;

public class BusStation {
	public static int busStation(int t, int d, int[] a){
		int result = 0;
		int max = Integer.MIN_VALUE;
		int time = 1;
		List<Integer> list = new ArrayList<Integer>();
		for (int i : a) {
			list.add(i);
		}
		
		while (list.size() > 0) {
			int sum = 0;
			for (int i = 0; i < list.size(); i++) {
				if (t >= list.get(i)) {
					sum ++;
					list.remove(i);
					i--;
				}
			}
			if (sum > max) {
				max = sum;
				result = time;
			}
			time++;
			t += d;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {3,4,5,6};
		System.out.println(busStation(0,2, a));
	}

}
