
public class MinTyping {
	public static int minTyping(String str){
		int result = 0;
		boolean check = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				check = false;
				break;
			}
		}
		if (check) return 0;
		String temp = str.replaceAll(" ", "");
		temp = temp.replaceAll("[0-9]", "");
		temp = temp.replaceAll("[^A-Z]"," ");
		while (temp.contains("  ")) {
			temp = temp.replace("  ", " ");
		}
		String arr[] = temp.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 4) {
				result+=4;
			} else {
				result+=arr[i].length();
			}
		}
		System.out.println(temp);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(minTyping("AAAAB231A"));
	}

}
