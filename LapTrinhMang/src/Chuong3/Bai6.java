package Chuong3;

import java.io.File;
/* 
   6.Viết chương trình cho phép người dùng nhập vào các địa chỉ URL và lưu 
   lại các thông tin (Hostname, địa chỉ IP) của các trang web mà người dùng đã 
   truy cập (không trùng lặp thông tin).
*/
import java.io.FileWriter;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Bai6 {

	public static void ghiFile(String url, String ip){
		try {
			Date date = new Date();
			Scanner scanner = new Scanner(new File("logFile.txt"));
			boolean check = true;
			while(scanner.hasNextLine()) {
				String empty = scanner.nextLine();
				if (empty.contains(url)) {
					check = false;
				}
			}
			if (check) {
				FileWriter fileWriter = new FileWriter("logFile.txt",true);
				fileWriter.append(url+" - ");
				fileWriter.append(ip+" - ");
				fileWriter.append(date.toString());
				fileWriter.append('\n');
				fileWriter.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws UnknownHostException {
		// 216.58.220.206 google.com
		// 172.217.163.238
		// 103.90.220.245 thanhnien.vn
		// http://thanhnien.vn
		System.out.println("Nhap IP hoac URL: ");
		String input = new Scanner(System.in).nextLine();
		if (input.contains("http") && !input.contains("https")) {
			input = input.substring(7);
		} else if (input.contains("https")) {
			input = input.substring(8);
		}
		InetAddress address =  InetAddress.getByName(input);
		
		ghiFile(address.getHostName(), address.getHostAddress());
		System.out.println("Done");
	}

}
