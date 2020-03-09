
public class Decipher {
	public static String decipher(String cipher){
		String result = "";
		String tempCipher = cipher;
		int index = 0;
		while (index < cipher.length()) {
			if (Integer.valueOf(tempCipher.substring(0,2)) < 97) {
				int temp = Integer.valueOf(tempCipher.substring(0,3));
				result += (char)temp; 
				tempCipher = tempCipher.substring(3);
				index+=3;
			} else {
				int temp = Integer.valueOf(tempCipher.substring(0,2));
				result += (char)temp; 
				tempCipher = tempCipher.substring(2);
				index+=2;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(decipher("10197115121"));
	}

}
