import java.math.BigInteger;

public class SumMoney {
	public static int sumMoney(long n)
	{
		long temp = (((n%1000000007)*((n+1)%1000000007))%1000000007*((n+2)%1000000007)/6)%1000000007;
		return (int)temp ;
	}

	public static void main(String[] args) {
		System.out.println(sumMoney(1000000000000000000L));
	}

}
