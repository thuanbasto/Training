import java.util.Arrays;

public class ChooseCup {
	public static int chooseCup(int[] arr){
		int result = 0;
		Arrays.sort(arr);
		if (arr.length < 6) {
			for (int i = 0; i < arr.length; i++) {
				result += arr[i];
			}
		} else {
			result = arr[0] + arr[1] + arr[2] + arr[arr.length-1] + arr[arr.length-2] + arr[arr.length-3];
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(chooseCup(arr));
	}

}
