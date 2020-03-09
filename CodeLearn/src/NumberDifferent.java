import java.util.HashMap;
import java.util.Map;

public class NumberDifferent {
	public static int numberDifferent(int[] a){
		int result = 0;
		Map<String, Integer> list = new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (list.get(a[i]+"") == null)
				list.put(a[i]+"",1);
			else 
				list.put(a[i]+"",list.get(a[i]+"")+1);
		}
		int n1 = 0;
		int n2 = 0;
		String result1 = "";
		String result2 = "";
		int count = 0;
		for (String i: list.keySet()) {
			count++;
			if (count == 1) {
				n1 = list.get(i);
				result1 = i;
				continue;
			}
			if (count == 2) {
				n2 = list.get(i);
				result2 = i;
				continue;
			}
			if (n1 == n2 && n1 != list.get(i))
				return Integer.valueOf(i);
			else if (n1 != n2 && list.get(i) == n1) 
				return Integer.valueOf(result2);
			else if (n1 != n2 && list.get(i) == n2) 
				return Integer.valueOf(result1);
		}
		return result;
	}

	public static void main(String[] args) {
		int a[]= {2,7,7,2,1};
		System.out.println(numberDifferent(a));
	}

}
