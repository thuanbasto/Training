package Chat;

import java.io.Console;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class WriteThread extends Thread{
	private PrintWriter writer;
	private Socket socket;
	private ChatClient client;
	
	public WriteThread(Socket socket, ChatClient client) {
        this.socket = socket;
        this.client = client;
 
        try {
            OutputStream output = socket.getOutputStream();
            writer = new PrintWriter(output, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void run() {
        Console console = System.console();
 
        String userName = console.readLine("\nEnter your name: ");
        client.setUserName(userName);
        // flush userName
        writer.println(userName);
 
        String text;
 
        do {
            text = console.readLine();
            writer.println(text);
 
        } while (!text.equals("bye"));
 
        try {
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
