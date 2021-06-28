package a3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class test4 {
	public static void main(String[] args) {
		String s;
		try{ 
			FileReader fr = new FileReader("my.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			System.out.println(" ero erw");
		}
	}
}
