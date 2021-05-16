
public class BeautifulNumberCt {
	public static long beautifulNumberCt(long n) {
		long result = 0;
		long temp = n;
		long count = 39;
		System.out.println((long) Math.pow(3, 39));
		while(count >= 0) {
			long number = (long) Math.pow(3, count);
			if (temp >= number) {
				temp -= number;
				result += number;
			}
			count--;
		}
		System.out.println(n-temp);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(beautifulNumberCt(1976246031410488366L));
	}

}
