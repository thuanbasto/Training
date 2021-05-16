package Bai4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientUDP {

	public static boolean checkChoose(String choose) {
		choose = choose.trim();
		if (choose.equals("1") || choose.equals("2")) {
			return true;
		} else return false;
	}
	
	public static User signUp() {
		System.out.println("Input name: ");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Input email: ");
		String email = new Scanner(System.in).nextLine();
		System.out.println("Input password: ");
		String password = new Scanner(System.in).nextLine();
		User user = new User(name, email, password);
		return user;
	}
	
	public static User signIn() {
		System.out.println("Input email: ");
		String email = new Scanner(System.in).nextLine();
		System.out.println("Input password: ");
		String password = new Scanner(System.in).nextLine();
		User user = new User(email, password);
		return user;
	}
	
	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("localhost");
		DatagramSocket datagramSocket = new DatagramSocket();
		System.out.println("Client Started.");
		Scanner scanner = new Scanner(System.in);
		
		while (true) { 
			System.out.println("1. Sign Up.");
			System.out.println("2. Sign In.");
			System.out.println("3. Quit.");
			String choose = scanner.nextLine();
			if (choose.equals("3")) {
				System.out.println("Client stopped.");
				datagramSocket.close();
				break;
			}
			if (!checkChoose(choose)) {
				continue;
			}
			DatagramPacket dp1 = new DatagramPacket(choose.getBytes(),choose.length(),address,7);
			datagramSocket.send(dp1);
			
			if (choose.equals("1")) {
				User user = signUp();
				byte[] data = user.getBytes(user);
				dp1 = new DatagramPacket(data,data.length,address,7);
				datagramSocket.send(dp1);
				
				DatagramPacket dp2 = new DatagramPacket(data, data.length);
				datagramSocket.receive(dp2);
				String messServer = new String(dp2.getData(),0,dp2.getLength());
				System.out.println("Server: "+messServer);
				continue;
			} else if (choose.equals("2")) {
				User user = signIn();
				byte[] data = user.getBytes(user);
				dp1 = new DatagramPacket(data,data.length,address,7);
				datagramSocket.send(dp1);
				
				DatagramPacket dp2 = new DatagramPacket(data, data.length);
				datagramSocket.receive(dp2);
				String messServer = new String(dp2.getData(),0,dp2.getLength());
				System.out.println("Server: "+messServer);
				continue;
			}
		}
	}
}
