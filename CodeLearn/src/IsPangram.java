
public class IsPangram {
	public static boolean isPangram(String s){
		s = s.toLowerCase();
		int arrASSCI[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arrASSCI[s.charAt(i)]++;
		}
		for (int i = 97; i < 123; i++) {
			if (arrASSCI[i] == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPangram("qwer3.tyuioplkjdchg,dsazxcvbnmpoic(dgfu)ytrewqas dfghjkgbblmnbvcxz"
));
	}

}
