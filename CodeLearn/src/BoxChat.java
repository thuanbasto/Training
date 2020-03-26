import java.util.Arrays;

public class BoxChat {
	public static String boxChat(String s, String[] a){
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (arr[i].equals(a[j])) {
					arr[i] = arr[i].replaceAll("[a-zA-Z]", "*");
				}
			}
		}
		s = String.join(" ",arr);
		return s;
	}

	public static void main(String[] args) {
		String[] a = {"aa","bcd","cd"};
 		System.out.println(boxChat("aa Aa aaa bc aa", a));
	}

}
