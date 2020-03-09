
public class SumMainDiagonal {
	public static int sumMainDiagonal(int[][] a){
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result+= a[i][i];
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
