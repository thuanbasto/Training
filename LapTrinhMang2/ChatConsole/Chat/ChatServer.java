package Chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
	private int port;
	private Set<String> userNames = new HashSet<>();
	private Set<UserThread> userThreads = new HashSet<>();
	
	public ChatServer(int port) {
		this.port = port;
	}
	
	public void addUserName(String userName) {
        userNames.add(userName);
    }
	
	public void removeUser(String userName, UserThread aUser) {
		// true if have userName
        boolean removed = userNames.remove(userName);
        if (removed) {
            userThreads.remove(aUser);
            System.out.println("The user " + userName + " quitted");
        }
    }
 
	public Set<String> getUserNames() {
        return this.userNames;
    }
 
	public boolean hasUsers() {
        return !this.userNames.isEmpty();
    }
	
	public void execute() {
		try (ServerSocket serverSocket = new ServerSocket(port)){
			System.out.println("Chat Server Started on port " + port);
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("New user connected.");
				
				UserThread newUser = new UserThread(socket,this);
				userThreads.add(newUser);
				newUser.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void sendMessToAll(String message, UserThread user) {
        for (UserThread temp : userThreads) {
            if (temp != user) {
                temp.sendMessage(message);
            }
        }
    }
	
	public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Syntax: java ChatServer <port-number>");
            System.exit(0);
        }
 
        int port = Integer.parseInt(args[0]);
 
        ChatServer server = new ChatServer(port);
        server.execute();
    }
}
