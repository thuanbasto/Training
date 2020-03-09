package Bai4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {
	public String name;
	public String email;
	public String password;
	
	public User() {
		super();
	}

	public User(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public User(String email, String password) {
		super();
		this.name = "";
		this.email = email;
		this.password = password;
	}
	
	public byte[] getBytes(User user) throws IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    ObjectOutputStream oos = new ObjectOutputStream(bos);
	    oos.writeObject(user);
	    oos.flush();
	    byte[] data = bos.toByteArray();
	    return data;
	}

	public User getUser(byte[] data) throws ClassNotFoundException, IOException {
		ByteArrayInputStream in = new ByteArrayInputStream(data);
	    ObjectInputStream is = new ObjectInputStream(in);
	    User user = (User) is.readObject();
	    return user;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
