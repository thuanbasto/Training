
public class MultipleArray {
	public static int multipleArray(long x, long y){
		int result = 1;
		if (x == y) {
			return 1;
		}
		if (x == 0) {
			x = 1;
		}
		while (x < y) {
			x *= 2;
			if (x < 0) {
				break;
			}
			if (x <= y) {
				result++;
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
		System.out.println(multipleArray(3, 20));
	}

}
