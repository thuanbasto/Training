import java.util.Arrays;

public class CharactersRearrangement {
	public static  boolean charactersRearrangement(String s1, String s2){
		if (s1.length() != s2.length()) return false;
		String arr1[] = s1.split("");
		String arr2[] = s2.split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		s1 = String.join("", arr1);
		s2 = String.join("", arr2);
		if (!s1.equals(s2)) return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println();
	}

}
