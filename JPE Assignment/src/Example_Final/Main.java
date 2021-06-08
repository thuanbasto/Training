package Example_Final;

import java.text.ParseException;
import java.util.Scanner;

import Example_Final.service.GoodStudentService;
import Example_Final.service.IOService;
import Example_Final.service.NormalStudentService;
import Example_Final.service.StudentService;

public class Main {
	public static NormalStudentService normalStudentService = new NormalStudentService();
	public static GoodStudentService goodStudentService = new GoodStudentService();
	public static IOService ioService = new IOService();
	public static StudentService studentService = new StudentService();
	
	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		String number;
		do {
			System.out.println("Choose function: ");
			System.out.println("1. List normal students");
			System.out.println("2. List good students");
			System.out.println("3. Insert data from file to database");
			System.out.println("4. Hire student ");
			System.out.println("5. List of students ");
			System.out.println("11. Exit");
			System.out.print("Enter the number: ");
			number = scanner.nextLine();
			switch (number) {
				case "1":
					normalStudentService.getNormalStudents().forEach(student ->{
						System.out.println(student);
					});;
					break;
				case "2":
					goodStudentService.getGoodStudents().forEach(student ->{
						System.out.println(student);
					});;
					break;
				case "3":
					ioService.insertFileGoodStudentToDatabase();
					ioService.insertFileNormalStudentToDatabase();
					break;
				case "4":
					System.out.println("List of hired students");
					studentService.getHiredStudents().forEach(student -> {
						System.out.println(student);
					});;
					break;
				case "5":
					System.out.println("List of students");
					studentService.getStudents().forEach(student -> {
						System.out.println(student);
					});;
					break;
			}
			System.out.println("---------------");
		} while (!"11".equalsIgnoreCase(number));
		System.out.println("Bye !");
		scanner.close();
	}
}
