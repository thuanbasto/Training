
public class AmendTheSentence {
	public static String amendTheSentence(String s){
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				result += " " + String.valueOf(s.charAt(i)).toLowerCase();
			} else {
				result += s.charAt(i);
			}
		}
		result = result.trim();
		return result;
	}

	public static void main(String[] args) {

	}

}
