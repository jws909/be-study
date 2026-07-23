package be_study.quiz.quiz45;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	//DB 연결 정보
	String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String db_id = "scott";
	String db_pw = "tiger";
	
	//db 연결, 실행 객체
	Connection conn = null; //db 연결
	PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
	ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
	
	public void connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void disconnectDB() {
		//DB 연결 종료
		try {
					
			if(rs != null)
				rs.close();	//null 객체 메소드 호출 -> NullPointerException
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
