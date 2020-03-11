
public class ArrayAscending {
	public static int arrayAscending(int[] a, int k){
		int result = 0;
		for (int i = 0; i < a.length-1; i++) {
			while (a[i] >= a[i+1]) {
				a[i+1] +=k;
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
	}

}
