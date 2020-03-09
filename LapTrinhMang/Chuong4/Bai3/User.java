package Bai3;

import java.net.Socket;

public class User {
	public String name;
	public Socket socket;
	
	public User() {
		this.name = "";
		this.socket = null;
	}

	public User(String name, Socket socket) {
		super();
		this.name = name;
		this.socket = socket;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	

}
