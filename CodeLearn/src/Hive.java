
public class Hive {
	public static long hive(int n){
		long temp = (long)n;
		return 3*temp*(temp-1)+1;
	}

	public static void main(String[] args) {
		System.out.println(hive(2));
	}

}
