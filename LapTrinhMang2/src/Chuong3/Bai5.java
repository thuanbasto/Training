package Chuong3;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* 
	5.Viết chương trình cho phép người dùng nhập vào địa chỉ các trang web và
	kiểm soát việc truy cập các trang web của người dùng. Trong đó, khi người 
	dùng truy cập đến 1 trang web có trong danh sách cấm thì thông báo cho người 
	dùng biết. Khi người dùng truy cập đến trang web không có trong danh sách cấm 
	thì lấy nội dung trang web về hiển thị lên màn hình. Người dùng có thể nhập địa 
	chỉ IP hoặc Hostname. 
*/
public class Bai5 {
	public static List<String> blackList;
	public Bai5() {
		// tạo blacklist
		blackList = new ArrayList<String>();
		blackList.add("https://google.com");
		blackList.add("https://thanhnien.vn");
		blackList.add("https://kenh14.vn");
	}
	
	public static void main(String[] args) throws IOException {
		// 216.58.220.206 google.com
		// 172.217.163.238
		// 103.90.220.245 thanhnien.vn
		Bai5 bai5 = new Bai5();
		System.out.println("Nhap IP hoac URL: ");
		boolean checkBlackList = false;
		String input = new Scanner(System.in).nextLine();
		
		// check input: nếu thiếu Https thì thêm vào
		if (input.contains("http") && !input.contains("https")) {
			input = input.replace("http", "https");
		} else if (!input.contains("http")){
			input = "https://" + input;
		}
		// check input có nằm trong blacklist hay ko
		for (String temp : blackList) {
			if (input.contains(temp)) {
				checkBlackList = true;
				System.out.println("Danh sach cac URL khong the truy cap!");
				for (String temp2 : blackList) {
					System.out.println(temp2);
				}
				break;
			}
		}
		// nếu ko nằm trong blacklist thì in ra source của web đó
		if (!checkBlackList) {
			URL a = new URL(input); 
			@SuppressWarnings("resource")
			Scanner sc = new Scanner((InputStream) a.getContent());
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		System.out.println("Done");
//		if (!input.contains("http")) {
//			InetAddress address = InetAddress.getByAddress(216.58.220.206);
//		}
//		byte[] ipAddr = new byte[] {(byte) 216,(byte) 58,(byte) 220,(byte) 206 };
//	    InetAddress addr = InetAddress.getByAddress(ipAddr);
//	    InetAddress addr2 = InetAddress.getByName("google.com");
//	    System.out.println(addr.getHostName());
//	    System.out.println(addr.getHostAddress());
//	    System.out.println(addr2.getHostName());
//	    System.out.println(addr2.getCanonicalHostName());
	    
//		byte[] a = input.getBytes();
//		System.out.println(a[1]);
//		InetAddress address = InetAddress.getByAddress(new byte[]{(byte) 216,(byte)58,(byte) 220,(byte) 206});
//		System.out.println(address.getHostName());
	}

}
