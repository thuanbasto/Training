
public class CountRightBracket {
	public static int move(int pos,int n,int a, int b) {
		int count = 0;
		if (b == n)
			return 1;
		else {
			if (a > b) 	
				count += move(pos+1,n,a,b+1);
			if (a < n) 
				count += move(pos+1,n,a+1,b);
		}
		return count;
	}
	public static int countRightBracket(int n){
		int result = 0;
		if (n % 2 == 1) return 0;
		if (n > 0)
			result = move(0,n/2,0,0);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(countRightBracket(4));
	}

}
