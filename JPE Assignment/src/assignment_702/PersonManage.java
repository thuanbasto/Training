/*
	@Author : thuan
	@Date : May 13, 2021
*/

package assignment_702;

import java.util.Scanner;

public class PersonManage {
	//Create a class named PersonManage that contains the main method will be using the Person class and its subclasses allow selecting the functions as follows:
	//
	//Input data from the keyboard: create an array of 10 Person of all types as mentioned above.
	//
	//Update student: update student info by entering studentId.
	//
	//Display teacher: displays information about teachers, who has a salary higher than 1000$.
	//
	//Report: display all students and their final mark, who qualify to pass the course (final mark >= 6).
	public static void main(String[] args) {
		Person[] persons = new Person[10];
//	
//		persons[0] = new Student("Thuan1", "Nam", "077643123", "thuanbasto@gmail.com", "1", 1, 2);
//		persons[1] = new Student("Thuan2", "Nu", "077643123", "thuanbasto@gmail.com", "2", 6, 1);
//		persons[2] = new Student("Thuan3", "Nam", "077643123", "thuanbasto@gmail.com", "3",5, 8);
//		persons[3] = new Student("Thuan4", "Nu", "077643123", "thuanbasto@gmail.com", "4", 3, 2);
//		persons[4] = new Student("Thuan5", "Nam", "077643123", "thuanbasto@gmail.com", "5", 3, 6);
//		persons[5] = new Teacher("techer Thuan1", "Nam", "07777777", "techer1@gmail.com", 20030, 10040);
//		persons[6] = new Teacher("techer Thuan2", "Nam", "07777777", "techer1@gmail.com", 20, 1000);
//		persons[7] = new Teacher("techer Thuan3", "Nu", "07777777", "techer1@gmail.com", 20, 40);
//		persons[8] = new Teacher("techer Thuan4", "Nam", "07777777", "techer1@gmail.com", 760, 10);
//		persons[9] = new Teacher("techer Thuan5", "Nu", "07777777", "techer1@gmail.com", 20010, 31000);
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println("Enter value for person at index " + (i + 1) + " in array");
			if (i > 5) {
				persons[i] = new Student();
				persons[i].input();
			} else {
				persons[i] = new Teacher();
				persons[i].input();
			}
		}
		
		System.out.print("List of person: ");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		
		// update
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the student id for update: ");
		String student_id = scanner.nextLine();
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Student) {
				Student student = (Student) persons[i];
				if (student_id.equals(student.studentId)) {
					persons[i] = new Student();
					persons[i].input();
				}
			}
		}
		
		System.out.print("List of person: ");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		
		//
		System.out.println("List of teacher have a salary higher than 1000$");
		for (Person person : persons) {
			if (person instanceof Teacher) {
				Teacher teacher = (Teacher) person;
				if (teacher.calculateSalary() > 1000) {
					System.out.println(teacher);
				}
			}
		}
		
		//
		System.out.println("List of student passed the course");
		for (Person person : persons) {
			if (person instanceof Student) {
				Student student = (Student) person;
				if (student.calculateFinalMark() >= 6) {
					System.out.println(student);
				}
			}
		}
		
		scanner.close();
	}
}
