/*
	@Author : thuan
	@Date : May 10, 2021
*/

package assignment_501;

/*
	course code: is a string of 5 characters, started by “FW” and followed by 3 digits.
	status: only accept ‘active’ or ‘in-active’.
	flag: only accept ‘optional’, ‘mandatory’, ‘N/A’. 
*/
public class CourseManagement {
	
	public static void find(String courseName, Course[] courses) {
		System.out.println("Result for search " + courseName + " in list of course.");
		for (int i = 0; i < courses.length; i++) {
			if (courseName.equals(courses[i].getCourseName()))
				System.out.println(courses[i]);
		}
	}
	
	public static void main(String[] args) {
		Course[] courses = new Course[3];
		for (int i = 0; i < courses.length; i++) {
			System.out.println("Enter values for course at index = " + (i + 1));
			courses[i] = new Course();
			courses[i].input();
		}
		
		System.out.println("List of course");
		for (int i = 0; i < courses.length; i++) {
			System.out.println(courses[i]);
		}
		
		// find by Course name
		find("English", courses);
		
		System.out.println("List of course by flag is mandatory");
		for (int i = 0; i < courses.length; i++) {
			if ("mandatory".equals(courses[i].getFlag()))
				System.out.println(courses[i]);
		}
		
	}
}
