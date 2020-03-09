
public class Cipher26 {
	public static String cipher26(String message){
		String arr[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String temp = "abcdefghijklmnopqrstuvwxyz";
		String result = String.valueOf(message.charAt(0));
		int sum = 0;
		for (int i = 0; i < message.length()-1; i++) {
			int index = temp.indexOf(message.charAt(i));
			int index2 = temp.indexOf(message.charAt(i+1));
			sum = index2 - index;
			if (sum < 0) {
				sum+=26;
			}
			result += arr[sum];
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(cipher26("taiaiaertkixquxjnfxxdh"));
	}

}
