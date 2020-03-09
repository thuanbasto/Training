import java.util.HashMap;
import java.util.Map;

public class ServiceTime {
	public static long serviceTime(String ns){
		long result = 0;
		int number = Integer.valueOf(ns.substring(0,ns.length()-1));
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e", 5);
		map.put("f", 6);
		long[][] arr = new long[number+3][7];
		int count = 1;
		int check = 0;
		for (int i = 1; i < arr.length-2; i++) {
			if (check != 0 && check%2 == 0) {
				i+=1;
				count+=2;
				check=0;
				continue;
			}
			for (int j = 1; j < 7; j++) {
				arr[i][j] = count;
				arr[i+2][j] = count++;
			}
			count++;
			check++;
		}
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = 1; j < 7; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		result = arr[number][map.get(String.valueOf(ns.charAt(ns.length()-1)))];
		return result;
	}

	public static void main(String[] args) {
		System.out.println(serviceTime("123a"));
	}

}
