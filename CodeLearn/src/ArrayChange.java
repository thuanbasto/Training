
public class ArrayChange {
	public static int arrayChange(int[] a){
		int result = 0;
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] >= a[i+1]) {
				result += a[i]+1-a[i+1]; 
				a[i+1]= a[i]+1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a[] = {-1000,0,-2,0};
		// [-1000, 0, -2, 0]  == 5
		System.out.println(arrayChange(a));
	}

}
