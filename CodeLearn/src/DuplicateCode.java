import java.util.HashMap;
import java.util.Map;

public class DuplicateCode {
	public static String duplicode(String code){
		String result = "";
		code = code.toLowerCase();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < code.length(); i++) {
			String temp = String.valueOf(code.charAt(i));
			if (map.get(temp) == null)
				map.put(temp, 1);
			else 
				map.put(temp,map.get(temp)+1);
		}
		for (int i = 0; i < code.length(); i++) {
			String temp = String.valueOf(code.charAt(i));
			if (map.get(temp) > 1) result += "#";
			else result += "*";
		}
		return result;
	}

	public static void main(String[] args) {

	}

}
