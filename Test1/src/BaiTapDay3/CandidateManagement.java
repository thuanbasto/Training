/*
	@Author : thuan
	@Date : May 11, 2021
*/

package BaiTapDay3;

public class CandidateManagement {
	
	public static Candidate[] createCandidate() {
		Candidate[] candidates = new Candidate[5];
		candidates[0] = new Candidate(1, "Thuan1", "Nam", "12/06/1999", "Thuan@gmail.com", 8);
		candidates[1] = new Candidate(2, "Thuan2", "Nu", "11/06/1999", "Thuan@gmail.com", 1);
		candidates[2] = new Candidate(3, "Thuan3", "Nam", "16/06/1999", "Thuan@gmail.com", 5);
		candidates[3] = new Candidate(4, "Thuan4", "Nu", "18/06/1999", "Thuan@gmail.com", 7);
		candidates[4] = new Candidate(5, "Thuan5", "Nam", "15/06/1999", "Thuan@gmail.com", 8);
		return candidates;
	}
	
	public static void display(Candidate[] candidates) {
		System.out.println("List of candidate:");
		for (int i = 0; i < candidates.length; i++) {
			System.out.println("ID: " + candidates[i].id 
					+ "\t Name: " + candidates[i].name 
					+ "\t Gender: " + candidates[i].gender 
					+ "\t BirthDate: " + candidates[i].birthDate 
					+ "\t Email: " + candidates[i].email 
					+ "\t GPA: " + candidates[i].gpa);
		}
	}
	public static void main(String[] args) {
		Candidate[] candidates = createCandidate();
		display(candidates);
	}
}
