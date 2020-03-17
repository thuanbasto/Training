
public class BookDays {
	public static int bookDays(int[] a){
		int result = 0;
		double sum  = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (a[i] > sum/(i+1)) result++;
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {32,40,4,68,30,52,57,83,6,83};
		System.out.println(bookDays(a));
	}

}
