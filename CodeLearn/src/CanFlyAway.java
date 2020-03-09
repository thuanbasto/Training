
public class CanFlyAway {
	public static boolean canFlyAway(int h, int[] arr){
		if (arr.length == 1) {
			if (arr[0] < h) return false;
			else return true;
		}
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] < h || arr[i+1] < h) {
				return false;
			}
			if (Math.abs(arr[i]-arr[i+1]) > 1000) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
