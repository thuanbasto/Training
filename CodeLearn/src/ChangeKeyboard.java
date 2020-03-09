
public class ChangeKeyboard {
	public static int changeKeyboard(String str){
		int result = 0;
		if (str.length() <= 1) return 0;
		int row = 0;
		String arr[] = {"0123456789","asdfghjkl","qwertyuiop","zxcvbnm"};
		for (int i = 0; i < str.length(); i++) {
			String temp = str.substring(i,i+1);
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].contains(temp)) {
					if (row != j) {
						result++;
						row = j;
					}
					break;
				}
			}
		}
		if (Integer.valueOf(str.charAt(0)) >= 48 && Integer.valueOf(str.charAt(0)) <= 57) result++;
		return result-1;
	}

	public static void main(String[] args) {
		System.out.println(changeKeyboard("87sq3fgu6qgsc2aeluaj"));
	}

}
