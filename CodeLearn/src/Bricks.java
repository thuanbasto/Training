
public class Bricks {
	public static boolean checkSNT (int b) {
		for (int i=2;i<=Math.sqrt(b);i++) {
			if (b % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static int[] bricks(int a, int b){
		int[] result = {0,0};
		int[] resultFail = {-1}; 
		if (checkSNT(b)) {
			if (a != b*2+6) {
				return resultFail;
			} else {
				result[0] = 3;
				result[1] = b + 2;
			}
		} else {
			int maxRowOfB = b/2;
			for (int rowOfB=maxRowOfB;rowOfB>0;rowOfB--) {
				int colOfB = b/rowOfB;
				if (rowOfB > colOfB) {
					continue;
				} else	if (a == rowOfB*2+4+colOfB*2) {
					result[0] = rowOfB + 2;
					result[1] = colOfB + 2;
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] b = bricks(30, 36);
		System.out.println(b[0]);
		System.out.println(b[1]);
	}

}
