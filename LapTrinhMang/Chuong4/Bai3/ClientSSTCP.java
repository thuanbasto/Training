package Bai3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSSTCP {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost",333);
		System.out.println("Client: Start");
		DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
		DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
		Scanner scanner = new Scanner(System.in);
		String messageC = "";
		String messageS = "";
		
		
		// set name
		System.out.println("Input your Name for Client: ");
		String name = scanner.nextLine();
		dataOutputStream.writeUTF(name);
		dataOutputStream.flush();
		
		// get list user can be connect from server
		
		while (true) {
			
			boolean checkWhile = true;
			messageS = dataInputStream.readUTF();
			
			// split the String
			String[] listName = null;
			listName = messageS.split("!");
			
			// check user online
			if (listName[0].equals("")) {
				System.out.println("Nobody online!");
			} else {
				// print list User
				int stt = 0;
				for (String temp : listName) {
					System.out.println(++stt + ":" + temp);
				}
				
				System.out.println("Input name to connect: ");
				messageC = scanner.nextLine();
				
				// check input  
				for (String temp : listName) {
					if (temp.equals(messageC)) {
						checkWhile = false;
						dataOutputStream.writeUTF(messageC);
						dataOutputStream.flush();
					}
				}
				
				// if correct name => quit while
				if (!checkWhile) {
					break;
				} else {
					System.out.println("Uncorrect name.");
				}
			}			
			// refresh list User
			while (true) {
				System.out.println("Input 'r' to refresh list User or 'q' to quit! ");
				messageC = scanner.nextLine();
				if (messageC.equals("r")) {
					dataOutputStream.writeUTF(messageC);
					dataOutputStream.flush();
					break;
				} else if (messageC.equals("q")) {
					dataOutputStream.writeUTF(messageC);
					dataOutputStream.flush();
					dataInputStream.close();
					dataOutputStream.close();
					socket.close();
					System.out.println("Client: Stopped");
				} else {
					continue;
				}
			}
		}
		
		messageS = dataInputStream.readUTF();
		System.out.println("Server: " + messageS);
		
		
		while (true) {
			messageC = scanner.nextLine();
			dataOutputStream.writeUTF(messageC);
			dataOutputStream.flush();
			
			if (messageC.equals("q")) {
				break;
			}
			
			messageS = dataInputStream.readUTF();
			System.out.println("Server: " + messageS);
		}
		
		dataInputStream.close();
		dataOutputStream.close();
		socket.close();
		System.out.println("Client: Stopped");
	}

}
