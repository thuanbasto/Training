package assignment_801;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String checkContinue = "";
		Scanner scanner = new Scanner(System.in);
		MultimediaManagement multimediaManagement = new MultimediaManagement();
		do {
			System.out.println("Choose function: ");
			System.out.println("1. Add a new Video");
			System.out.println("2. Add a new Song");
			System.out.println("3. Show all multimedia");
			System.out.println("4. Exit");
			System.out.print("Your choice: ");
			String number = scanner.nextLine();
			switch (number) {
			case "1":
				Video video = new Video();
				video.createVideo();
				multimediaManagement.addMultiMedia(video);
				break;
			case "2":
				Song song = new Song();
				song.createSong();
				multimediaManagement.addMultiMedia(song);
				break;
			case "3":
				multimediaManagement.displayMultiMedia();
				break;
			case "4":
				checkContinue = "n";
				break;
			}
			System.out.println("---------------");
		} while (!"n".equalsIgnoreCase(checkContinue));
		System.out.println("Bye !");
		scanner.close();
	}
}
