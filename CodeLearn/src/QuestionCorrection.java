import java.util.ArrayList;
import java.util.List;

public class QuestionCorrection {
	public static String deleteChar(String s, char t) {
		if (s.charAt(0) == t)
			s = s.substring(1);
		if (t == '?' || t == '.') {
			while (s.contains(String.valueOf(t)))
				s = s.replace(String.valueOf(t), " ");
		}
		int arr[] = new int [s.length()];
		int arr2[] = new int [s.length()];
		String arr3[] = s.split("");
		int count = 0;
		// tim vi tri
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t)
				arr[count++] = i;
		}
		// xac dinh vi tri 
		for (int i = 0; i < count-1; i++) {
			if (Math.abs(arr[i] - arr[i+1]) <= 5)
				arr2[i+1] = 1;
		}
		// xoa
		s = "";
		for (int i = 0; i < arr3.length; i++) {
			if (arr2[i] == 1) 
				arr3[arr[i]] = "";
			s += arr3[i];
		}
		s = deleteSpace(s);
		// 
		String arr4[] = s.split("");
		s = "";
		boolean checkChar = false;
		if (t == '.') checkChar = true;
		// xu ly dau " " truoc dau ","
		for (int i = 0; i < arr4.length; i++) {
			if (arr4[i].equals(String.valueOf(t))) {
				if (arr4[i-1].equals(" "))
					arr4[i-1] = "";
				arr4[i] += " ";
			}
		}
		for (int i = 0; i < arr4.length; i++) {
			s += arr4[i];
		}
		return s;
	}
	public static String deleteSpace(String s) {
		s = s.trim();
		while(s.contains("  "))
			s = s.replace("  ", " ");
		return s;
	}
	public static String deleteNearChar(String s,String a,String b) {
		String arr[] = s.split("");
		s = "";
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i].equals(a) && arr[i+1].equals(b)) {
				arr[i] = "";
			} else if (arr[i].equals(b) && arr[i+1].equals(a)) {
				arr[i] = "";
			}
		}
		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}
	public static String lowerAndUpper(String s) {
		s = s.toLowerCase();
		String[] arr = s.split("");
		s = "";
		s += arr[0].toUpperCase();
		for (int i = 1; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}
	public static String questionCorrection(String s){
		s = s.replaceAll("[^a-zA-Z0-9,]", " ");
		// xoa dau cach
		s = deleteSpace(s);
		// xu ly dau "," "?" "."
		s = deleteChar(s, ',');
		s = deleteChar(s, '?');
		s = deleteChar(s, '.');
		
		// xu ly nhung ki tu gan nhau
		String arrChar[] = {"?",",","."};
		for (int i = 0; i < arrChar.length -1; i++) {
			for (int j = i+1; j < arrChar.length; j++) {
				s = deleteNearChar(s, arrChar[i], arrChar[j]);
			}
		}
		
		// xoa dau cach
		s = deleteSpace(s);
		
		// them dau hoi cuoi cau
		if (s.charAt(s.length()-1) != '?') {
			if (s.charAt(s.length()-1) != '.' && s.charAt(s.length()-1) != ',')
				s += "?";
			else 	
				s = s.substring(0,s.length()-1)+"?";
		}
		s = deleteSpace(s);
		
		// Bien doi ki tu Hoa
		s = lowerAndUpper(s);
		return s;
	}

	public static void main(String[] args) {
		System.out.println(questionCorrection("????as a?  ^%^?%$%^ .. 34 ??z ? . asd,?,,,??,    .?.   ,gggh  this....?213 answer ?? correct??  ?  ??           ?"));
		String a = "abc %@&&&,,,,^,&c%^..?";
//		System.out.println(a.replaceAll("[^a-zA-Z0-9?,]", " "));
	}

}
