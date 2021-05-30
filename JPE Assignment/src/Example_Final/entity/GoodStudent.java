package Example_Final.entity;

import java.util.Date;

public class GoodStudent extends Student{
	public double gpa;
	public String bestRewardName;
	
	public GoodStudent() {
	}
	
	public GoodStudent(String fullName, Date boB, String sex, String phoneNumber, String universityName,
			String gradeLevel, double gpa, String bestRewardName) {
		super(fullName, boB, sex, phoneNumber, universityName, gradeLevel);
		this.gpa = gpa;
		this.bestRewardName = bestRewardName;
	}

	@Override
	public String toString() {
		return "GoodStudent [fullName=" + fullName + ", dob=" + doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber
				+ ", universityName=" + universityName + ", gradeLevel=" + gradeLevel + ", gpa=" + gpa
				+ ", bestRewardName=" + bestRewardName + "]";
	}

	@Override
	public void showMyInfor() {
		System.out.println(toString());
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getBestRewardName() {
		return bestRewardName;
	}

	public void setBestRewardName(String bestRewardName) {
		this.bestRewardName = bestRewardName;
	}

}
