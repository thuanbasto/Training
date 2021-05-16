
public class FirstBigger {
	public static int firstBigger(int a, int b) {
		int count = 1;
		while(count*a <= b) {
			count++;
		}
		return a*count;
	}
	public static void main(String[] args) {
		System.out.println(firstBigger(2,9));
	}

}
