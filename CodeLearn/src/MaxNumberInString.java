
public class MaxNumberInString {
	public static int maxNumberInString(String str) {
		int result = -1;
		if (!str.matches(".*[1-9].*")) return -1;
		str = str.replaceAll("[a-zA-Z]", " ");
		while(str.contains("  ")) {
			str = str.replaceAll("  ", " ");
		}
		str = str.trim();
		System.out.println(str);
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int temp = Integer.valueOf(arr[i]);
			if (temp > result) result = temp;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(maxNumberInString("vu6s16ms79qk9lxg"));
	}

}
