public class MaxFraction {
	public static int maxFraction(int[] numerators, int[] denominators){
		int result = 0;
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < denominators.length; i++) {
			if ((double)numerators[i]/denominators[i] > max) {
				max = (double)numerators[i]/denominators[i];
				result = i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
	}

}
