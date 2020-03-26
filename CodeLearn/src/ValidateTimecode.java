
public class ValidateTimecode {
	public static boolean validateTimecode(String str) {
		//hh:mm:ss,mms --> hh:mm:ss,mms
		// check -->
		if (!str.contains("-->")) return false;
		// check regex
		if (str.matches(".*[a-zA-Z?=@#!$%^&*()].*"))
			return false;
		// substring
		String a = str.substring(0,str.indexOf("-")-1);
		String b = str.substring(str.indexOf(">")+2);
		// check ,
		if (a.contains(",") && b.contains(",")) {
		}
		else return false;
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println(validateTimecode("00:00:06,050 ==> 00:00:08,810"));
	}

}
