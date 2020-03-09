
public class LAMP {
	public static long lamp(int m, int n){
		long tempM = 0;
		long tempN = 0;
		tempM = (m)/2;
		tempN = (n)/2;
		if (m % 2 != 0)
			tempM++;
		if (n % 2 != 0) 
			tempN++;
	    return tempM*tempN;
	}

	public static void main(String[] args) {
		System.out.println(lamp(1,4));
	}

}
