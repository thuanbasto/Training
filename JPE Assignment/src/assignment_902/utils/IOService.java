package assignment_902.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import assignment_902.entities.Airport;

public class IOService {
	public static void write(List<Airport> airports) throws IOException {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new FileOutputStream("out_902.txt"));
			out.writeObject(airports);
		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			if (out != null) out.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Airport> read(List<Airport> airports) throws ClassNotFoundException, IOException {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("out_902.txt"));
			airports = (List<Airport>) in.readObject();
		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			if (in != null) in.close();
		}
		return airports;
	}
}
