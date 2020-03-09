
public class NextDay {
	public static String nextDay(String s) {
		String result = "";
		int day = Integer.valueOf(s.substring(0,s.indexOf("/")));
		int month = Integer.valueOf(s.substring(s.indexOf("/")+1,s.lastIndexOf("/")));
		int year = Integer.valueOf(s.substring(s.lastIndexOf("/")+1));
		System.out.println(day +" "+ month + " "+ year);
		if (month == 1 || month == 3 ||  month == 5 ||  month == 7 ||  month == 8 ||  month == 10 ||  month == 12) {
			if (day == 31) {
				day = 1;
				month++;
			} else day++;
		} else if (month == 2) {
			if (year % 4 ==0) {
				if (day == 29) {
					day = 1;
					month++;
				} else day ++;
			} else {
				if (day == 28) {
					day = 1;
					month++;
				} else day ++;
			}
		} else {
			if (day == 30) {
				day = 1;
				month++;
			} else day ++;
		}
		if (month > 12) {
			month -= 12;
			year++;
		} 
		result = day+"/"+month+"/"+year;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(nextDay("28/1/1999"));
	}
}
