
public class PolygonAngle {
	public static double polygonAngle(int n){
		return (double)Math.round((double)180*(n-2)/n*1000)/1000;
	}

	public static void main(String[] args) {
		System.out.println(polygonAngle(11));
	}
}
