
public class CharactersInString {
	public static char charactersInString(long n){
		String temp = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (n%26 == 0) return 'Z';
		return temp.charAt((int) (n%26));
	}

	public static void main(String[] args) {

	}

}
