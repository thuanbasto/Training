
public class SquareEdge {
	public static int squareEdge(int[][] a){
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			int temp = Math.abs(a[i][0]) + Math.abs(a[i][1]);
			if (temp > result)
				result = temp;
		}
//		for (int i = 0; i < a.length; i++) {
//			double temp = Math.sqrt(Math.pow(a[i][0],2) + Math.pow(a[i][1],2));
//			if (temp > result)
//				if (temp > (int) temp)
//					result = (int) temp + 1;
//				else 
//					result = (int)temp;
//		}
		if (result == 0) return 1;
		return result;
	}

	public static void main(String[] args) {
		int[][] a = {{0,0}};
		System.out.println(squareEdge(a));
	}

}
