
public class RemoveDuplicateCharacters {
	public static String removeDuplicateCharacters(String str){
		String[] arr = str.split("");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			boolean check = true;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && i != j) {
					check = false;
					break;
				}
			}
			if (check == true) result+=arr[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicateCharacters("zaabcbd"));
	}

}
