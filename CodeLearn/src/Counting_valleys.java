
public class Counting_valleys {
	public static int counting_valleys(String s){
		int result = 0;
		s = s.trim();
		int arr[] = new int[s.length()];
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U')
				arr[i] = 1;
			else 
				arr[i] = -1;
		}
		boolean check = true;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum < 0) check = false;
			if (check == false) {
				if (sum == 0) {
					result++;
					check = true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(counting_valleys("DDUUUUDD"));
	}

}
