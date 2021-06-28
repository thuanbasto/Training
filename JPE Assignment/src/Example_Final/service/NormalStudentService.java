package Example_Final.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
	
	public static void addNormalStudents(){
		String sql = "INSERT INTO Student (dob) VALUES(?)";
		try (Connection conn = DatabaseConnection.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);) {
			Date date = new Date("1/2/2111");
			statement.setDate(1, new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy")
					.parse(new SimpleDateFormat("dd/MM/yyyy").format(date)).getTime()));
//			statement.setDate(1, new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse("1/1/2111").getTime()));
			statement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		addNormalStudents();
	}
}
