
public class SnakeGame {
	public static int snakeGame(int[] a){
		// m n m1 n1 m2 n2
		int result = 0;
		// change index
		if (a[2] < a[4]) {
			a[2] = a[2] + a[4];
			a[4] = a[2] - a[4];
			a[2] = a[2] - a[4];
		}
		if (a[3] < a[5]) {
			a[3] = a[3] + a[5];
			a[5] = a[3] - a[5];
			a[3] = a[3] - a[5];
		}
		// count m1 m2
		result = Math.abs(a[2]-a[4]) < Math.abs(a[0]-a[2]+a[4])?Math.abs(a[2]-a[4]):Math.abs(a[0]-a[2]+a[4]);
		// count n1 n2
		result += Math.abs(a[3]-a[5]) < Math.abs(a[1]-a[3]+a[5])?Math.abs(a[3]-a[5]):Math.abs(a[1]-a[3]+a[5]);
		return result;
	}

	public static void main(String[] args) {
		int a[] = {3,2,0,0,2,1};
		System.out.println(snakeGame(a));
	}

}
