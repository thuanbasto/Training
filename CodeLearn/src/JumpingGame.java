
public class JumpingGame {
	public static boolean jumpingGame(int[] arr, int h, int t){
		boolean result = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > h) 
				return false;
			else
				h+=t;
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
