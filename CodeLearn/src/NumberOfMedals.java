
public class NumberOfMedals {
	public static String numberOfMedals(String[] arr){
		String result = "";
		int[] arr2 = new int[arr.length]; // mảng lưu thành tích
		int maxOfMax = 0;
		int i = 0;
		int lenght = arr.length;
		while (i < lenght) {
			if (arr[i].contains("P") == false) {
				arr2[i] = 0;
			} else {
				int[] arrIndex = new int[3];
				int max = 0;
				int count = 0;
				for (int j = 0; j < arr[i].length(); j++) {
					if (arr[i].charAt(j) == 'P' || arr[i].charAt(j) == 'F') {
						arrIndex[count++] = j;
					}
				}
				count = 0;
				while (count < 3) {
					if (arr[i].charAt(arrIndex[count]) == 'P') {
						if (count == 0) {
							int temp = Integer.valueOf(arr[i].substring(0,arrIndex[count]));
							if (temp > max) {
								max = temp;
							}
						} else {
							int temp = Integer.valueOf(arr[i].substring(arrIndex[count-1]+1,arrIndex[count]));
							if (temp > max) {
								max = temp;
							}
						}
						if (max > maxOfMax) {
							maxOfMax = max;
						}
					}
					count++;
				}
				System.out.println(max);
				arr2[i] = max;
			}
			i++;
		}
//		System.out.println(maxOfMax);
//		if (maxOfMax == 0) {
//			return "";
//		} else {
//			int count = 0;
//			for (int j = 0; j < arr2.length; j++) {
//				if (arr2[j] == maxOfMax) {
//					count++;
//				}
//			}
//			if (count>1) {
//				result+= count+"S";
//				int max2 = -1;
//				count = 0;
//				for (int j = 0; j < arr2.length; j++) {
//					if (arr2[j] < maxOfMax && arr2[j] > max2) {
//						max2 = arr2[j];
//					}
//				}
//				if (max2 == 0) {
//					return result;
//				} else {
//					for (int j = 0; j < arr2.length; j++) {
//						if (arr2[j] == max2) {
//							count++;
//						}
//					}
//				}
//				result+=count+"B";
//			} else {
//				result+="1G";
//				// kiếm nhưỡng người hạng bacj
//				int max2 = -1;
//				count = 0;
//				for (int j = 0; j < arr2.length; j++) {
//					if (arr2[j] < maxOfMax && arr2[j] > max2) {
//						max2 = arr2[j];
//					}
//				}
//				if (max2 <= 0) {
//					return result;
//				} else {
//					for (int j = 0; j < arr2.length; j++) {
//						if (arr2[j] == max2) {
//							count++;
//						}
//					}
//				}
//				result+=count+"S";
//				// kiếm nhưỡng người hạng đồng
//				int max3 = -1;
//				count = 0;
//				for (int j = 0; j < arr2.length; j++) {
//					if (arr2[j] < max2 && arr2[j] > max3) {
//						max3 = arr2[j];
//					}
//				}
//				if (max3 <= 0) {
//					return result;
//				} else {
//					for (int j = 0; j < arr2.length; j++) {
//						if (arr2[j] == max3) {
//							count++;
//						}
//					}
//				}
//				result+=count+"B";
//			}
//		}
		int gold = 0, silve = 0, bronze = 0;
	    int max1 = 0, max2 = 0, max3 = 0;
	    for(int j = 0; j < arr2.length; j++){
	        if(arr2[j] == 0){
	            continue;
	        }
	        if(arr2[j] == max1 && gold == 1){
	            max3 = max2;
	            max2 = max1;
	            bronze = silve;
	            silve = gold+1;
	            gold = 0;
	        }
	        else if(arr2[j] > max1){
	            if(gold != 0){
	                max3 = max2;
	                max2 = max1;
	                max1 = arr2[j];
	                bronze = silve;
	                silve = gold;
	                gold = 1;
	            }
	            else{
	                max1 = arr2[j];
	                gold = 1;
	            }
	        }
	        else if(arr2[j] > max2){
	            max3 = max2;
	            max2 = arr2[j];
	            bronze = silve;
	            silve = 1;
	        }
	        else if(arr2[j] == max2){
	            silve++;
	        }
	        else if(arr2[j] > max3){
	            max3 = arr2[j];
	            bronze = 1;
	        }
	        else if(arr2[j] == max3){
	            bronze++;
	        }
	    }
	    String rs = "";
	    if(gold != 0){
	        rs = rs.concat(gold+"G");
	    }
	    if(silve != 0){
	        rs = rs.concat(silve+"S");
	    }
	    if(bronze != 0){
	        rs = rs.concat(bronze+"B");
	    }
		return rs;
	}

	public static void main(String[] args) {
		String[] arr = {"123P124P125P","123P124F126P","100P130P140F","125P126P123F","100F101F120P","100F101F128P","100F145F160F"};
		String[] temp = {"0F1F0P","0F2F0P"};
		System.out.println(numberOfMedals(temp));
	}

}
