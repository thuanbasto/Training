
public class TestSort {
	public static int[] sort(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			if (a[i] % 2 == 0) {
				for (int j = i+1; j < a.length; j++) {
					if (a[j] % 2 != 0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (i < count-1 && j < count) {
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				} else if (i >= count){
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,8,6,4,3,2};
		a = sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
