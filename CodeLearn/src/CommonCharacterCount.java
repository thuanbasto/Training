
public class CommonCharacterCount {
	public static int commonCharacterCount(String s1, String s2){
		int result = 0;
		for (int i = 0; i < s1.length(); i++) {
			String temp = String.valueOf(s1.charAt(i));
			if (s2.contains(temp)) {
				int index = s2.indexOf(temp);
				s2 = s2.substring(0,index) + s2.substring(index+1);
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String a = "1231";
	}

}
