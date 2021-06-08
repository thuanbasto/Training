package Example_Final.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Example_Final.entity.GoodStudent;
import Example_Final.utils.DatabaseConnection;

public class GoodStudentService {
	public List<GoodStudent> getGoodStudents(){
		List<GoodStudent> students = new ArrayList<GoodStudent>();
		String sql = "SELECT * FROM Student WHERE EnglishScore IS NULL";
		try (Connection conn = DatabaseConnection.getConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);) {
			while (rs.next()) {
				GoodStudent student = new GoodStudent();
				student.setFullName(rs.getString("FullName"));
				student.setBoB(rs.getDate("Dob"));
				student.setSex(rs.getString("Sex"));
				student.setPhoneNumber(rs.getString("PhoneNumber"));
				student.setUniversityName(rs.getString("UniversityName"));
				student.setGradeLevel(rs.getString("GradeLevel"));
				student.setGpa(rs.getDouble("GPA"));
				student.setBestRewardName(rs.getString("BestRewardName"));
				students.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}
}
