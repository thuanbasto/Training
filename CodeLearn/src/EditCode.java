
public class EditCode {
	public static int editCode(long n){
		n = n%1000000007;
		 return (int) ((int) n*(n+1)%1000000007*(n+2)/6)%1000000007;
	}

	public static void main(String[] args) {

	}

}
