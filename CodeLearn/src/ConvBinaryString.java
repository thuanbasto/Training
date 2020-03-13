
public class ConvBinaryString {
	public static boolean convBinaryString(String a, String b){
		int count =  0;
		if (a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		while (true) {
			if (a.equals(b)) return true;
			if (a.length() - b.length() >= 1) {
//				if (a.length() - b.length() == 1) {
//					String temp = a;
//					String temp2 = a;
//					temp = temp.substring(1)+"1";
//					temp2 = temp2.substring(1)+"1";
//					if (temp.equals(b) || temp2.equals(b)) return true;
//				}
				a = a.substring(1);
			} else {
				int countBinary1 = 0;
				for (int i = 0; i < a.length(); i++) {
					if (a.charAt(i) == '1') countBinary1++;
				}
				if (countBinary1 % 2 != 0) {
					a += "1";
				} else {
					a += "0";
				}
			}
			count++;
			if (count > 100000) break;
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
