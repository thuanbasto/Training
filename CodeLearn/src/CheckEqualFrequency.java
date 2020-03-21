import java.util.HashMap;
import java.util.Map;

public class CheckEqualFrequency {
	public static boolean checkEqualFrequency(int[] inputArray){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			if (map.get(inputArray[i]) == null)
				map.put(inputArray[i], 1);
			else 
				map.put(inputArray[i], map.get(inputArray[i]) + 1);
		}
		int temp = map.get(inputArray[0]);
		for (int i : map.values()) {
			if (temp != i) return false;
		} 
		return true;
	}
	public static void main(String[] args) {
		int inputArray[] = {1,1,1,2,2,2,3,4};
		System.out.println(checkEqualFrequency(inputArray));
	}
}
