import java.math.BigInteger;

public class ArrayZero {
	public static int arrayZero(String[] s){
		int result = 0;
		BigInteger a = new BigInteger(s[0]);
		BigInteger b = new BigInteger(s[1]);
		BigInteger c = new BigInteger(s[2]);
		BigInteger d = new BigInteger(s[3]);
		while (true) {
			if (a.compareTo(new BigInteger("0")) == 0
				&& b.compareTo(new BigInteger("0")) == 0
				&& c.compareTo(new BigInteger("0")) == 0
				&& d.compareTo(new BigInteger("0")) == 0) break;
			BigInteger tempA = a.subtract(b).abs();
			BigInteger tempB = b.subtract(c).abs();
			BigInteger tempC = c.subtract(d).abs();
			BigInteger tempD = d.subtract(a).abs();
			a = tempA;
			b = tempB;
			c = tempC;
			d = tempD;
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		String s[] = {"2071","3159","2163","1268"};
		System.out.println(arrayZero(s));
	}

}
