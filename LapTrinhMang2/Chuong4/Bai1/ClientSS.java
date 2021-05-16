package Bai1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientSS {

	public static void main(String[] args) throws IOException {
		Socket socket = new Socket("localhost",333);
		System.out.println("Client: Start");
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		
		System.out.println("Input the Number want to convert to Word: ");
		int number = new Scanner(System.in).nextInt();
		dataOutputStream.writeInt(number);
		String result = dataInputStream.readUTF();
		System.out.println("Result from Server: " + result);
		
		dataInputStream.close();
		dataOutputStream.close();
		socket.close();
		System.out.println("Client: Stopped");
	}

}
