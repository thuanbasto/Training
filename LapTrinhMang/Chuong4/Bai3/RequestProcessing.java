package Bai3;
import Bai3.ServerSSTCP;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class RequestProcessing extends Thread {
	public Socket socket;
	public String name;
	public String nameConnect;
	
	public RequestProcessing(Socket socket) {
		this.socket = socket;
	} 
	
	
	@Override
	public void run() {
		try {
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			Scanner scanner = new Scanner(System.in);
			
			// get user name
			name = dataInputStream.readUTF();
			System.out.println("Client " + name + ": connect to Server.");
			
			// add user 
			ServerSSTCP.listUser.add(new User(name,socket));
			
			// return list user for Client can connect to 
			while (true) {
				String listName = "";
				for (User temp: ServerSSTCP.listUser) {
					int stt = 0;
					if (!temp.name.equals(name)) {
						// set ! in the end String to split
						listName += temp.name + "!";
					}
				}
				dataOutputStream.writeUTF(listName);
				dataOutputStream.flush();
				
				// get name from Client want to connect
				nameConnect = dataInputStream.readUTF();
				if (nameConnect.equals("r")) {
					continue;
				} else if (nameConnect.equals("q")) {
					dataInputStream.close();
					dataOutputStream.close();
					socket.close();
				} else {
					break;
				}
			}
			
			// get User connect
			User userConnect = null;
			for (User temp : ServerSSTCP.listUser) {
				if (temp.name.equals(nameConnect)) {
					userConnect = temp;
				}
			}
			
			// create input and output stream
			DataOutputStream dataOutConnect = new DataOutputStream(userConnect.socket.getOutputStream());
			DataInputStream dataInConnect = new DataInputStream(userConnect.socket.getInputStream());
			
			dataOutConnect.writeUTF("Chao" + nameConnect);
			dataOutConnect.flush();
			
			while (true) {
				String mess = dataInputStream.readUTF();
				if (mess.equals("q")) {
					break;
				}
				System.out.println("Client " + name +": " + mess);
				
				String str = scanner.nextLine();
				dataOutputStream.writeUTF(str);
				dataOutputStream.flush();
			}
			
			dataInputStream.close();
			dataOutputStream.close();
			socket.close();
			System.out.println("Client " + name + ": Stopped");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
