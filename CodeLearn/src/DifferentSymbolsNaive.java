
public class DifferentSymbolsNaive {
	public static int differentSymbolsNaive(String s){
		int result = 0;
		int arrASSCI[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arrASSCI[s.charAt(i)]++;
		}
		for (int i = 0; i < arrASSCI.length; i++) {
			if (arrASSCI[i] > 0) result++;
 		}
		return result;
	}

	public static void main(String[] args) {

	}

}
