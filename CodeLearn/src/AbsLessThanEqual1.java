
public class AbsLessThanEqual1 {
	public static int absLessThanEqual1(int[] arr){
		int result = 0;
		int temp[] = new int[101];
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]]++;
		}
		for (int i = 1; i < temp.length-1; i++) {
			if (temp[i]+temp[i+1] > result) {
				result=temp[i]+temp[i+1];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {4,5,5,5,5,4,4,98,98,98,98,98,98,98,98,98};
		System.out.println(absLessThanEqual1(arr));
	}

}
