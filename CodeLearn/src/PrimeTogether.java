
public class PrimeTogether {
	public static int UCLN(int a,int b) {
		if (a==0||b==0) return a+b;
		while (a!=b) {
			if (a>b) a-=b;
			else b-=a;
		}
		return a;
	}
	public static boolean primeTogether(int a, int b) {
		if (UCLN(a, b) == 1) return true;
		return false;
	}
	public static void main(String[] args) {

	}

}
