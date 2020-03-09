
public class isEvenOrOdd {
	public static long convertBinaryToDec(String number) {
		long sum = 0;
		for(int i=0;i<number.length();i++) {
			if (number.charAt(i) == '1') {
				sum+= Math.pow(2, number.length()-1-i);
			}
		}
		return sum;
	}
	
	
	public static boolean isEvenOrOdd(String s)
	{
		if (s.equals("1")) {
			return true;
		}
		long dec = convertBinaryToDec(s);
		System.out.println("dec: " + dec);
		long result =(dec*(dec-1)*(dec-2))/6;
		System.out.println(result);
		if (result % 2 == 0 && result > 0) {
			return true;
		} else if (result % 2 == 1 && result < 0){
			return true;
		} else return false;
	}

	public static void main(String[] args) {
		String s = "1000";
		System.out.println(isEvenOrOdd(s));
	}

}
