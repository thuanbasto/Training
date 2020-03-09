
public class IntersectLine {
	public static long intersectLine(int n){
		long temp = (long)n;
		return (long) (Math.pow(temp,2)+temp+2)/2;
	}

	public static void main(String[] args) {
		System.out.println(intersectLine(15));
	}

}
