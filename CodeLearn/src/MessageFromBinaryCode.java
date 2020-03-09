
public class MessageFromBinaryCode {
	public static long convertBinaryToDec(String number) {
		long sum = 0;
		for(int i=0;i<number.length();i++) {
			if (number.charAt(i) == '1') {
				sum+= Math.pow(2, number.length()-1-i);
			}
		}
		return sum;
	}
	public static String messageFromBinaryCode(String code){
		String result = "";
		while (!code.equals("")) {
			System.out.println(code);
			long temp = convertBinaryToDec(code.substring(0,8));
			result += (char) temp; 
			code = code.substring(8);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(messageFromBinaryCode("010010000110010101101100011011000110111100100001"));
	}

}
