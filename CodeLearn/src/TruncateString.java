
public class TruncateString {
	public static String truncateString(String s){
		while(s.length() > 0) {
			int first = Integer.valueOf(String.valueOf(s.charAt(0)));
			int last = Integer.valueOf(String.valueOf(s.charAt(s.length()-1)));
			if (first % 3 == 0)
				s = s.substring(1);
			else if (last % 3 == 0)
				s = s.substring(0,s.length()-1);
			else if ((first + last) % 3 == 0) 
				s = s.substring(1,s.length()-1);
			else break;
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(truncateString("312248"));
	}

}
