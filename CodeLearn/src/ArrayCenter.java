
public class ArrayCenter {
	public static int[] arrayCenter(int[] a){
		int temp[] = new int[10000];
		int min = Integer.MAX_VALUE;
		int count = 0;
		double average = 0.0;
		for (int i = 0; i < a.length; i++) {
			average += a[i];
			if (a[i] < min) 
				min = a[i];
		}
		average /= a.length;
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i] - average) < min) temp[count++] = a[i];
		}
		int result[]= new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = temp[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {8, 3, 4, 5, 2, 8};
		int b[] = arrayCenter(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
