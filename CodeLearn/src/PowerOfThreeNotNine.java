
public class PowerOfThreeNotNine {
	public static int powerOfThreeNotNine(int m, int n) {
		int count = 0, result = 0;
		boolean a = true, b = true;
		while (a || b) {
			int temp = (int) Math.pow(3, count);
			if (temp >= m && temp <= n) {
				result++;
			}
			if (temp > n) {
				a = false;
			}
			temp = (int) Math.pow(9, count++);
			if (temp >= m && temp <= n) {
				result--;
			}
			if (temp > n) {
				b = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(powerOfThreeNotNine(3, 81));
	}

}
