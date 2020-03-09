
public class BuildFloor {
	 public static boolean buildFloor(int[][] a){
		int[][] arr1 = new int[a.length][a[0].length];
		int[][] arr2 = new int[a.length][a[0].length];
		if (a[0].length % 2 != 0) {
			int number = 1;
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr1[0].length; j++) {
					arr1[i][j] = number++%2;
				}
			}
			number = 0;
			for (int i = 0; i < arr2.length; i++) {
				for (int j = 0; j < arr2[0].length; j++) {
					arr2[i][j] = number++%2;
				}
			}
		} else {
			int number = 1;
			for (int i = 0; i < arr1.length; i++) {
				if (i % 2 != 0) number = 2;
				else number = 1;
				for (int j = 0; j < arr1[0].length; j++) {
					arr1[i][j] = number++%2;
				}
			}
			number = 0;
			for (int i = 0; i < arr2.length; i++) {
				if (i % 2 != 0) number = 1;
				else number = 2;
				for (int j = 0; j < arr2[0].length; j++) {
					arr2[i][j] = number++%2;
				}
			}
		}
		boolean check1 = true;
		boolean check2 = true;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				if (a[i][j] != arr1[i][j]) check1 = false;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				if (a[i][j] != arr2[i][j]) check2 = false;
			}
		}
		if (check1 == true || check2 == true) {
			return true;
		} else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
