
public class RatingReview {
	public static int[] ratingReview(double threshold, int[][] ratings)
	{
		int sum[] = new int[ratings.length];
		int count = 0;
		for (int i = 0; i < ratings.length; i++) {
			double temp = 0;
			int countLenghtRow = 0;
			for (int j = 0; j < ratings[i].length; j++) {
				temp += ratings[i][j];
				countLenghtRow++;
			}
			if (temp/countLenghtRow < threshold) {
				sum[i] = 1;
				count++;
			}
		}
		int result[] = new int[count];
		count = 0;
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] == 1) {
				result[count++] = i;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a = {{2,3,4,2},{5,1,1},{3,4},{5,4,2},{3,1}};
		System.out.println(ratingReview(3.5, a));
	}

}
