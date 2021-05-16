import java.util.Scanner;

public class ChuCaiDanXen {
	public static String chuCaiDanXen(String a) {
		String result = "";
		for (int i = 0; i < a.length(); i+=2) {
			result += String.valueOf(a.charAt(i));
		}
		return result;
	}
	public static void main(String[] args) {
//        String a = new Scanner(System.in).nextLine();
		System.out.println(chuCaiDanXen("abc"));
//		 String a = new Scanner(System.in).nextLine();
//	        String result = "";
//			for (int i = 0; i < a.length(); i+=2) {
//				result += String.valueOf(a.charAt(i));
//			}
//			System.out.println(result);
	}
}
