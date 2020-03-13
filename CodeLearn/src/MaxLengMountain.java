import java.util.ArrayList;
import java.util.List;

public class MaxLengMountain {
	public static int[] maxLengMountain(int[] a){
		int result[];
		List<Integer> list = new ArrayList<Integer>();
		
		boolean check = true;
		int max = -1;
		int index = 0;
		int count = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] < a[i+1] && check)
				count++;
			else if (a[i] > a[i+1]) {
				if (count > 0) {
					check = false;
					count++;
				} else {
					if (count+index-index > max) {
						for (;index < count; index++) {
							list.add(a[index]);
						}
					}
					count = 0;
					index = i+1;
					check = true;
				}
			}
			else if (a[i] == a[i+1]) {
				if (count-index > max) {
					for (;index < count; index++) {
						list.add(a[index]);
					}
				}
				count = 0;
				index = i+1;
				check = true;
			}
		}
		result = new int[list.size()];
		int c = 0;
		for (Integer integer : list) {
			result[c++] = integer;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {1,3,2,4,0};
		System.out.println(maxLengMountain(a));
	}

}
