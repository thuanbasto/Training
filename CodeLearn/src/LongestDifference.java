
public class LongestDifference {
	public static int longestDifference(int n) {
		String str = Integer.toBinaryString(n);
		int count1 = 0;
		int count0 = 0;
		int max1 = 0;
		int max0 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count1++;
				count0 = 0;
				if (count1 > max1) max1 = count1;
			} else {
				count0++;
				count1 = 0;
				if (count0 > max0) max0 = count0;
			}
		}
		return Math.abs(max1-max0);
	}
	public static void main(String[] args) {

	}

}
