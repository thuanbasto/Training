import java.util.Random;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class Caesar {
	
	public static Character Alphabet[] = new Character[26];;
	public static int k = 0;
	
	public static String encryption(String input) {
		input = input.toUpperCase();
		input = input.trim();
		while (input.contains(" ")) {
			input = input.replace(" ", "");
		}
		String result = "";
		for (int i=0;i<input.length();i++) {
			char temp;
			if ((char)(input.charAt(i) + k) > 90) {
				temp = (char)((char)(input.charAt(i) + k) - 26); 
			} else {
				temp = (char)(input.charAt(i) + k);
			}
			result += String.valueOf(temp);
		}
		return result;
	}
	
	public static String[] decryption(String input) {
		input = input.toUpperCase();
		input = input.trim();
		while (input.contains(" ")) {
			input = input.replace(" ", "");
		}
		String result[] = new String[26];
		for (int i = 0; i < result.length; i++) {
			result[i] = "";
		}
		int k = 0;
		for (int i=0;i<26;i++) {
			for (int j=0;j<input.length();j++) {
				char temp;
				if ((char)(input.charAt(j) - k) < 65) {
					temp = (char)((char)(input.charAt(j) - k) + 26);
				} else {
					temp = (char)(input.charAt(j) - k);
				}
				result[i] += String.valueOf(temp);
			}
			k++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// random khoa K
		//k = (int) (Math.random()*26);
		//System.out.println(k);
		
		
		System.out.println("Nhap khoa k: ");
		k = new Scanner(System.in).nextInt();
		System.out.println("Nhap ban ma: ");
		String input = new Scanner(System.in).nextLine();
		
		
		
		// Encryption
		String result = encryption(input);
		System.out.println("Encrytion: " + result);
		
		
		
		
		
		// Decryption
		System.out.println("====================================");
		String result2[] = new String[26];
		result2 = decryption(result);
		System.out.println("Decryption:");
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
	}

}
