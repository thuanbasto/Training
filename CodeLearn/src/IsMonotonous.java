
public class IsMonotonous {
	public static boolean isMonotonous(int[] sequence){
		if (sequence.length == 1) {
			return true;
		}
		boolean check = sequence[0] > sequence[1];
		for (int i = 0; i < sequence.length-1; i++) {
			if (check) {
				if (sequence[i] <= sequence[i+1]) return false;
			} else {
				if (sequence[i] >= sequence[i+1]) return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
