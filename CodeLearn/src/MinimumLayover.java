
public class MinimumLayover {
	public static int minimumLayover(String[] a, String[] b){
		int result = 0;
		int lengthA = a.length;
		int lengthB = b.length;
		int[][] arrA = new int[lengthA][lengthA];
		int[][] arrB = new int[lengthB][lengthB];
		int indexDepart = 0;
		int indexArrive = 0;
		for (int i = 0; i < a.length; i++) {
			// Array A
			int temp = a[i].indexOf("-");
			String depart = a[i].substring(0,2);
			String arrive = a[i].substring(temp+2,temp+4);
			depart = depart.trim();
			arrive = arrive.trim();
			if (a[i].substring(temp-3,temp-1).equals("AM")) {
				arrA[0][indexDepart] = Integer.valueOf(depart);
			} else arrA[0][indexDepart] = Integer.valueOf(depart) + 12;
			
			if (a[i].substring(a[i].length()-2).equals("AM")) {
				arrA[1][indexArrive] = Integer.valueOf(arrive);
			} else arrA[1][indexArrive] = Integer.valueOf(arrive) + 12;
			
			// Array B
			temp = b[i].indexOf("-");
			depart = b[i].substring(0,2);
			arrive = b[i].substring(temp+2,temp+4);
			depart = depart.trim();
			arrive = arrive.trim();
			if (b[i].substring(temp-3,temp-1).equals("AM")) {
				arrB[0][indexDepart] = Integer.valueOf(depart);
			} else arrB[0][indexDepart] = Integer.valueOf(depart) + 12;
			
			if (b[i].substring(b[i].length()-2).equals("AM")) {
				arrB[1][indexArrive] = Integer.valueOf(arrive);
			} else arrB[1][indexArrive] = Integer.valueOf(arrive) + 12;
			
			// tang bien dem
			indexDepart++;
			indexArrive++;
		}
		// save overlay
		int[][] arrOverlayCome = new int[lengthA][lengthA];
		int[][] arrOverlayBack = new int[lengthB][lengthB];
		for (int i = 0; i < arrOverlayCome.length; i++) {
			indexArrive = 0;
			for (int j = 0; j < arrOverlayCome.length; j++) {
				if (arrB[0][i] == 24) {
					arrB[0][i] = 0;
				} else if (arrA[1][indexArrive] == 24) arrA[1][indexArrive] = 0;
				if (arrB[0][i] <= arrA[1][indexArrive]) {
					arrOverlayCome[i][j] = 24 - arrB[0][i] + arrA[1][indexArrive++];
				} else {
					arrOverlayCome[i][j] = arrB[0][i] - arrA[1][indexArrive++];
				}
			}
		}
		for (int i = 0; i < arrOverlayBack.length; i++) {
			indexDepart = 0;
			for (int j = 0; j < arrOverlayBack.length; j++) {
				if (arrA[0][i] == 24) {
					arrA[0][i] = 0;
				} else if (arrB[1][indexDepart] == 24) arrB[1][indexDepart] = 0;
				if (arrA[0][i] <= arrB[1][indexDepart]) {
					arrOverlayBack[i][j] = 24 - arrB[1][indexDepart++] + arrA[0][i];
				} else {
					arrOverlayBack[i][j] = arrA[0][i] - arrB[1][indexDepart++];
				}
			}
		}
		int k = 1;
		while (k <= lengthA*2) {
			if (k % 2 != 0) {
				int min = Integer.MAX_VALUE;
				int temp = 0;
				int temp2 = 0;
				for (int i = 0; i < arrOverlayCome.length; i++) {
					for (int j = 0; j < arrOverlayCome.length; j++) {
						if (min > arrOverlayCome[i][j] && arrOverlayCome[i][j] != 0) {
							System.out.println("ok");
							min = arrOverlayCome[i][j];
							temp = i;
							temp = j;
						}
					}
				}
				result += min;
				for (int i = 0; i < arrOverlayCome.length; i++) {
					for (int j = 0; j < arrOverlayCome.length; j++) {
						if (i == temp) {
							arrOverlayCome[i][j] = 0;
						} else if (j == temp2) {
							arrOverlayCome[i][j] = 0;
						}
					}
				}
			} else {
				int min = Integer.MAX_VALUE;
				int temp = 0;
				int temp2 = 0;
				for (int i = 0; i < arrOverlayBack.length; i++) {
					for (int j = 0; j < arrOverlayBack.length; j++) {
						if (min > arrOverlayBack[i][j] && arrOverlayBack[i][j] != 0) {
							min = arrOverlayBack[i][j];
							temp = i;
							temp = j;
						}
					}
				}
				result += min;
				for (int i = 0; i < arrOverlayBack.length; i++) {
					for (int j = 0; j < arrOverlayBack.length; j++) {
						if (i == temp) {
							arrOverlayBack[i][j] = 0;
						} else if (j == temp2) {
							arrOverlayBack[i][j] = 0;
						}
					}
				}
			}
			System.out.println(result);
			k++;
		}

		
		return result;
	}

	public static void main(String[] args) {
		// "1 AM - 3 AM", "4 AM - 6 AM", "11 AM - 1 PM", "2 PM - 4 PM", "8 PM - 10 PM", "8 PM - 11 PM"], ["3 AM - 4 AM", "8 AM - 10 AM", "9 AM - 11 AM", "7 AM - 10 AM", "7 PM - 9 PM", "8 PM - 11 PM"
		// ["6 AM - 8 AM", "8 AM - 10 AM"], ["6 AM - 8 AM", "8 AM - 10 AM"]
		String a[] = {"6 AM - 8 AM"
					, "8 AM - 10 AM"};
										String b[] = {"9 AM - 11 AM"
													, "7 PM - 9 PM"};
		System.out.println(minimumLayover(a, b));
	}	

}
