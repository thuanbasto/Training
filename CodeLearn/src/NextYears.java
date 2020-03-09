
public class NextYears {
	public static int nextYears(int a, int b){
		int result = 0;
		double temp = (double)a/b-2;
		result =(int) (Math.round(temp*b));
		return result;
	}

	public static void main(String[] args) {
		System.out.println(nextYears(56, 20));
	}

}
