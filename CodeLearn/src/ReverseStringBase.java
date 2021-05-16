
public class ReverseStringBase {
	String reverseStringBase(String str) {
	    String result = "";
	    for (int i = 0; i< str.length();i++){
	        if (str.charAt(i) >= 65 && str.charAt(i) <= 90){
	            result += String.valueOf(str.charAt(i)).toLowerCase();
	        } else {
	            result += String.valueOf(str.charAt(i)).toUpperCase();
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
