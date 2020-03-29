
public class TimeCalculation {
	public static String timeCalculation(int s) {
		String result = "";
		int h = 0;
		int m = 0; 
		if (s >= 60) {
			m = s/60;
			s %= 60;
		}
		if (m >= 60) {
			h = m/60;
			m %= 60;
		} 
		if (h >= 24) {
			h %=24;
		}
		if (h < 10) result += "0"+h+":";
		else result += h+":";
		if (m < 10) result += "0"+m+":";
		else result += m+":";
		if (s < 10) result += "0"+s;
		else result += s;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(timeCalculation(100000));
	}
}
