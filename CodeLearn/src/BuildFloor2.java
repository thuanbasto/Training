
public class BuildFloor2 {
	public static int buildFloor2(int[][] a){
		int[][] arr1 = new int[a.length][a[0].length];
		int[][] arr2 = new int[a.length][a[0].length];
		int count1 = 0;
		int count2 = 0;
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
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				if (a[i][j] != arr1[i][j]) count1++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				if (a[i][j] != arr2[i][j]) count2++;
			}
		}
		if (count1 > count2) {
			return count2;
		} else return count1;
	}

	public static void main(String[] args) {
		int[][] a = {{0,1,0,1},{1,0,1,0},{0,1,0,1}};
		System.out.println(buildFloor2(a));
	}

}
