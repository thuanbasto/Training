
public class IsIPv4Address {
	public static boolean isIPv4Address(String inputString){
		String arr[] = inputString.split("\\.");
		if (arr.length != 4) return false;
		
		try {
			for (int i = 0; i < arr.length; i++) {
				int number = Integer.valueOf(arr[i]);
				if (number == 0) continue;
				if (number < 0 || number > 255) return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isIPv4Address("---0000.-0.-0.-00"));
		String a = "";
		System.out.println(a.matches("\\w"));
	}

}
