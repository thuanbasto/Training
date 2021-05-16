import java.util.ArrayList;
import java.util.List;

public class IconFeeling {
	public static int[] iconFeeling(int[] a) {
		int count[] = new int[7];
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			count[a[i]]++;
		}
		
		while (true) {
			List<Integer> temp = new ArrayList<Integer>();
			int max = Integer.MIN_VALUE;
			for (int i = 1; i < count.length; i++) {
				if (max < count[i]) {
					max = count[i];
				}
			}
			if (max == 0) break;
			for (int i = 1; i < count.length; i++) {
				if (count[i] == max) {
					temp.add(i);
					count[i] = 0;
				}
			}
			
			while (list.size() < 3 && temp.size() > 0) {
				for (int i = 0; i < a.length; i++) {
					if (list.size() >= 3) break;
					if (temp.contains(a[i])) {
						list.add(a[i]);
						temp.remove((Object) a[i] );
					}
				}
			}
			if (list.size() == 3) break;
		}
		int index = 0;
		int result[] = new int[list.size()];
		for (Integer integer : list) {
			result[index++] = integer;
		}
		return result;
	}
	public static void main(String[] args) {
		int a[] = {2,5,5,2,6,1};
		a = iconFeeling(a);
		for (int i : a) {
			System.out.print(i+ " ");
		}
		
	}

}
