package Chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class UserThread extends Thread{
	private Socket socket;
	private ChatServer server;
	private PrintWriter writer;
	
	public UserThread(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
    }
	
	public void run() {
		try {
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
            
            // return list User
            printUsers();
            
            // input name
            String userName = reader.readLine();
            server.addUserName(userName);
            
            // Notify all user, have a user conneted
            String serverMessage = "New user connected: " + userName;
            server.sendMessToAll(serverMessage, this); // this = userThread, avoid send message to myself
            
            String clientMessage;
            
            do {
                clientMessage = reader.readLine();
                serverMessage = "[" + userName + "]: " + clientMessage;
                server.sendMessToAll(serverMessage, this);
            } while (!clientMessage.equals("bye"));
            
            // after user has quitted, remove the user from list userNames
            server.removeUser(userName, this);
            socket.close();
 
            serverMessage = userName + " has quitted.";
            server.sendMessToAll(serverMessage, this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String message) {
        writer.println(message);
    }
	
	public void printUsers() {
        if (server.hasUsers()) {
            writer.println("Connected users: " + server.getUserNames());
        } else {
            writer.println("No other users connected");
        }
    }
}
