package Bai4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServerUDP {
	
	public static List<User> listUser = new ArrayList<User>();
	public static String userName = "";
	
	public ServerUDP() {
		listUser.add(new User("Thuan","thuan@gmail.com","1"));
		listUser.add(new User("Chau","chau@gmail.com","1"));
		listUser.add(new User("Tung","tung@gmail.com","1"));
	}
	
	public static boolean signIn(User user) {
		user.email = user.email.toLowerCase();
		for (User temp : listUser) {
			if (temp.email.equals(user.email) && temp.password.equals(user.password)) {
				userName = temp.name;
				return true;
			}
		}
		return false;
	}
	
	public static boolean signUp(User user) {
		user.email = user.email.toLowerCase();
		for (User temp : listUser) {
			if (temp.email.equals(user.email)) {
				return false;
			}
		}
		listUser.add(user);
		return true;
	}
	
//	public static boolean checkChoose(String choose) {
//		if (choose.equals("1")) {
//			
//		}
//	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerUDP serverUDP = new ServerUDP();
		DatagramSocket datagramSocket = new DatagramSocket(7);
		System.out.println("Server Started.");
		Scanner scanner = new Scanner(System.in);
		byte[] data = new byte[6000];
		
		while (true) {
			DatagramPacket dp1 = new DatagramPacket(data, data.length);
			datagramSocket.receive(dp1);
			
			String messClient = new String(dp1.getData(),0,dp1.getLength());
			if (messClient.equals("1")) {
				dp1 = new DatagramPacket(data, data.length);
				datagramSocket.receive(dp1);
				User user = new User().getUser(data);
				if (signUp(user)) {
					String mess = "Sign Up Success.";
					DatagramPacket dp2 = new DatagramPacket(mess.getBytes(), mess.length(),dp1.getAddress(),dp1.getPort());
					datagramSocket.send(dp2);
					continue;
				} else {
					String mess = "Sign Up Faid. That Email is taken. Try another";
					DatagramPacket dp2 = new DatagramPacket(mess.getBytes(), mess.length(),dp1.getAddress(),dp1.getPort());
					datagramSocket.send(dp2);
					continue;
				}
			} else if (messClient.equals("2")) {
				dp1 = new DatagramPacket(data, data.length);
				datagramSocket.receive(dp1);
				User user = new User().getUser(data);
				if (signIn(user)) {
					String mess = "Sign In Success. Hello " + userName;
					DatagramPacket dp2 = new DatagramPacket(mess.getBytes(), mess.length(),dp1.getAddress(),dp1.getPort());
					datagramSocket.send(dp2);
					continue;
				} else {
					String mess = "Sign In Faid. That Email or Password is wrong. Try another";
					DatagramPacket dp2 = new DatagramPacket(mess.getBytes(), mess.length(),dp1.getAddress(),dp1.getPort());
					datagramSocket.send(dp2);
					continue;
				}
			}
			
		}
	}

}
