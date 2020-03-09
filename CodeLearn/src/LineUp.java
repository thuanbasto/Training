
public class LineUp {
	public static String lineUp(String s, int t){
		while (t-->0) {
			s = s.replace("BG", "GB");
		}
		return s;
	}

	public static void main(String[] args) {
		
	}

}
