
public class MinPerimeter {
	public static int minPerimeter(int s) {
		int result = Integer.MAX_VALUE;
		if (s == 1) {
			return -1;
		}
		for (int i = s/2; i > 1; i--) {
			if (s % i == 0) {
				int temp = s/i;
				int p = (temp + s/temp)*2;
				if (p < result) {
					result = p;
				}
			}
			if (i == 2 && result == Integer.MAX_VALUE) return -1;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(minPerimeter(1));
	}

}
