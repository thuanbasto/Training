package Bai1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSS {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(333);
		int count = 0;
		System.out.println("Server: Start");
		while (true) {
			try {
				Socket socket = ss.accept();
				System.out.println("Da ket noi voi " + ++count + " Client.");
				RequestProcessing processing = new RequestProcessing(socket,count);
				processing.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
