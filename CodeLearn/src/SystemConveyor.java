
public class SystemConveyor {
	public static int systemConveyor(int[] a, int k){
		int result = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (count + a[i] <= k) {
				count += a[i];
			} else {
				result++;
				count = a[i];
			}
			if (count == k) {
				result ++;
				count = 0;
			}
		}
		if (count != 0) result++;
		return result;
	}

	public static void main(String[] args) {
		int a[] = {5,10,8,8,10,2,9,7,9,2,1,9,5,9,4,6,3,9,8,3};
		System.out.println(systemConveyor(a, 10));
	}

}
