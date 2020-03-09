
public class BingoGame {
	public static boolean checkBingo(int[][] a) {
		if ((a[0][0] + a[0][1] + a[0][2] + a[0][3] + a[0][4]) == 0) {
			return true;
		} else if ((a[1][0] + a[1][1] + a[1][2] + a[1][3] + a[1][4]) == 0) {
			return true;
		} else if ((a[2][0] + a[2][1] + a[2][2] + a[2][3] + a[2][4]) == 0) {
			return true;
		} else if ((a[3][0] + a[3][1] + a[3][2] + a[3][3] + a[3][4]) == 0) {
			return true;
		} else if ((a[4][0] + a[4][1] + a[4][2] + a[4][3] + a[4][4]) == 0) {
			return true;
		} else if ((a[0][0] + a[1][0] + a[2][0] + a[3][0] + a[4][0]) == 0) {
			return true;
		} else if ((a[0][1] + a[1][1] + a[2][1] + a[3][1] + a[4][1]) == 0) {
			return true;
		} else if ((a[0][2] + a[1][2] + a[2][2] + a[3][2] + a[4][2]) == 0) {
			return true;
		} else if ((a[0][3] + a[1][3] + a[2][3] + a[3][3] + a[4][3]) == 0) {
			return true;
		} else if ((a[0][4] + a[1][4] + a[2][4] + a[3][4] + a[4][4]) == 0) {
			return true;
		} else if ((a[0][0] + a[1][1] + a[2][2] + a[3][3] + a[4][4]) == 0) {
			return true;
		} else if ((a[0][4] + a[1][3] + a[2][2] + a[3][1] + a[4][0]) == 0) {
			return true;
		}
		return false;
	}
	public static int bingoGame(int[][] a, int[] b){
		int result = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				boolean check = false;
				for (int k = 0; k < a.length; k++) {
					if (b[i] == a[j][k]) {
						a[j][k] = 0;
						check = true;
						break;
					}
				}
				if (check == true) break;
			}
			if (i >= 4) {
				if (checkBingo(a) == true) {
					System.out.println(i);
					result = i;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int a[][] = {{21,1,2,20,18},{23,7,5,3,14},{13,16,8,25,17},{6,11,4,24,12},{22,19,9,15,10}}; 
		int[] b = {13,2,10,8,19,9,15,6,4,7,24,20,21,23,17,11,22,12,18,14,25,3,16,1,5};
		System.out.println(bingoGame(a, b));
	}
}
