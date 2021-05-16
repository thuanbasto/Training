package Bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTTTCP {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",7);
		System.out.println("Client: Start");
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String str = scanner.nextLine();
			dataOutputStream.writeUTF(str);
			dataOutputStream.flush();
			
			if (str.equals("q")) {
				break;
			}
			
			String mess = dataInputStream.readUTF();
			System.out.println("Server: " + mess);
		}
		
		
		dataInputStream.close();
		dataOutputStream.close();
		socket.close();
		System.out.println("Client: Stopped");
	}

}
