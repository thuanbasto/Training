
public class MaxPoint {
	public static int[] maxPoint(int[] a, int[] b){
		for (int i = 0; i < b.length; i++) {
			int sum = 0;
			for (int j = 0; j <= b[i]; j++) {
				sum = Math.max(sum, a[j]);
			}
			b[i] = sum;
		}
		return b;
	}

	public static void main(String[] args) {
		int a[] = {1,5,2,6,7,2};
		int b[] = {2,3,1};
		b = maxPoint(a, b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
