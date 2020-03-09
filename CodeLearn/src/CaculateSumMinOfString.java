public class CaculateSumMinOfString {
	public static long calculateSumMinOfString(String s){
		int result = 0;
		int[] arr = new int[s.length()+1];
		int i=0;
		while (true) {
			// if full => break
			if (i == s.length()) {
				break;
			}
			if (s.charAt(i) == '<') {
				if (arr[i] == arr[i+1]) {
					arr[i+1] = arr[i] + 1;
				} else if (arr[i] < arr[i+1]) {
//					i++;
//					continue;
				} else if (arr[i] > arr[i+1]) {
					arr[i+1] = arr[i] + 1;
				}
			} else if (s.charAt(i) == '>') {
				if (arr[i] == arr[i+1]) {
					arr[i] = arr[i+1] + 1;
					// lui lai 1 index
					if (i != 0) {
						i -= 2;
					}
				} else if (arr[i] > arr[i+1]) {
//					i++;
//					continue;
				}
			}
			i++;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] +" ");
			result += arr[j]; 
		}	
		return result;
	}

	public static void main(String[] args) {
		System.out.println(calculateSumMinOfString(">><><>"));
	}
	

}
