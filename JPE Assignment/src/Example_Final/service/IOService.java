package Example_Final.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Example_Final.entity.GoodStudent;
import Example_Final.entity.NormalStudent;
import Example_Final.exception.InvalidDOBException;
import Example_Final.exception.InvalidFullNameException;
import Example_Final.exception.InvalidPhoneNumberException;
import Example_Final.utils.DatabaseConnection;
import Example_Final.utils.Validator;

public class IOService {
	/*
	CREATE TABLE Student (
		FullName nvarchar(50),
	    Dob date,
	    Sex nvarchar(50),
	    PhoneNumber nvarchar(10),
	    UniversityName nvarchar(50),
	    GradeLevel nvarchar(50),
	    GPA double,
	    BestRewardName nvarchar(200),
	    EnlishScore double,
	    EntryTestScore double
	);
	*/
	public static List<GoodStudent> readFileGoodStudent() {
		List<GoodStudent> list = new ArrayList<GoodStudent>();
		try (FileReader fileIn = new FileReader("GoodStudent.csv"); 
			BufferedReader reader = new BufferedReader(fileIn);) {
			
			String str;
			String[] arrInfor;
			GoodStudent goodStudent;
			while ((str = reader.readLine()) != null) {
				// thuan,12/12/1212,012345667
				arrInfor = str.split(",");
				// { thuan , 12/12/1212 m 01234567 }
				
				
				try {
					Validator.isFullName(arrInfor[0]);
					Validator.isDOB(arrInfor[1]);
					Validator.isPhone(arrInfor[3]);

					goodStudent = new GoodStudent(arrInfor[0], new SimpleDateFormat("dd/MM/yyyy").parse(arrInfor[1]), 
							arrInfor[2], arrInfor[3], arrInfor[4], arrInfor[5], Double.valueOf(arrInfor[6]), arrInfor[7]);
					list.add(goodStudent);
				
				} catch (InvalidDOBException | InvalidFullNameException | InvalidPhoneNumberException e) {
					System.err.println(e.getMessage());
				} catch (Exception e) {
					System.err.println("Input files have unknow errors !!!");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<NormalStudent> readFileNormalStudent() {
		List<NormalStudent> list = new ArrayList<NormalStudent>();
		try (FileReader fileIn = new FileReader("NormalStudent.csv"); 
			BufferedReader reader = new BufferedReader(fileIn);) {
			
			String str;
			String[] arrInfor;
			NormalStudent normalStudent;
			while ((str = reader.readLine()) != null) {
				arrInfor = str.split(",");
				
				try {
					Validator.isFullName(arrInfor[0]);
					Validator.isDOB(arrInfor[1]);
					Validator.isPhone(arrInfor[3]);

					normalStudent = new NormalStudent(arrInfor[0], new SimpleDateFormat("dd/MM/yyyy").parse(arrInfor[1]), 
							arrInfor[2], arrInfor[3], arrInfor[4], arrInfor[5], Double.valueOf(arrInfor[6]), Double.valueOf(arrInfor[7]));
					list.add(normalStudent);
				
				} catch (InvalidDOBException | InvalidFullNameException | InvalidPhoneNumberException e) {
					System.err.println(e.getMessage());
				} catch (Exception e) {
					System.err.println("Input files have unknow errors !!!");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void insertFileGoodStudentToDatabase() {
		String sql = "INSERT INTO Student (FullName,Dob,Sex,PhoneNumber,UniversityName,GradeLevel,GPA,BestRewardName) VALUES(?,?,?,?,?,?,?,?)";
		try (FileReader fileIn = new FileReader("GoodStudent.csv"); 
			BufferedReader reader = new BufferedReader(fileIn);
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);) {
			// Connection -> ket noi toi database
			// Statement : Thực hiện câu lệnh SQL bình thường, không truyền tham số vào được
			// Statement : Nên dùng khi thực hiện 1 câu lệnh SQL không cần truyền tham số vào
			// VD : SELECT * FROM Student
			// String phonenumber = "123123123 OR 1 = 1";
			// String sql1 = "SELECT * FROM Student WHERE PhoneNumber =" + phonenumber;
			// "SELECT * FROM Student WHERE PhoneNumber = 123123123"
			
			// PreparedStatment : Thực hiện câu lệnh, khi cần truyền tham số vào 
			
			// CallabeStatemnt : Khi mình dùng Store Proceduce hoặc Function
			
			// Statement , PreparedStatement , CallableStatement -> Tuong tac voi database dua vao cau lenh SQL (DML)
			
			// ResultSet -> Tuong tac voi database , khong can dua cau lenh SQL
			
			conn.setAutoCommit(false);
			String str;
			String[] arrInfor;
			while ((str = reader.readLine()) != null) {
				arrInfor = str.split(",");
				
				try {
					Validator.isFullName(arrInfor[0]);
					Validator.isDOB(arrInfor[1]);
					Validator.isPhone(arrInfor[3]);

					statement.setString(1, arrInfor[0]);
					statement.setDate(2, new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(arrInfor[1]).getTime()));
					statement.setString(3, arrInfor[2]);
					statement.setString(4, arrInfor[3]);
					statement.setString(5, arrInfor[4]);
					statement.setString(6, arrInfor[5]);
					statement.setDouble(7, Double.valueOf(arrInfor[6]));
					statement.setString(8, arrInfor[7]);

					statement.addBatch();
				} catch (InvalidDOBException | InvalidFullNameException | InvalidPhoneNumberException e) {
					System.err.println(e.getMessage());
				} catch (Exception e) {
					System.err.println("Input files have unknow errors !!!");
				}
				
			}
				
			statement.executeBatch();
			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertFileNormalStudentToDatabase() {
		String sql = "INSERT INTO Student (FullName,Dob,Sex,PhoneNumber,UniversityName,GradeLevel,EnglishScore,EntryTestScore) VALUES(?,?,?,?,?,?,?,?)";
		try (FileReader fileIn = new FileReader("NormalStudent.csv"); 
			BufferedReader reader = new BufferedReader(fileIn);
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);) {
			
			conn.setAutoCommit(false);
			String str;
			String[] arrInfor;
			while ((str = reader.readLine()) != null) {
				arrInfor = str.split(",");
				
				try {
					Validator.isFullName(arrInfor[0]);
					Validator.isDOB(arrInfor[1]);
					Validator.isPhone(arrInfor[3]);

					statement.setString(1, arrInfor[0]);
					statement.setDate(2, new java.sql.Date(new SimpleDateFormat("dd/MM/yyyy").parse(arrInfor[1]).getTime()));
					statement.setString(3, arrInfor[2]);
					statement.setString(4, arrInfor[3]);
					statement.setString(5, arrInfor[4]);
					statement.setString(6, arrInfor[5]);
					statement.setDouble(7, Double.valueOf(arrInfor[6]));
					statement.setDouble(8, Double.valueOf(arrInfor[7]));
					
					statement.addBatch();
				
				} catch (InvalidDOBException | InvalidFullNameException | InvalidPhoneNumberException e) {
					System.err.println(e.getMessage());
				} catch (Exception e) {
					System.err.println("Input files have unknow errors !!!");
				}
				
			}
			
			statement.executeBatch();
			conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws ParseException {
//		List<GoodStudent> list1 = readFileGoodStudent();
//		list1.forEach(a -> System.out.println(a));
//		readFileNormalStudent().forEach(a -> a.showMyInfor());
		insertFileGoodStudentToDatabase();
//		insertFileNormalStudentToDatabase();
	}
}
