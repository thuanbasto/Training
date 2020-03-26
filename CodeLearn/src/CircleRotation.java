import java.util.LinkedList;
import java.util.Queue;

public class CircleRotation {
	public static int circleRotation(int[] arr, long d) {
//		Queue<Integer> queue = new LinkedList<Integer>();
//		for (int i = 0; i < arr.length; i++) {
//			queue.add(arr[i]);
//		}
//		d = d%arr.length;
//		while (d > 0) {
//			d--;
//			int temp = queue.poll();
//			queue.add(temp);
//		}
//		return queue.poll();
		return arr[(int) (d%arr.length)];
	}
	public static void main(String[] args) {
		int arr[] = {};
		int d = 5;
		System.out.println(circleRotation(arr, 9));
	}

}
