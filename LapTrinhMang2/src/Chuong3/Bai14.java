package Chuong3;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

public class Bai14 {
	public void cau1() throws MalformedURLException {
		System.out.println("Nhap url: ");
		String url = new Scanner(System.in).nextLine();
		if (url.contains("http") && !url.contains("https")) {
			url = url.replace("http", "https");
		} else if (!url.contains("http")){
			url = "https://" + url;
		}
		URL a = new URL(url); 
		System.out.println("File name: " + a.getFile());
		System.out.println("Host name: " + a.getHost());
		System.out.println("Port :" + a.getPort());
		System.out.println("Protocol: "+ a.getProtocol());
	}
	public void cau2() throws IOException  {
		System.out.println("Nhap url: ");
		String url = new Scanner(System.in).nextLine();
		if (url.contains("http") && !url.contains("https")) {
			url = url.replace("http", "https");
		} else if (!url.contains("http")){
			url = "https://" + url;
		}
		URL a = new URL(url); 
		@SuppressWarnings("resource")
		Scanner input = new Scanner((InputStream) a.getContent());
		while(input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}
	public void cau3() throws UnknownHostException {
		System.out.println("Nhap url: ");
		String url = new Scanner(System.in).nextLine();
		if (url.contains("http") && !url.contains("https")) {
			url = url.substring(7);
		} else if (url.contains("https")) {
			url = url.substring(8);
		}
		InetAddress address = InetAddress.getByName(url);
		System.out.println("LocalHost: " + address.getLocalHost());
		System.out.println("IP: " + address.getHostAddress());
		System.out.println("URL: " + address.getHostName());
	}
	public void cau4() throws IOException {
		System.out.println("Nhap url: ");
		String url = new Scanner(System.in).nextLine();
		if (url.contains("http") && !url.contains("https")) {
			url = url.replace("http", "https");
		} else if (!url.contains("http")){
			url = "https://" + url;
		}
		URL a = new URL(url);
		URLConnection con = a.openConnection();
//		for (int i=0;i < con.getHeaderFields().size();i++) {
//			System.out.println(con.getHeaderFieldKey(i) + ": " + con.getHeaderField(i));
//		}
		System.out.println("Date: " + new Date(con.getDate()));
		System.out.println("Content Type: " + con.getContentType());
		System.out.println("Content Lenght: " + con.getContentLength());
		System.out.println("Last Modified: " + con.getLastModified());
		System.out.println("Date Expiration: " + con.getExpiration());
	}
	public static void main(String[] args) throws IOException {
		// https://thanhnien.vn/doi-song/
		// https://google.com/index.html 
		// https://google.com
		// google.com
		Bai14 main = new Bai14();
		int number;
		do {
			System.out.println("1: Nhan URL tra ve thong tin lien quan.");
			System.out.println("2: Nhan URL tra ve noi dung cua URL.");
			System.out.println("3: Nhan URL tra ve LocalHost va HostName.");
			System.out.println("4: Nhan URL tra ve cac thong tin trong Header.");
			System.out.println("0: Exit");
			System.out.println("Nhap so: ");
			number = new Scanner(System.in).nextInt();
			switch (number) {
			case 0:
				break;
			case 1:
				main.cau1();
				break;
			case 2:
				main.cau2();
				break;
			case 3:
				main.cau3();
				break;
			case 4:
				main.cau4();
				break;
			default:
				System.out.println("Please choose corret the number!!");
				break;
			}
		}while (number != 0);
		System.out.println("Done.");
	}
}