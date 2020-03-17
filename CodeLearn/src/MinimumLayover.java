
public class MinimumLayover {
//	public static int minimumLayover(String[] a, String[] b){
//		int result = 0;
//		int lengthA = a.length;
//		int lengthB = b.length;
//		int[][] arrA = new int[2][lengthA];
//		int[][] arrB = new int[2][lengthB];
//		int indexDepart = 0;
//		int indexArrive = 0;
//		for (int i = 0; i < a.length; i++) {
//			// Array A
//			int temp = a[i].indexOf("-");
//			String depart = a[i].substring(0,2);
//			String arrive = a[i].substring(temp+2,temp+4);
//			depart = depart.trim();
//			arrive = arrive.trim();
//			if (a[i].substring(temp-3,temp-1).equals("AM")) {
//				arrA[0][indexDepart] = Integer.valueOf(depart);
//			} else arrA[0][indexDepart] = Integer.valueOf(depart) + 12;
//			
//			if (a[i].substring(a[i].length()-2).equals("AM")) {
//				arrA[1][indexArrive] = Integer.valueOf(arrive);
//			} else arrA[1][indexArrive] = Integer.valueOf(arrive) + 12;
//			
//			// Array B
//			temp = b[i].indexOf("-");
//			depart = b[i].substring(0,2);
//			arrive = b[i].substring(temp+2,temp+4);
//			depart = depart.trim();
//			arrive = arrive.trim();
//			if (b[i].substring(temp-3,temp-1).equals("AM")) {
//				arrB[0][indexDepart] = Integer.valueOf(depart);
//			} else arrB[0][indexDepart] = Integer.valueOf(depart) + 12;
//			
//			if (b[i].substring(b[i].length()-2).equals("AM")) {
//				arrB[1][indexArrive] = Integer.valueOf(arrive);
//			} else arrB[1][indexArrive] = Integer.valueOf(arrive) + 12;
//			
//			// tang bien dem
//			indexDepart++;
//			indexArrive++;
//		}
//		// save overlay
//		int[][] arrOverlayCome = new int[lengthA][lengthA];
//		int[][] arrOverlayBack = new int[lengthB][lengthB];
//		for (int i = 0; i < arrOverlayCome.length; i++) {
//			indexArrive = 0;
//			for (int j = 0; j < arrOverlayCome.length; j++) {
//				if (Math.abs(arrB[0][i] - arrA[1][j]) < 5) {
//					arrOverlayCome[i][j] = 24 - arrA[1][j] + arrB[0][i];
//				} else {
//					arrOverlayCome[i][j] = Math.min(Math.abs(arrB[0][i] - arrA[1][j]),24 - arrA[1][j] + arrB[0][i]); 
//				}
////				if (arrB[0][i] == 24) {
////					arrB[0][i] = 0;
////				} else if (arrA[1][indexArrive] == 24) arrA[1][indexArrive] = 0;
////				if (arrB[0][i] <= arrA[1][indexArrive]) {
////					arrOverlayCome[i][j] = 24 - arrB[0][i] + arrA[1][indexArrive++];
////				} else {
////					arrOverlayCome[i][j] = arrB[0][i] - arrA[1][indexArrive++];
////				}
//			}
//		}
//		for (int i = 0; i < arrOverlayBack.length; i++) {
//			indexDepart = 0;
//			for (int j = 0; j < arrOverlayBack.length; j++) {
//				if (arrA[0][i] == 24) {
//					arrA[0][i] = 0;
//				} else if (arrB[1][indexDepart] == 24) arrB[1][indexDepart] = 0;
//				if (arrA[0][i] <= arrB[1][indexDepart]) {
//					arrOverlayBack[i][j] = 24 - arrB[1][indexDepart++] + arrA[0][i];
//				} else {
//					arrOverlayBack[i][j] = arrA[0][i] - arrB[1][indexDepart++];
//				}
//			}
//		}
//		int k = 1;
//		while (k <= lengthA*2) {
//			if (k % 2 != 0) {
//				int min = Integer.MAX_VALUE;
//				int temp = 0;
//				int temp2 = 0;
//				for (int i = 0; i < arrOverlayCome.length; i++) {
//					for (int j = 0; j < arrOverlayCome.length; j++) {
//						if (min > arrOverlayCome[i][j] && arrOverlayCome[i][j] != 0) {
//							System.out.println("ok");
//							min = arrOverlayCome[i][j];
//							temp = i;
//							temp = j;
//						}
//					}
//				}
//				result += min;
//				for (int i = 0; i < arrOverlayCome.length; i++) {
//					for (int j = 0; j < arrOverlayCome.length; j++) {
//						if (i == temp) {
//							arrOverlayCome[i][j] = 0;
//						} else if (j == temp2) {
//							arrOverlayCome[i][j] = 0;
//						}
//					}
//				}
//			} else {
//				int min = Integer.MAX_VALUE;
//				int temp = 0;
//				int temp2 = 0;
//				for (int i = 0; i < arrOverlayBack.length; i++) {
//					for (int j = 0; j < arrOverlayBack.length; j++) {
//						if (min > arrOverlayBack[i][j] && arrOverlayBack[i][j] != 0) {
//							min = arrOverlayBack[i][j];
//							temp = i;
//							temp = j;
//						}
//					}
//				}
//				result += min;
//				for (int i = 0; i < arrOverlayBack.length; i++) {
//					for (int j = 0; j < arrOverlayBack.length; j++) {
//						if (i == temp) {
//							arrOverlayBack[i][j] = 0;
//						} else if (j == temp2) {
//							arrOverlayBack[i][j] = 0;
//						}
//					}
//				}
//			}
//			System.out.println(result);
//			k++;
//		}
//
//		
//		return result;
//	}

	public static int minimumLayover(String[] a, String[] b){
	    int result = 0;
		int lengthA = a.length;
		int lengthB = b.length;
		int[][] arrA = new int[lengthA][2];
		int[][] arrB = new int[lengthB][2];
	    int indexDepart = 0;
		int indexArrive = 0;
		for (int i = 0; i < a.length; i++) {
			int temp = a[i].indexOf("-");
			String depart = a[i].substring(0,2);
			String arrive = a[i].substring(temp+2,temp+4);
			depart = depart.trim();
			arrive = arrive.trim();
			if (a[i].substring(temp-3,temp-1).equals("AM")) {
				arrA[indexDepart][0] = Integer.valueOf(depart);
			} else
	            arrA[indexDepart][0] = Integer.valueOf(depart) + 12;	
			if (a[i].substring(a[i].length()-2).equals("AM")) {
				arrA[indexArrive][1] = Integer.valueOf(arrive);
			} else 
	            arrA[indexArrive][1] = Integer.valueOf(arrive) + 12;
			temp = b[i].indexOf("-");
			depart = b[i].substring(0,2);
			arrive = b[i].substring(temp+2,temp+4);
			depart = depart.trim();
			arrive = arrive.trim();
			if (b[i].substring(temp-3,temp-1).equals("AM")) {
				arrB[indexDepart][0] = Integer.valueOf(depart);
			} else 
	            arrB[indexDepart][0] = Integer.valueOf(depart) + 12;
			if (b[i].substring(b[i].length()-2).equals("AM")) {
				arrB[indexArrive][1] = Integer.valueOf(arrive);
			} else 
	            arrB[indexArrive][1] = Integer.valueOf(arrive) + 12;
			indexDepart++;
			indexArrive++;
		}
	    int[][] HN = new int[lengthA][lengthA];
		int[][] HCM = new int[lengthB][lengthB];
	    for (int i = 0; i < lengthA; i++) {
	     	for (int j = 0; j < lengthA; j++) {  
          		HN[i][j] = arrB[j][0] - arrA[i][1];
          		while (HN[i][j] < 5) 
          			HN[i][j]+=24;
	        }
	    }
	    for (int i = 0; i < lengthA; i++) {
	     	for (int j = 0; j < lengthA; j++) {
	          	HCM[i][j] = arrA[i][0] - arrB[j][1];
	          	while (HCM[i][j] < 5) 
	            	HCM[i][j]+=24;
	        }
	    }
//	    in(HCM);
//	    System.out.println("--");
//	    in(HN);
//	    for (int i = 0; i < HCM.length; i++) {
//			for (int j = 0; j < HCM.length; j++) {
//				if (HCM[i][j] > HN[i][j]) {
//					HCM[i][j] = HN[i][j];
//				}
//			}
//		}
	    int k = 0;
	    boolean check = true;
	    while (k < a.length) {
	    	int arrIndex[][] = new int[lengthA*2][2];
	    	int indexI = 0;
	    	int indexJ = 0;
	    	int min = Integer.MAX_VALUE;
	    	if (check == false) {
	    		for (int i = 0; i < HCM.length; i++) {
	    			for (int j = 0; j < HCM.length; j++) {
	    				if (HCM[i][j] < min && HCM[i][j] != 0) {
	    					min = HCM[i][j];
	    					indexI = i;
	    					indexJ = j;
	    				}
	    			}
	    		}
	    		arrIndex[0][0] = indexI;
	    		arrIndex[0][1] = indexJ;
	    		int count = 1;
	    		for (int i = 0; i < HCM.length; i++) {
	    			for (int j = 0; j < HCM.length; j++) {
	    				if (i == indexI && j == indexJ) {
	    					
	    				} else {
	    					if (HCM[i][j] == min) {
	    						arrIndex[count][0] = i;
	    						arrIndex[count++][1] = j;
	    					}
	    				}
	    			}
	    		}
	    		int arrIndexValue[] = new int[count];
	    		for (int i = 0; i < count; i++) {
	    			for (int j = 0; j < HCM.length; j++) {
	    				arrIndexValue[i] += HCM[arrIndex[i][0]][j]; 
	    				arrIndexValue[i] += HCM[j][arrIndex[i][1]]; 
	    			}
	    		}
	    		int max = Integer.MIN_VALUE;
	    		for (int i = 0; i < count; i++) {
	    			if (arrIndexValue[i] > max) {
	    				max = i;
	    			}
	    		}
	    		indexI = arrIndex[max][0];
	    		indexJ = arrIndex[max][1];
	    		result += min;
	    		for (int i = 0; i < HCM.length; i++) {
	    			HCM[indexI][i] = 0;
	    			HCM[i][indexJ] = 0;
	    			HN[indexI][i] = 0;
	    			HN[i][indexJ] = 0;
	    		}
	    		check = !check;
	    	} else {
	    		for (int i = 0; i < HN.length; i++) {
	    			for (int j = 0; j < HN.length; j++) {
	    				if (HN[i][j] < min && HN[i][j] != 0) {
	    					min = HN[i][j];
	    					indexI = i;
	    					indexJ = j;
	    				}
	    			}
	    		}
	    		arrIndex[0][0] = indexI;
	    		arrIndex[0][1] = indexJ;
	    		int count = 1;
	    		for (int i = 0; i < HN.length; i++) {
	    			for (int j = 0; j < HN.length; j++) {
	    				if (i == indexI && j == indexJ) {
	    					
	    				} else {
	    					if (HN[i][j] == min) {
	    						arrIndex[count][0] = i;
	    						arrIndex[count++][1] = j;
	    					}
	    				}
	    			}
	    		}
	    		int arrIndexValue[] = new int[count];
	    		for (int i = 0; i < count; i++) {
	    			for (int j = 0; j < HN.length; j++) {
	    				arrIndexValue[i] += HN[arrIndex[i][0]][j]; 
	    				arrIndexValue[i] += HN[j][arrIndex[i][1]]; 
	    			}
	    		}
	    		int max = Integer.MIN_VALUE;
	    		for (int i = 0; i < count; i++) {
	    			if (arrIndexValue[i] > max) {
	    				max = i;
	    			}
	    		}
	    		indexI = arrIndex[max][0];
	    		indexJ = arrIndex[max][1];
	    		result += min;
	    		for (int i = 0; i < HN.length; i++) {
	    			HCM[indexI][i] = 0;
	    			HCM[i][indexJ] = 0;
	    			HN[indexI][i] = 0;
	    			HN[i][indexJ] = 0;
	    		}
	    		check = !check;
	    	}
	    	k++;
	    }
	    return result;
	}
	  static void in(int[][] a){
	   	for (int i = 0; i < a.length; i++) {
	     	for (int j = 0; j < a[0].length; j++) {
	         	System.out.print(a[i][j]+" "); 
	        }
	      System.out.println();
	    }
	  }
	public static void main(String[] args) {
		// "1 AM - 3 AM", "4 AM - 6 AM", "11 AM - 1 PM", "2 PM - 4 PM", "8 PM - 10 PM", "8 PM - 11 PM"], ["3 AM - 4 AM", "8 AM - 10 AM", "9 AM - 11 AM", "7 AM - 10 AM", "7 PM - 9 PM", "8 PM - 11 PM"
		// ["6 AM - 8 AM", "8 AM - 10 AM"], ["6 AM - 8 AM", "8 AM - 10 AM"]
		String a[] = {"6 AM - 8 AM"
					, "8 AM - 10 AM",
						"2 PM - 4 PM",
						"8 PM - 10 PM"};
										String b[] = {"8 AM - 10 AM"
													, "9 AM - 11 AM"
													, "2 PM - 4 PM"
													, "7 PM - 9 PM"};
//		String a[] = {"6 AM - 8 AM", "8 AM - 10 AM"};
//		String b[] = {"9 AM - 11 AM", "7 PM - 9 PM"};
		System.out.println(minimumLayover(a, b));
	}	

}
