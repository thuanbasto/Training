
public class StabilityArray {
	public static boolean stabilityArray(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			if (Math.abs(arr[i] - arr[i+1]) > 5) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
	}

}
