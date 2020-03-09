
public class NextNumber {

	public static int nextNumber(int[] a){
		// a[i] = m*a[i-1] + n
		if (a[0]==a[1]) {
			return a[0];
		}
		int m=0,n=0;
		m = (a[1]-a[2])/(a[0]-a[1]);
		n = a[2]-a[1]*m;
		return a[a.length-1]*m+n;
	}

	public static void main(String[] args) {
		int[] a = {1,1,1,1};
		System.out.println(nextNumber(a));
	}

}
