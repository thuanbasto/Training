package assignment_801;

import java.util.Scanner;

public class Song extends Multimedia{
	public String singer;
	
	public Song() {
	}

	public Song(String singer, String name, double duration) {
		super(name, duration);
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t Singer: " + singer;
	}

	@SuppressWarnings("resource")
	public void createSong() {
		System.out.println("----- Enter song information ------");
		super.createMultimedia();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (singer == null) {
					System.out.print("Enter singer: ");
					this.singer = scanner.nextLine();
				}
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
}
