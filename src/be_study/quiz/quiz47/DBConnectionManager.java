package be_study.quiz.quiz47;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionManager {
	/*
	 * DBConnectionManager.connectDB();
	 * 
	 * public static Connection connectDB()
	 * 
	 * 
	 * public Connection connectDB() DBConnectionManager db = new
	 * DBConnectionManager(); dp.connectDB();
	 */

	// DB 연결
	public static Connection connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		Connection conn = null;
		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}

	// DB 연결 종료
	public static void disconnectDB(Connection conn, PreparedStatement psmt, ResultSet rs) {
		try {	
			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
