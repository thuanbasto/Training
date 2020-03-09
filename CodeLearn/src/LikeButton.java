
public class LikeButton {
	public static int likeButton(int[] a){
		int result = 0;
		int arr[] = new int[100000];
		for (int i = 0; i < a.length; i++) {
			arr[a[i]]++; 
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// 9223372036854775807
		System.out.println(Long.MAX_VALUE);
	}

}
