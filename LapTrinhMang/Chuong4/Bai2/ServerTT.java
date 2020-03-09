package Bai2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTT {
	
	public static String[] getNumber(String str) {
		String[] temp;
		// delete space lon hon 2
		while(str.contains("  ")) {
			str = str.replace("  ", " ");
		}
		str = str.trim();
		temp = str.split(" ");
		return temp;
	}

	public static float operator(String str) {
		float result = 0;
		String[] temp;

		if (str.contains("+")) {
			str = str.replace("+"," ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) + Float.parseFloat(temp[1]);
		} else if (str.contains("-")) {
			str = str.replace("-"," ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) - Float.parseFloat(temp[1]);
		} else if (str.contains("*")) {
			str = str.replace("*"," ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) * Float.parseFloat(temp[1]);
		} else if (str.contains("/")) {
			str = str.replace("/"," ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) / Float.parseFloat(temp[1]);
		}
		
		return result;
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(7);
		System.out.println("Server: Start");
		while (true) {
			Socket socket = ss.accept();
			System.out.println("Server: Client joined.");
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			
			String str = dataInputStream.readUTF();
			String result = String.valueOf(operator(str));
			dataOutputStream.writeUTF(result);
			dataOutputStream.flush();
			
			dataInputStream.close();
			dataOutputStream.close();
			socket.close();
		}
	}

}
