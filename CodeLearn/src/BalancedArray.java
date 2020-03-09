
public class BalancedArray {
	public static int balancedArray(int[] a){
		int result = 0;
		int left = 0;
		int right = 0;
		int mid = a.length/2;
		for (int i = 0; i < a.length; i++) {
			if (i < mid) {
				left += a[i];
			} else {
				right += a[i];
			}
		}
		result = Math.abs(left-right);
		return result;
	}

	public static void main(String[] args) {
		int a[]= {1, 2, 1, 2, 1, 3};
		System.out.println(balancedArray(a));
	}

}
