
public class SimpleString {
	public static int simpleString(String s){
		int result = 0;
		int length = s.length();
		String arr[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int arrCount[] = new int[26];
		int max = Integer.MIN_VALUE;
		int indexMax = 0;
		int max2 = Integer.MIN_VALUE;
		int indexMax2 = -1;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals(String.valueOf((s.charAt(i))))) {
					arrCount[j]++;
				}
			}
		}
		for (int i = 0; i < arrCount.length; i++) {
			if (max < arrCount[i]) {
				max = arrCount[i];
				indexMax = i;
			}
		}
		for (int i = 0; i < arrCount.length; i++) {
			if (max == arrCount[i] && indexMax != i) {
				indexMax2 = i;
			}
		}
		if (indexMax2 == -1) {
			for (int i = 0; i < arrCount.length; i++) {
				if (max2 < arrCount[i] && arrCount[i] < max) {
					max2 = arrCount[i];
					indexMax2 = i;
				}
			}
		}
		s = s.replace(arr[indexMax],"");
		s = s.replace(arr[indexMax2],"");
		result = s.length();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(simpleString("xauchuoi"));
	}

}
