package Bai3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerSSTCP {
	public static List<User> listUser = new ArrayList<User>();

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(333);
		System.out.println("Server: Start");
		while (true) {
			try {
				Socket socket = ss.accept();
				RequestProcessing processing = new RequestProcessing(socket);
				processing.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
