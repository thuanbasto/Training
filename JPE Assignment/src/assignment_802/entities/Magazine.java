package assignment_802.entities;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Magazine extends Publication{
	public String author;
	public int volume;
	public int edition;
	
	public Magazine() {
	}

	public Magazine(String author, int volume, int edition) {
		super();
		this.author = author;
		this.volume = volume;
		this.edition = edition;
	}

	@Override
	public String toString() {
		return super.toString() + "\t Author: " + author + "\t Volume: " + volume + "\t Edition: " + edition;
	}
	
	@SuppressWarnings("resource")
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (author == null) {
					System.out.print("Enter author: ");
					this.author = scanner.nextLine();
				}
				if (volume == 0) {
					System.out.print("Enter volume: ");
					this.volume = Integer.valueOf(scanner.nextLine());
				}
				if (edition == 0) {
					System.out.print("Enter edition: ");
					this.edition = Integer.valueOf(scanner.nextLine());
				}

				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	@Override
	public void display() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Year: " + publicationYear + "\t Publisher: " + publisher + "\t Date: " + format.format(publicationDate)
				+ "\t Author: " + author + "\t Volumn: " + volume + "\t Edition: " + edition);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
}
