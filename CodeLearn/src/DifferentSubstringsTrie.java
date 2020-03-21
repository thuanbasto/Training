
public class DifferentSubstringsTrie {
	public static int differentSubstringsTrie(String inputString){
		int result = inputString.length();
		int arrASSCI[] = new int[226];
		for (int i = 0; i < inputString.length(); i++) {
			result += i;
			arrASSCI[inputString.charAt(i)]++;
		}
		for (int i = 0; i < arrASSCI.length; i++) {
			if (arrASSCI[i] > 1) {
				for (int j = 1; j <= arrASSCI[i]-1; j++) {
					result -=j;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(differentSubstringsTrie("abac"));
	}

}
