import java.util.Date;

public class CountNumberOfDay {
	public static int countNumberOfDay(int year, String date){
		int result = 0;
		int day = Integer.valueOf(date.substring(date.indexOf("/")+1));
		int month = Integer.valueOf(date.substring(0,date.indexOf("/")));
		int[] monthOfYear = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		result = day - 1;
		for (int i=1;i<month;i++) {
			result += monthOfYear[i];
		}
		if (year % 100 == 0){
			if (year % 4 == 0 && month > 2 && year % 400 == 0) {
				result++;
			}
		}
		else if (year % 4 == 0 && month > 2 && year % 400 != 0){
			result++;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(countNumberOfDay(1700, "12/31"));
		Date a = new Date("1/1/1700");
		Date b = new Date ("12/31/1700");
		System.out.println((b.getTime()-a.getTime())/(24 * 3600 * 1000));
	}
}
