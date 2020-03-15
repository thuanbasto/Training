import java.util.ArrayList;
import java.util.List;

public class ProminentCharacters {
	public static char prominentCharacters(String s){
		char result = 'a';
		// 97 - 122 = a - z
		int arr[] = new int[123];
		int max = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			int temp = Integer.valueOf(s.charAt(i));
			arr[temp]++;
			if (arr[temp] > max)
				max = arr[temp];
		}
		for (int i = 97; i < arr.length; i++) {
			if (arr[i] == max) list.add(i);
		}
		for (int i = 0; i < s.length(); i++) {
			for (Integer integer : list) {
				if (Integer.valueOf(s.charAt(i)) == integer) return s.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(prominentCharacters("ttgm"));
	}

}
