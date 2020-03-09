
public class InitMatrix {
	public static int[][] initMatrix(int n){
		int result[][] = new int[n][n];
		int count = 1;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				result[i][j] = count+j;
			}
			count++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(initMatrix(4));
	}

}
