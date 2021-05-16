import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountStepsTaken {
	public static int countStepsTaken(int[][] a) {
		long result = 0;
		List<int[]> list = new ArrayList<int[]>(Arrays.asList(a));
		while (true) {
			long min = Long.MAX_VALUE;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i)[0] - list.get(i)[1] < 0) {
					long temp = Math.abs(list.get(i)[0] - list.get(i)[1]);
					if (temp < min) {
						min = temp;
					}
				} else {
					list.remove(i);
					i--;
				}
			}
			if (min == Long.MAX_VALUE) break;
			result++;
			for (int i = 0; i < list.size(); i++) {
				list.get(i)[0] += min;
			}
		}
		return (int)result;
	}
	public static void main(String[] args) {
		int a[][]= {{-7,1},{5,9},{-1,2},{1,11},{-6,-4},{-4,4},{-1,7}};
		int b[][]= {{-1000000000,1000000000},{0,2}};
		System.out.println(countStepsTaken(a));
	}

}
