import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Count8_3 {
	public static long count8_3(int[] a){
		long result = 0;
		long arr3[] = new long [1000];
		long arr8[] = new long [1000];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 8 == 0) {
				int temp = a[i]/8;
				arr8[temp]++;
			}
			if (a[i] % 3 == 0) {
				int temp = a[i]/3;
				arr3[temp]++;
			}
		}
		for (int i = 0; i < 1000; i++) {
			result += arr3[i] * arr8[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {8,8,8,8,8,8,0,0};
		System.out.println(count8_3(a));
	}

}
