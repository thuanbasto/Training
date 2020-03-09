package Bai3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

public class ServerUDP {

	public static void main(String[] args) throws IOException {
//		InetAddress address = InetAddress.getByName("localhost");
		DatagramSocket datagramSocket = new DatagramSocket(7);
		System.out.println("Server Started.");
		Scanner scanner = new Scanner(System.in);
		byte[] data = new byte[6000];
		while (true) {
			DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
			datagramSocket.receive(datagramPacket);
//			System.out.println("Client joined.");
			String messClient = new String(datagramPacket.getData(),0,datagramPacket.getLength());
			
			if (!messClient.equals("q")) {
				System.out.println("Client: "+messClient);
			} else {
				System.out.println("Client has stopped.");
				continue;
			}

			String mess = scanner.nextLine();
			DatagramPacket datagramPacket2 = new DatagramPacket(mess.getBytes(), mess.length(),datagramPacket.getAddress(),datagramPacket.getPort());
			datagramSocket.send(datagramPacket2);
		}
	}
}
