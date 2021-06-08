package Example_Final.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Example_Final.entity.NormalStudent;
import Example_Final.utils.DatabaseConnection;

public class NormalStudentService {
	
	public List<NormalStudent> getNormalStudents(){
		List<NormalStudent> students = new ArrayList<NormalStudent>();
		String sql = "SELECT * FROM Student WHERE GPA IS NULL";
		try (Connection conn = DatabaseConnection.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);) {
			while (rs.next()) {
				NormalStudent student = new NormalStudent();
				student.setFullName(rs.getString("FullName"));
				student.setBoB(rs.getDate("Dob"));
				student.setSex(rs.getString("Sex"));
				student.setPhoneNumber(rs.getString("PhoneNumber"));
				student.setUniversityName(rs.getString("UniversityName"));
				student.setGradeLevel(rs.getString("GradeLevel"));
				student.setEnglishScore(rs.getDouble("EnglishScore"));
				student.setEntryTestScore(rs.getDouble("EntryTestScore"));
				students.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
}
