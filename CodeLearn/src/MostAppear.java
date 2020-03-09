
public class MostAppear {
	public static char mostAppear(String str){
		char result = 'a';
		String temp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-=[];,.~!@#$%^&*_+:|?><";
		int arr[] = new int[85];
		char arr2[] = new char[85];
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < temp.length(); j++) {
				if (str.charAt(i) == temp.charAt(j)) {
					arr[j]++;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		int count= 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				arr2[count++] = temp.charAt(i);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < count; j++) {
				if (str.charAt(i) == arr2[j]) return arr2[j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(mostAppear("112233344"));
	}

}
