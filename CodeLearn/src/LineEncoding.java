
public class LineEncoding {
	public static String lineEncoding(String s){
		String result = "";
		char temp = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (temp == s.charAt(i)) {
				count++;
			} else {
				if (count > 1) {
					result += count + String.valueOf(temp);
				} else {
					result += temp;
				}
				temp = s.charAt(i);
				count = 1;
			}
		}
		if (count > 1) {
			result += count + String.valueOf(temp);
		} else if (count == 1){
			result += temp;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(lineEncoding("aabbbc"));
	}

}
