
public class IsInfiniteProcess {
	public static boolean isInfiniteProcess(long a, long b){
		if ((b-a)%2 == 1) return true;
		if (a > b) return true;
		else return false;
	}

	public static void main(String[] args) {

	}

}
