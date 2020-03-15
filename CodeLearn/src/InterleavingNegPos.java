import java.util.Arrays;
import java.util.Collections;

public class InterleavingNegPos {
	public static int[] interleavingNegPos(int[] np){
		int arr1[] = new int [np.length/2];
		int arr2[] = new int [np.length/2];
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < np.length; i++) {
			if (np[i] > 0) arr1[count1++] = np[i];
			else arr2[count2++] = np[i];
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		count1 = 0;
		for (int i = 0; i < np.length; i++) {
			if (i % 2 == 0)
				np[i] = arr2[--count2];
			else 
				np[i] = arr1[count1++];
		}
		return np;
	}

	public static void main(String[] args) {
		int np[] = {-5,-5,6,6,2,5,-1,-3,9,-6};
		np = interleavingNegPos(np);
		for (int i = 0; i < np.length; i++) {
			System.out.print(np[i] +" ");
		}
	}

}
