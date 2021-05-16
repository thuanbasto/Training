package assignment_802.entities;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Book extends Publication{
	public String isbn;
	public Set<String> author;
	public String publicationPlace;
	
	public Book() {
	}
	
	public Book(String isbn, Set<String> author, String publicationPlace) {
		super();
		this.isbn = isbn;
		this.author = author;
		this.publicationPlace = publicationPlace;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t ISBN: " + isbn + "\t Author: " + author + "\t Place: " + publicationPlace;
	}
	
	@SuppressWarnings("resource")
	@Override
	public void input() {
		super.input();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				if (isbn == null) {
					System.out.print("Enter isbn: ");
					this.isbn = scanner.nextLine();
				}
				if (author == null) {
					addAuthor();
				}
				if (publicationPlace == null) {
					System.out.print("Enter publication place: ");
					this.publicationPlace = scanner.nextLine();
				}

				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
	
	@SuppressWarnings("resource")
	public void addAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter list of authors: ");
		
		Set<String> author = new HashSet<String>();;
		if (this.author != null) {
			author = this.author;
		}
		
		int i = 1;
		String checkContinue;
		do {
			System.out.println("Enter author " + i + ": ");
			String authorInput = scanner.nextLine();
			
			// if lenght of author == lenght after add => duplicate name
			int lenght = author.size();
			author.add(authorInput);
			
			if (author.size() == lenght) {
				System.err.println("This name is existed.");
			} else {
				System.out.println("Add successfully");
				i++;
			}

			System.out.print("Do you want to continue enter value for the author (n/N to stop)? ");
			checkContinue = scanner.nextLine();
		} while (!"n".equalsIgnoreCase(checkContinue));
		this.author = author;
	}

	@Override
	public void display() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Year: " + publicationYear + "\t Publisher: " + publisher + "\t Date: " + format.format(publicationDate)
		+ "\t ISBN: " + isbn + "\t Author: " + author + "\t Place: " + publicationPlace);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Set<String> getAuthor() {
		return author;
	}

	public void setAuthor(Set<String> author) {
		this.author = author;
	}

	public String getPublicationPlace() {
		return publicationPlace;
	}

	public void setPublicationPlace(String publicationPlace) {
		this.publicationPlace = publicationPlace;
	}
}
