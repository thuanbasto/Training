
public class CheckMax {
	public static int checkMax(String str){
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (result < str.charAt(i)) {
				result = str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
