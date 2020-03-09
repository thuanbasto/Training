
public class CoolString {
	public static boolean coolString(String inputString){
		for (int i = 0; i < inputString.length()-1; i++) {
			if (Integer.valueOf(inputString.charAt(i)) >= 97 &&
					Integer.valueOf(inputString.charAt(i+1)) >= 97) {
				return false;
			} else if (Integer.valueOf(inputString.charAt(i)) >= 65 &&
						Integer.valueOf(inputString.charAt(i+1)) >= 65 &&
						Integer.valueOf(inputString.charAt(i)) < 97 && 
						Integer.valueOf(inputString.charAt(i+1)) < 97) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(coolString("aAA"));
	}

}
