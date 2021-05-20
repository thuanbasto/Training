package assignment_802.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import assignment_802.entities.Book;
import assignment_802.entities.Publication;

public class BookService {
	public static void addBook(List<Publication> list) { 
		Book book = new Book();
		book.input();
		list.add(book);
	}
	
	@SuppressWarnings("resource")
	public static void addAuthor(List<Publication> list) {
		System.out.println("Enter the ISBN of book: ");
		Scanner scanner = new Scanner(System.in);
		String isbn = scanner.nextLine();
		
		System.out.println(" ------ List of book -------");
		for (Publication publication : list) {
			if (publication instanceof Book) {
				Book book = (Book) publication;
				if (isbn.equals(book.isbn))
					book.addAuthor();
			}
		}
	}
	
	@SuppressWarnings("resource")
	public static void search(List<Publication> list) {
		System.out.println("Enter the string to search: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		List<Book> sortedList = new ArrayList<>();
		
		for (Publication publication : list) {
			if (publication instanceof Book) {
				Book book = (Book) publication;
				String str = book.getIsbn() + " " + book.getAuthor() + " " + book.getPublisher();
				if (str.contains(input)) sortedList.add(book);
			}
		}
		
		Collections.sort(sortedList, new Comparator<Book>() {
			@Override
			public int compare(Book o1, Book o2) {
				if (o1.isbn.compareTo(o2.isbn) == 0) 
					return o1.publicationDate.compareTo(o2.publicationDate);
				return o1.isbn.compareTo(o2.isbn);
			}
		});
		System.out.println(" ------ List of book -------");
		sortedList.forEach(book -> System.out.println(book));
	}
}
