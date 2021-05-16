package Bai3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientUDP {

	public static void main(String[] args) throws IOException {
		InetAddress address = InetAddress.getByName("localhost");
		DatagramSocket datagramSocket = new DatagramSocket();
		System.out.println("Client Started.");
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String mess = scanner.nextLine();
			DatagramPacket datagramPacket = new DatagramPacket(mess.getBytes(), mess.length(),address,7);
			datagramSocket.send(datagramPacket);
			if (mess.equals("q")) {
				System.out.println("Client stopped.");
				datagramSocket.close();
				break;
			}
			
			byte[] data = new byte[6000];
			System.out.println(data.length);
			DatagramPacket datagramPacket2 = new DatagramPacket(data, data.length);
			datagramSocket.receive(datagramPacket2);
			String messServer = new String(datagramPacket2.getData(),0,datagramPacket2.getLength());
			System.out.println("Server: " + messServer);
		}
		
	}

}
