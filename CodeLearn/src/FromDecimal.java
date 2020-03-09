
public class FromDecimal {
	public static String fromDecimal(int b, int n){
		String result = "";
		int count = 0;
		String arr[] = new String[10000];
		while (n >= b) {
			arr[count++] =""+ n%b;
			n/=b;
		}
		if (n != 0) {
			arr[count++] = ""+ n;
		}
		for (int i = count-1; i >= 0; i--) {
			result += arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(fromDecimal(3,66));
	}

}
