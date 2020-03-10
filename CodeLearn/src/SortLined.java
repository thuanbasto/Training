
public class SortLined {
	public static int sortLined(int[] a){
		int result1 = 0;
		int result2 = 0;
		int[] arr1 = new int[a.length];
		int[] arr2 = new int[a.length];
		boolean check = false;
		for (int i = 0; i < a.length; i++) {
			if (check) {
				arr1[i] = 1;
				arr2[i] = 0;
				check = false;
			} else {
				arr1[i] = 0;
				arr2[i] = 1;
				check = true;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if (a[i] != arr1[i]) result1++;
		}
		for (int i = 0; i < arr2.length; i++) {
			if (a[i] != arr2[i]) result2++;
		}
		if (result1 > result2) return result2/2;
		return result1/2;
	}

	public static void main(String[] args) {
		int a[] = {1,0,0,0,1,1,0,0,1,1};
		System.out.println(sortLined(a));
	}

}
