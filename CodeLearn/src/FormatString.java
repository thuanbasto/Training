
public class FormatString {
	public static String formatString(String input){
		input = input.trim();
		while(input.contains("  ")) {
			input = input.replace("  " ," ");
		}
		return input;
	}

	public static void main(String[] args) {

	}

}
