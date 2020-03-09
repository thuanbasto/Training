
public class DeleteArray {
	public static boolean deleteArray(int[] a){
	    int count = 0;
	    for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i+1]) {
				count++;
			}
			if (count > 1) return false;
		}
	    return true;
	}

	public static void main(String[] args) {

	}

}
