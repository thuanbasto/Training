
public class IsPossibleTransformation {
	public static boolean isPossibleTransformation(String s, String t){
		if (s.length() > t.length() || s.length() < t.length()) return false;
		String consonant = "ueoai";
		for (int i = 0; i < s.length(); i++) {
			if (!consonant.contains(String.valueOf(s.charAt(i))) && 
					consonant.contains(String.valueOf(t.charAt(i)))) {
				return false;
			} else if (consonant.contains(String.valueOf(s.charAt(i))) && 
					!consonant.contains(String.valueOf(t.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
