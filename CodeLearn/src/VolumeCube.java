
public class VolumeCube {
	public static int volumeCube(long n){
		int result = 0;
		long temp = n%1000000007*(n+1)%1000000007/2;
		temp = (long) (Math.pow(temp, 2)%1000000007);
		result = (int)temp;
		return result;
	}

	public static void main(String[] args) {

	}

}
