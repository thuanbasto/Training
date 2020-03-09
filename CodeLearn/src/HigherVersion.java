
public class HigherVersion {
	public static boolean higherVersion(String v1, String v2){
		String arr1[] = v1.split("\\.");
		String arr2[] = v2.split("\\.");
		for (int i = 0; i < arr2.length; i++) {
			if (Integer.valueOf(arr1[i]) < Integer.valueOf(arr2[i])) return false;
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
