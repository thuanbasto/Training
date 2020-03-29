
public class IsValidDate {
	public static boolean isValidDate(int d, int m, int y) {
		if (d > 31 || d < 1 || m > 12 || m < 1 || y < 1) return false;
		if (m == 2 && d > 29) return false;
		if (m == 2 && y % 4 == 0 && y % 400 == 0 && y % 100 == 0) {
			if (d > 29) return false;
		}
		if (y % 4 != 0 && m == 2)
			if (d > 28) return false;
		if (m == 4 || m == 6 || m == 9 || m == 11) 
			if (d > 30) return false;
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isValidDate(28, 2, 9));
	}	

}
