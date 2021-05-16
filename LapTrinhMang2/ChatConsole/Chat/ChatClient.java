package Chat;

import java.net.Socket;

public class ChatClient {
	private String hostname;
    private int port;
    private String userName;
 
    public ChatClient(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
    }
    
    public void execute() {
        try {
            Socket socket = new Socket(hostname, port);
            System.out.println("Connected to the chat server");
 
            // create ReadStream, and WriteStream
            new ReadThread(socket, this).start();
            new WriteThread(socket, this).start();
            
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        if (args.length < 2) {
        	System.out.println("Syntax: java ChatClient <host-name> <port-number>");
            System.exit(0);
        }
 
        String hostname = args[0];
        int port = Integer.parseInt(args[1]);
 
        ChatClient client = new ChatClient(hostname, port);
        client.execute();
    }
    
    void setUserName(String userName) {
        this.userName = userName;
    }
 
    String getUserName() {
        return this.userName;
    }
}
