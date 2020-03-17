
public class TrianglePerimeter {
	public static int trianglePerimeter(int a, int b, int c){
		if (a == 0 || b==0 || c==0) return -1;
		if (a+b>c && b+c>a && a+c>b) {
			return a+b+c;
		}
		else return -1;
	}

	public static void main(String[] args) {

	}

}
