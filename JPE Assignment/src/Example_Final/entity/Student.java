package Example_Final.entity;

import java.util.Date;

public abstract class Student {
	public String fullName;
	public Date doB;
	public String sex;
	public String phoneNumber;
	public String universityName;
	public String gradeLevel;
	
	public Student() {
	}
	
	public Student(String fullName, Date doB, String sex, String phoneNumber, String universityName,
			String gradeLevel) {
		super();
		this.fullName = fullName;
		this.doB = doB;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.universityName = universityName;
		this.gradeLevel = gradeLevel;
	}

	public abstract void showMyInfor();

	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", boB=" + doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber
				+ ", universityName=" + universityName + ", gradeLevel=" + gradeLevel + "]";
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBoB() {
		return doB;
	}

	public void setBoB(Date doB) {
		this.doB = doB;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
}
