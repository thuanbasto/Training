package Example_Final.entity;

import java.util.Date;

public class NormalStudent extends Student {
	public double englishScore;
	public double entryTestScore;

	public NormalStudent() {
		super();
	}

	public NormalStudent(String fullName, Date boB, String sex, String phoneNumber, String universityName,
			String gradeLevel, double englishScore, double entryTestScore) {
		super(fullName, boB, sex, phoneNumber, universityName, gradeLevel);
		this.englishScore = englishScore;
		this.entryTestScore = entryTestScore;
	}

	@Override
	public String toString() {
		return "NormalStudent [fullName=" + fullName + ", dob=" + doB + ", sex=" + sex + ", phoneNumber=" + phoneNumber
				+ ", universityName=" + universityName + ", gradeLevel=" + gradeLevel + ", englishScore=" + englishScore
				+ ", entryTestScore=" + entryTestScore + "]";
	}

	@Override
	public void showMyInfor() {
		System.out.println(toString());
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore(double entryTestScore) {
		this.entryTestScore = entryTestScore;
	}
}
