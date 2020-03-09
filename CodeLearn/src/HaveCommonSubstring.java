
public class HaveCommonSubstring {
	public static boolean haveCommonSubstring(String a, String b, int n){
		int lenghtA = a.length()-n;
		for (int i = 0; i <= lenghtA; i++) {
			if (b.contains(a.substring(i,i+n))) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(haveCommonSubstring("azpd", "fsoft", 1));
	}

}
