
public class DeleteChar {
	public static String deleteChar(String s, int k) {
		if ((double)s.length()/k == 2) {
			long a = Long.valueOf(s.substring(0,s.length()/2));
			long b = Long.valueOf(s.substring(s.length()/2));
			System.out.println(a);
			System.out.println(b);
			if (a > b) {
				return String.valueOf(a);
			} else {
				return String.valueOf(b);
			}
		}
		while(k > 0) {
			boolean check = false;
			for (int i = 0; i < s.length()-1; ++i) {
				if (k > 0) {
					if (s.charAt(i) < s.charAt(i+1)) {
						s = s.substring(0,i) + s.substring(i+1);
						k--;
						i--;
						check = true;
					}
				} else break;
			}
			if (!check) {
				for (int i = s.length()-1; i > 0; --i) {
					if (k > 0) {
						if (s.charAt(i) >= s.charAt(i-1)) {
							s = s.substring(0,i-1) + s.substring(i);
							System.out.println(s);
							k--;
							i=s.length();
						}
					} else break;
				}
			}
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.println(deleteChar("11000", 3));
	}

}
