/*
	@Author : thuan
	@Date : May 10, 2021
*/

package assignment_501;

import java.util.Scanner;

public class Course {
	private String courseCode;
	private String courseName;
	private double duration;
	private String status;
	private String flag;
	
	public Course() {
	}
	
	public Course(String courseCode, String courseName, double duration, String status, String flag) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.duration = duration;
		this.status = status;
		this.flag = flag;
	}
	
	@SuppressWarnings("resource")
	public Course input() {
		Scanner scanner = null;
		while (true) {
			try {
				scanner = new Scanner(System.in);
				if (courseCode == null) {
					System.out.print("Enter Course code: ");
					courseCode = Validator.checkCourseCode(scanner.nextLine());
				}
				if (courseName == null) {
					System.out.print("Enter Course name: ");
					courseName = scanner.nextLine();
				}
				if (duration == 0.0) {
					System.out.print("Enter Duration: ");
					duration = Double.parseDouble(scanner.nextLine());
				}
				if (status == null) {
					System.out.print("Enter Status: ");
					status = Validator.checkStatus(scanner.nextLine());
				}
				if (flag == null) {
					System.out.print("Enter Flag: ");
					flag = Validator.checkFlag(scanner.nextLine());
				}
				
				break;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return this;
	}
	
	@Override
	public String toString() {
		return "Course code: " + courseCode + "\t Course name: " + courseName + "\t Duration: " 
				+ duration + "\t Status: " + status + "\t Flag: " + flag;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}
