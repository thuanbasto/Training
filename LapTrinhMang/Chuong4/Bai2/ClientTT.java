package Bai2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTT {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",7);
		System.out.println("Client: Start");
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		
		System.out.println("Input the operator: ");
		String str = new Scanner(System.in).nextLine();
		dataOutputStream.writeUTF(str);
		String result = dataInputStream.readUTF();
		System.out.println("Result from Server: " + result);
		
		dataInputStream.close();
		dataOutputStream.close();
		socket.close();
		System.out.println("Client: Stopped");
	}

}
