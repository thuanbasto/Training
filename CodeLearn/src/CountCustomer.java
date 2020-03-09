
public class CountCustomer {
	public static int countCustomer(int a, int b, int[] arr){
		int result = 0;
		int checkB = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				if (a > 0) {
					a--;
				} else if (b>0 || checkB%2 != 0) {
					checkB++;
					if (checkB%2 != 0) {
						b--;
					}
				} else {
					result++;
				}
			} else {
				if (b > 0) {
					b--;
				} else {
					result+=2;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,1,1,1};
		System.out.println(countCustomer(0, 2, arr));
	}

}
