
public class CircleNum {
	public static long circlenum2(long l, long r){
		long result = 0;
		// length l;
		String tempL = l + "";
		int lengthL = tempL.length();
		// length r
		String tempR = r + "";
		int lengthR = tempR.length();
		
		if (lengthL == lengthR) {
			for (long i = l; i <= r; i++) {
				if (i < 10) {
					result++;
				} else {
					String temp = "" + i;
					if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
						result++;
					}
				}
			}
			return result;
		}
		// tính từ l -> 10^lengthL
		long max = (long) Math.pow(10, lengthL);
		for (long i = l; i < max; i++) {
			if (i < 10) {
				result++;
			} else {
				String temp = "" + i;
				if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
					result++;
				}
			}
		}
		// tính đoạn giữa chắc chắn chứa những Số Vòng từ 10^lengthL -> 10^LengthR-1
		for (int i = lengthL+1; i < lengthR; i++) {
			result += Math.pow(10, i-2)*9;
		}
		
		// tính đoạn còn lại từ 10^LengthR-1 -> r
		long min = (long) Math.pow(10, lengthR-1);
		for (long i = r; i > min; i--) {
			if (i < 10) {
				result++;
			} else {
				String temp = "" + i;
				if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
					result++;
				}
			}
		}

		return result;
	}
	public static long circlenum3(long l, long r){
		long resultL = 0;
		long resultR = 0;
		// length l;
		String tempL = l + "";
		int lengthL = tempL.length();
		// length r
		String tempR = r + "";
		int lengthR = tempR.length();
		
		if (lengthL > 2) {
			String index = l/100 + "";
			resultL = Long.valueOf(index);
			
			if (Integer.valueOf(tempL.substring(0,1)) > Integer.valueOf(tempL.substring(lengthL-2))) {
				resultL= resultL*10+8;
			} else if (Integer.valueOf(tempL.substring(0,1)) == Integer.valueOf(tempL.substring(lengthL-2))) {
				resultL= resultL*10+9;
			} else if (Integer.valueOf(tempL.substring(0,1))+10 == Integer.valueOf(tempL.substring(lengthL-2))) {
				resultL= (resultL+1)*10;
			} else {
				int count = 0;
				int a = Integer.valueOf(tempL.substring(lengthL-2));
				for (int i = 1; i <= a; i++) {
					if (i < 10) {
						count++;
					} else {
						String temp = "" + i;
						if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
							count++;
						}
						else if (i == a && tempL.charAt(0) <= temp.charAt(temp.length()-1)) {
							count++;
						}
					}
				}
				if (count >= 10) {
					count-=10;
					resultL= (resultL+1)*10+count;
				}
				if (tempL.charAt(0) >= tempL.charAt(tempL.length()-2) &&
						tempL.charAt(0) < tempL.charAt(tempL.length()-1)) {
					resultL--;
				}
//				if (Integer.valueOf(tempL.substring(0,1)) > Integer.valueOf(tempL.substring(lengthL-1))
//					&& Integer.valueOf(tempL.substring(0,1)) > Integer.valueOf(tempL.substring(lengthL-2,lengthL-1))) {
//					resultL++;
//				}
			}
		} else {
			for (long i = 1; i <= l; i++) {
				if (i < 10) {
					resultL++;
				} else {
					String temp = "" + i;
					if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
						resultL++;
					}
				}
			}
		}
		if (lengthR > 2) {
			String index = r/100 + "";
			resultR = Long.valueOf(index);
			
			if (Integer.valueOf(tempR.substring(0,1)) > Integer.valueOf(tempR.substring(lengthR-2))) {
				resultR= resultR*10+8;
			} else if (Integer.valueOf(tempR.substring(0,1)) == Integer.valueOf(tempR.substring(lengthR-2))) {
				resultR= resultR*10+9;
			} else if (Integer.valueOf(tempR.substring(0,1))+10 == Integer.valueOf(tempR.substring(lengthR-2))) {
				resultR= (resultR+1)*10;
			} else {
				int count = 0;
				int a = Integer.valueOf(tempR.substring(lengthR-2));
				for (int i = 1; i <= a; i++) {
					if (i < 10) {
						count++;
					} else {
						String temp = "" + i;
						if (temp.charAt(0) == temp.charAt(temp.length()-1) ) {
							count++; 
						}
						else if (i == a && tempR.charAt(0) <= temp.charAt(temp.length()-1)) {
							count++;
						}
					}
				}
				if (count >= 10) {
					count-=10;
					resultR= (resultR+1)*10+count;
				}
				if (tempR.charAt(0) >= tempR.charAt(tempR.length()-2) && 
						tempR.charAt(0) <= tempR.charAt(tempR.length()-1)) {
					resultR--;
				}
//				if (Integer.valueOf(tempR.substring(0,1)) > Integer.valueOf(tempR.substring(lengthR-1))
//					&& Integer.valueOf(tempR.substring(0,1)) > Integer.valueOf(tempR.substring(lengthR-2,lengthR-1))) {
//					resultR--;
//				} 
			}
		} else {
			for (long i = 1; i <= r; i++) {
				if (i < 10) {
					resultR++;
				} else {
					String temp = "" + i;
					if (temp.charAt(0) == temp.charAt(temp.length()-1)) {
						resultR++;
					}
				}
			}
		}
//		System.out.println(resultR);
//		System.out.println(resultL);
		long result = resultR - resultL;
		if (tempL.charAt(0) == tempL.charAt(tempL.length()-1)) {
			result++;
		}
		return result;
	}
	public static long circlenum(long l, long r){
		l = l - 1;
		long resultL = 0;
		long resultR = 0;
		// length l;
		String tempL = l + "";
		int lengthL = tempL.length();
		// length r
		String tempR = r + "";
		int lengthR = tempR.length();
	    
	    if(l < 10){
	    	resultL += l;
	    }
	    else{
	        String temp = tempL.substring(1,lengthL-1);
	        // từ 1 - 9 
	        resultL += 9;
	        for(int i = 2; i < lengthL; i++){
	        	resultL += 9 * Math.pow(10,i-2);
	        }
	        if(Integer.parseInt(tempL.substring(0,1)) - 1 > 0){
	        	resultL += (Integer.parseInt(tempL.substring(0,1)) - 1) * Math.pow(10, lengthL - 2);
	        }
	        if(temp.length() != 0) {
	        	resultL += Long.parseLong(temp);
	        }
	        if(Integer.parseInt(tempL.substring(0,1)) <= Integer.parseInt(tempL.substring(lengthL-1))) {
	        	resultL++;
	        }
	    }
	    if(r < 10){
	    	resultR += r;
	    }
	    else{
	    	String temp = tempR.substring(1,lengthR-1);
	        // từ 1 - 9 
	    	resultR += 9;
	        for(int i = 2; i < lengthR; i++){
	        	resultR += 9 * Math.pow(10,i-2);
	        }
	        if(Integer.parseInt(tempR.substring(0,1)) - 1 > 0){
	        	resultR += (Integer.parseInt(tempR.substring(0,1)) - 1) * Math.pow(10, lengthR - 2);
	        }
	        if(temp.length() != 0) {
	        	resultR += Long.parseLong(temp);
	        }
	        if(Integer.parseInt(tempR.substring(0,1)) <= Integer.parseInt(tempR.substring(lengthR-1))) {
	        	resultR++;
	        }
	    }
	    long result = resultR-resultL;
	    return result;
	}

	public static long circlenum4(long l, long r)
	{
	    l = l-1;
	    long countL = 0;
	    long countR = 0;
	    String L = l+"";
	    String R = r+"";
	    int lengL = L.length();
	    int lengR = R.length();
	    if(l < 10){
	        countL += l;
	    }
	    else{
	        String tmp = L.substring(1,lengL-1);
	        int n = Integer.parseInt(L.substring(0,1));
	        long lg = 0;
	        countL += 9;
		//Tìm số biến tổng khi bỏ đi phần lẻ ở giữa
	        for(int i = 2; i < lengL; i++){
	            countL += 9 * Math.pow(10,i-2);
	        }
		//Tìm số đầu tiên của kết quả
	        if(n - 1 > 0){
	            countL += (n - 1) * Math.pow(10, lengL - 2);
	        }
		//Thêm phần lẻ vào trong kết quả
	        if(tmp.length() != 0)
	            lg = Long.parseLong(tmp);
	        countL += lg + 1;
		//nếu số đầu tiên lớn hơn số cuối cùng kết quả -1
	        if(n > Integer.parseInt(L.substring(lengL-1)))
	            countL -= 1;
	    }
	    if(r < 10){
	        countR += r;
	    }
	    else{
	        String tmp = R.substring(1,lengR-1);
	        int n = Integer.parseInt(R.substring(0,1));
	        long lg = 0;
	        countR += 9;
	        for(int i = 2; i < lengR; i++){
	            countR += 9 * Math.pow(10,i-2);
	        }
	        
	        if(n - 1 > 0){
	            countR += (n - 1) * Math.pow(10, lengR - 2);
	        }
	        if(tmp.length() != 0)
	            lg = Long.parseLong(tmp);
	        countR += lg + 1;
	        if(n > Integer.parseInt(R.substring(lengR-1)))
	            countR -= 1;
	    }
	    return countR-countL;
	}
	public static void main(String[] args) {
		System.out.println("----");
		System.out.println(circlenum3(1,45213322511L));
		System.out.println(circlenum3(1,784));
		System.out.println(circlenum3(1212121,3232323));
		System.out.println("----");
		System.out.println(circlenum(1,11));
		System.out.println(circlenum4(1,11));
	}

}
