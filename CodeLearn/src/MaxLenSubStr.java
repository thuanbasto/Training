
public class MaxLenSubStr {
	public static int maxLenSubStr(String str){
		int max = -1;
		for (int i = 0; i < str.length(); i++) {
			String temp = String.valueOf(str.charAt(i));
			int index1 = str.indexOf(temp);
			int index2 = str.lastIndexOf(temp);
			if (index2 - index1 > max) max = index2-index1;
		}
		return max+1;
	}

	public static void main(String[] args) {

	}

}
