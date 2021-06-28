package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

public class test1 {
	public static void main(String[] args) throws IOException {
//		FileInputStream in = new FileInputStream("in.txt");
//		FileOutputStream out = new FileOutputStream("out.txt");
		
//		InputStream inputStream = new BufferedInputStream(in);
//		BufferedInputStream inputStream = new BufferedInputStream(in);
//		BufferedInputStream inputStream = new BufferedInputStream(in);
//		BufferedReader in = new BufferedReader(new FileReader("in.txt"));
//		FileReader in = new FileReader("in.txt");
		
		
//		int c = 0;
//		while ((c = in.read()) != -1) {
//			out.write(c);
//			System.out.println(c);
//		}
//		
//		in.close();
//		out.close();		
		read();
	}
	
	public static void read() {
		StringTokenizer tokenizer;
		try (FileReader fileIn = new FileReader("data.csv"); BufferedReader reader = new BufferedReader(fileIn)) {
			String str;
			
			while ((str = reader.readLine()) != null) {
				tokenizer = new StringTokenizer(str, ",");
				while (tokenizer.hasMoreTokens()) {
		            System.out.println(tokenizer.nextToken());
		        }
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
