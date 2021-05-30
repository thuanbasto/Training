package Example_Final.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static final String DB_URL = "jdbc:mysql://localhost:3306/final_exam";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "thuandeptrai";
	
	public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//            System.out.println("Connect successfully");
        } catch (SQLException e) {
            System.out.println("Connect failed");
            closeConnection(conn);
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
