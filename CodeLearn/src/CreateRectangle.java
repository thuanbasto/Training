import com.sun.org.apache.bcel.internal.generic.SWAP;

public class CreateRectangle {
	public static int[] createRectangle(int[][] points) {
		int[] result = new int[2];
		int arr[][] = points;
		boolean check1 = false;
		boolean check2 = false;
		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (arr[i][0] == arr[j][0]) {
					arr[i][0] = Integer.MAX_VALUE;
					arr[j][0] = Integer.MAX_VALUE;
					check1 = true;
				}
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (arr[i][1] == arr[j][1]) {
					arr[i][1] = Integer.MAX_VALUE;
					arr[j][1] = Integer.MAX_VALUE;
					check2 = true;
				}
			}
		}
		if (check1 && check2) {
			for (int i = 0; i < 3; i++) {
				if (arr[i][0] != Integer.MAX_VALUE) {
					result[0] = arr[i][0];
				}
			}
			for (int i = 0; i < 3; i++) {
				if (arr[i][1] != Integer.MAX_VALUE) {
					result[1] = arr[i][1];
				}
			}
		} else {
			for (int i = 0; i < 2; i++) {
				for (int j = i + 1; j < 3; j++) {
					if (arr[i][0] > arr[j][0]) {
						int temp[] = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
//			// tích vô hướng AB AD
//			double mulXAB = points[1][0] - points[0][0];
//			double mulYAB = points[1][1] - points[0][1];
//			double mulXAD = -points[0][0];
//			double mulYAD = -points[0][1];
//			double mulZABAD = mulXAB * mulXAD + mulYAB * mulYAD;
//
//			// tích vô hướng DC BC
//			double mulXDC = points[2][0];
//			double mulYDC = points[2][1];
//			double mulXBC = points[2][0] - points[1][0];
//			double mulYBC = points[2][1] - points[1][1];
//			double mulZDCBC = mulXDC * mulXBC + mulYDC * mulYBC;
//
//			double y = -mulXBC * (-mulZABAD / mulXAB) + mulZDCBC;
//			double tempY = -mulXBC * (-mulYAB / mulXAB) + -mulYBC;
//			y = -y / tempY;
//			double x = (-mulZABAD - mulYAB * y) / mulXAB;
			// tích vô hướng AB
			double mulXAB = points[1][0] - points[0][0];
			double mulYAB = points[1][1] - points[0][1];

			// tích vô hướng CD
			double mulXCD = points[2][0];
			double mulYCD = points[2][1];

			double x = mulXAB + mulXCD;
			double y = mulYAB + mulYCD;
			if ((x > 0 && points[0][0] < 0) || 
					(x < points[0][0] && x < points[1][0] && x < points[2][0]) ||
					(x > points[0][0] && x > points[1][0] && x > points[2][0])) {

				x = -mulXAB + mulXCD;
				y = -mulYAB + mulYCD;
			}
			result[0] = (int) x;
			result[1] = (int) y;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] points = { { -22, 16 }, { -14, 6 }, { -4, 14 } };
		int[][] points2 = { { 2, 8 }, { 2, 3 }, { 13, 3 } };
		int[][] points3 = { { -1,1},{1,2},{2,-1 } };
		int[] result = createRectangle(points3);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
