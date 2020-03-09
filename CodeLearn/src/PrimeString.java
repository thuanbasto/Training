
public class PrimeString {
//	public static boolean primeString(String s){
//		try {
//			String temp = s.substring(0,1);
//			s = s.substring(1);
//			int index = s.indexOf(temp)+1;
//			s = temp.concat(s);
//			if (index == 0 || s.length() == 1) return true;
//			temp = s.substring(0,index);
//			for (int i = temp.length(); i < s.length(); i+=temp.length()) {
//				if (!temp.equals(s.substring(i,i+temp.length()))) return true;
//			}
//			return false;
//		} catch (Exception e) {
//			return true;
//		}
//	}
	public static boolean primeString(String s){
		for (int i=1;i<=s.length()/2;i++){
			String temp = s.substring(0,i);
			String check ="";
			while (check.length() < s.length()){
				check = check.concat(temp);
			}
			if (check.equals(s)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(primeString("qweqwea"));
	}

}
