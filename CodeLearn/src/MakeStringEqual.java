
public class MakeStringEqual {
	public static int makeStringEqual(String a, String b){
		int result = 0;
		int count = 0;
		if (a.equals(b)) return 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != b.charAt(i)) {
				count++;
			} else {
				if (count > 0) result++;
				count=0;
			}
		}
		if (count != 0) result++;
		return result;
	}

	public static void main(String[] args) {

	}

}
