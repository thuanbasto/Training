package Bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTTTCP {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7);
		System.out.println("Server: Start");
		while (true) {
			Socket socket = ss.accept();
			System.out.println("Server: Client joined.");
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			Scanner scanner = new Scanner(System.in);
			
			while (true) {
				String mess = dataInputStream.readUTF();
				if (mess.equals("q")) {
					break;
				}
				System.out.println("Client: " + mess);
				
				String str = scanner.nextLine();
				dataOutputStream.writeUTF(str);
				dataOutputStream.flush();
			}
			dataInputStream.close();
			dataOutputStream.close();
			socket.close();
		}
	}

}
