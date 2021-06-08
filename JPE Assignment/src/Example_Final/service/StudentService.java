package Example_Final.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Example_Final.entity.GoodStudent;
import Example_Final.entity.NormalStudent;
import Example_Final.entity.Student;

public class StudentService {
	public NormalStudentService normalStudentService = new NormalStudentService();
	public GoodStudentService goodStudentService = new GoodStudentService();

	public List<Student> getHiredStudents() {
		List<Student> students = new ArrayList<Student>();
		List<NormalStudent> normalStudents = normalStudentService.getNormalStudents();
		List<GoodStudent> goodStudents = goodStudentService.getGoodStudents();
		
		Collections.sort(normalStudents, new Comparator<NormalStudent>() {
			@Override
			public int compare(NormalStudent o1, NormalStudent o2) {
				if (o1.getEntryTestScore() < o2.getEntryTestScore()) {
					return 1;
				} else if (o1.getEntryTestScore() == o2.getEntryTestScore()) {
					if (o1.getEnglishScore() < o2.getEnglishScore()) {
						return 1;
					} else if (o1.getEnglishScore() == o2.getEnglishScore()) {
						return o1.getFullName().compareTo(o2.getFullName());
					} else {
						return -1;
					}
				} else {
					return -1;
				}
			}
		});
		
		Collections.sort(goodStudents, new Comparator<GoodStudent>() {
			@Override
			public int compare(GoodStudent o1, GoodStudent o2) {
				if (o1.getGpa() < o2.getGpa()) {
					return 1;
				} else if (o1.getGpa() == o2.getGpa()) {
					return o1.getFullName().compareTo(o2.getFullName());
				} else {
					return -1;
				}
			}
		});
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number want to hire: ");
		int number = scanner.nextInt();
		
		for (int i = 0; i < goodStudents.size(); i++) {
			if (number > 0) {
				students.add(goodStudents.get(i));
				number--;
			}
		}
		
		for (int i = 0; i < normalStudents.size(); i++) {
			if (number > 0) {
				students.add(normalStudents.get(i));
				number--;
			}
		}
		
		return students;
	}
	
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		
		students.addAll(normalStudentService.getNormalStudents());
		students.addAll(goodStudentService.getGoodStudents());
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getFullName().compareTo(o2.getFullName()) == 0) {
					return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
				} else {
					return o1.getFullName().compareTo(o2.getFullName()) * -1;
				}
			}
		});
		
		return students;
	}
}
