
public class IsPowerOfFour {
	public static long pow(long number,int n) {
		long result = 1;
		if (n == 0) {
			return result;
		}
		for (int i = 0; i < n; i++) {
			result *= number;
		}
		return result;
	}
	public static boolean isPowerOfFour(long n)
	{	
		for (int i = 0; i < 32; i++) {
			if (pow(4, i) == n) 
				return true;
		}
		return false;
	}
	public static boolean isPowerOfFour2(long n)
	{
	    if(n == 1)
	        return true;
	    while(n > 4){
	        if((int)n%4 != 0)
	            return false;
	        n /= 4;
	    }
	    return true;
	}
	public static void main(String[] args) {
		// 274877906944
		long s1 = System.currentTimeMillis();
		System.out.println(isPowerOfFour(1099511627776L));
		long s2 = System.currentTimeMillis();
		System.out.println(s2-s1);
		System.out.println(isPowerOfFour2(1099511627776L));
		System.out.println(pow(4,20));
		System.out.println((long)Math.pow(4, 20));
	}

}
