import java.util.ArrayList;
import java.util.List;

public class BestFriend {
	public static int bestFriend(int[] a, int[] b){
		int result = 0;
		int count = a.length;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		while (count > 0) {
			boolean check1 = false;
			boolean check2 = false;
			if (b[0] == b[1]) {
				for (Integer integer : list) {
					if (b[0] >= integer) {
						list.remove(integer);
						count--;
						check1 = true;
						break;
					};
				}
				for (Integer integer : list) {
					if (b[1] >= integer) {
						list.remove(integer);
						count--;
						check2 = true;
						break;
					};
				}
			} else {
				for (Integer integer : list) {
					if (b[0] >= integer && b[1] != integer) {
						list.remove(integer);
						count--;
						check1 = true;
						break;
					};
				}
				for (Integer integer : list) {
					if (b[1] >= integer && b[0] != integer) {
						list.remove(integer);
						count--;
						check2 = true;
						break;
					};
				}
			}
			if (!check1 && !check2) {
				result += count;
				break;
			}
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {1,6,3,5};
		int b[] = {2,4};
		System.out.println(bestFriend(a, b));
	}

}
