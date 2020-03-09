
public class SummationTime {
	public static String summationTime(String a, String b){
		String result = "";
		String arrA[] = a.split(":");
		String arrB[] = b.split(":");
		int hA = Integer.valueOf(arrA[0]);
		int mA = Integer.valueOf(arrA[1]);
		int sA = Integer.valueOf(arrA[2]);
		int hB = Integer.valueOf(arrB[0]);
		int mB = Integer.valueOf(arrB[1]);
		int sB = Integer.valueOf(arrB[2]);
		int hC = hB + hA; 
		int mC = mB + mA; 
		int sC = sB + sA;
		if (sC >= 60) {
			mC++;
			sC -= 60;
		}
		if (mC >= 60) {
			hC++;
			mC -= 60;
		} 
		if (hC >= 24) {
			hC -=24;
		}
		if (hC < 10) result += "0"+hC+":";
		else result += hC+":";
		if (mC < 10) result += "0"+mC+":";
		else result += mC+":";
		if (sC < 10) result += "0"+sC;
		else result += sC;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(summationTime("23:59:59", "00:00:01"));
	}

}
