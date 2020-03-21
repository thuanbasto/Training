
public class StringsCrossover {
	public static int stringsCrossover(String[] inputArray, String result){
		int sum = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				boolean check = true;
				for (int k = 0; k < result.length(); k++) {
					if (inputArray[i].charAt(k) != result.charAt(k) 
							&& inputArray[j].charAt(k) != result.charAt(k))
						check = false;
				}
				if (check) sum++; 
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		String[] inputArray = {"abc", "aaa", "aba", "bab"};
		System.out.println(stringsCrossover(inputArray, "bbb"));
	}

}
