
public class ClockHandAngle {
	public static double clockHandAngle(String string){
		double result = 0;
		double h = Double.valueOf(string.substring(0,string.indexOf(":")));
		double m = Double.valueOf(string.substring(string.indexOf(":")+1,string.lastIndexOf(":")));
		double s = Double.valueOf(string.substring(string.lastIndexOf(":")+1));
		// độ chênh lệch giữa 2 kim giờ và phút sau mỗi phút
		// 6-0.5 =5.5
		double rH=0;
		if (s > 0) {
			m += s/60;
		}
		if (h > 0) {
			rH += 30*h;
			if (rH >= 360) {
				rH -= 360;
			}
		}
		result = Math.abs(rH - 5.5*m);
		if (result > 180) {
			result = Math.abs(result-360);
		}
		result = (double)Math.round(result*100000)/100000;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(clockHandAngle("8:60:60"));
	}
}
