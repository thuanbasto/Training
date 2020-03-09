
public class CountSheeps {
	public static String countSheeps(String time, int sh){
		String result = "";
		String[] arr = time.split(":");
		int h = Integer.valueOf(arr[0]);
		int m = Integer.valueOf(arr[1]);
		int s = Integer.valueOf(arr[2]);
		s = s + sh;
		if (s >= 60) {
			m += s/60;
			s = s % 60;
		}
		if (m >= 60) {
			h += m/60;
			m = m % 60;
		}
		if (h >= 24) {
			h = h % 24;
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

	}

}
