
public class DividePlane {
	public static long dividePlane(long n){
		// n hình tròn cắt nhau chia mặt phẳng ra bao nhiêu miền.
		if (n <= 3) return (long) Math.pow(2,n);
		return n*(n-1)+2;
	}

	public static void main(String[] args) {
		System.out.println(dividePlane(5));
	}

}
