
public class Cubes {
	public static int cubes(int[][] a){	
		// đếm có bao nhiêu số lớn nhất trong 3 hộp
		// count = 3 => 3 hộp chồng lên nhau, count = 1 => 1 hộp trên 2 hộp kia.
		int count = 0; 
		int max = 0; // số lớn nhất
		int rowMax = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (j == 0) {
					if (a[i][j] == a[i][j+2]) {
						if (a[i][j] >= max) {
							if (a[i][j] > max) {
								count=0;
							}
							rowMax = i;
							max = a[i][j];
							count++;
						}
					}
				}
				if (a[i][j] == a[i][j+1]) {
					if (a[i][j] >= max) {
						if (a[i][j] > max) {
							count=0;
						}
						rowMax = i;
						max = a[i][j];
						count++;
					}
				}
			}
		}
		if (count == 0) {
			return -1;
		} else if (count == 3) {
			int sumMin = 0;
			// lấy những giá trị nhỏ nhất cộng lại với nhau khi count == 3
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if (a[i][j] != max) {
						sumMin += a[i][j];
					}
				}
			}
			if (sumMin == max) {
				return max;
			} else 
				return -1;
		} else if (count == 1) {
			// lay giá trị thấp nhất trong hàng cao nhất
			int colMin = 0;
			boolean checkEqualMin = false; // check các số nhỏ nhất + lại = max
			boolean checkEqualMax = false; // check các số lớn nhất + lại = max
			for (int i = 0; i < a.length; i++) {
				if (a[rowMax][i] != max) {
					colMin = a[rowMax][i];
				}
			}
			for (int i = 0; i < a.length; i++) {
				if (i != rowMax) {
					for (int j = 0; j < a.length; j++) {
						if (a[i][j] != max) {
							for (int i2 = 0; i2 < a.length; i2++) {
								if (i2 != rowMax || i2 != i) {
									for (int j2 = 0; j2 < a.length; j2++) {
										if (a[i2][j2] != max) {
											if (a[i][j] == a[i2][j2] && a[i][j] + colMin == max) {
												checkEqualMin = true;
											} else if (a[i][j] + a[i2][j2] == max) {
												checkEqualMax = true;
											}
										}
									}
								}
							}
						}
					}
				}
			}
			if (checkEqualMax == true && checkEqualMin == true) {
				return max;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[][] = {{0,4,2},{6,2,2},{6,6,4}};
		int b[][] = {{3,3,1},{3,3,1},{1,3,3}};
		int c[][] = {{100,100,87},{13,100,6},{13,100,94}};
		int d[][] = {{0,0,0},{0,0,0},{6,4,6}};
		System.out.println(cubes(a));
	}

}
