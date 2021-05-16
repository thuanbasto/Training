package assignment_802.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assignment_802.entities.Publication;
import assignment_802.services.BookService;
import assignment_802.services.MagazineService;

public class LibraryManagement {
	public static void display(List<Publication> list) {
		System.out.println(" ------ List of publication -------");
		list.forEach(publication -> System.out.println(publication));
	}
	
	public static void main(String[] args) {
		String checkContinue = "";
		Scanner scanner = new Scanner(System.in);
		List<Publication> list = new ArrayList<Publication>();
		do {
			System.out.println("Choose function: ");
			System.out.println("1. Add a new Book");
			System.out.println("2. Add a new Magazine");
			System.out.println("3. Display books and magazines");
			System.out.println("4. Add author to book");
			System.out.println("5. Display top 10 of magazines by volume");
			System.out.println("6. Search book by (isbn, author, publisher)");
			System.out.println("7. Exit");
			System.out.print("Your choice: ");
			String number = scanner.nextLine();
			switch (number) {
			case "1":
				BookService.addBook(list);
				break;
			case "2":
				MagazineService.addMagazine(list);
				break;
			case "3":
				display(list);
				break;
			case "4":
				BookService.addAuthor(list);
				break;
			case "5":
				MagazineService.displayTop10(list);
				break;
			case "6":
				BookService.search(list);
				break;
			case "7":
				checkContinue = "n";
				break;
			}
			System.out.println("---------------");
		} while (!"n".equalsIgnoreCase(checkContinue));
		System.out.println("Bye !");
		scanner.close();
	}
}
