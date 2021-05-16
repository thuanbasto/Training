import java.util.Arrays;

public class LCMOfArray {
	public static int lcmOfArray(int[] arr) {
		long result = 1;
		int divisor = 2;
		while(true) {
			int count = 0;
			boolean divisible = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 1)
					count++; 
				if (arr[i] % divisor == 0) {
					divisible = true;
					arr[i] = arr[i] / divisor;
				}
			}
			if (divisible) {
				result = result * divisor % 1000000007;
			} else divisor++;
			
			if (count == arr.length) break;
		}
		return (int)result;
	}
	public static void main(String[] args) {
		int arr[] = {94,26,63,97,98,8,49,93,80,82};
		System.out.println(lcmOfArray(arr));
	}

}
