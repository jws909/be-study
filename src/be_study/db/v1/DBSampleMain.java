package be_study.db.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBSampleMain {
	public static void main(String[] args) {
		
		findDept();
		
	}
	
	// query select * from dept
	public static void findDept() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//DB 연결 정보
		
//		String db_url = "jdbc:oracle:thin:@150.25.33.191:12364:orcl";
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";
		
		
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		// DB 연결
		
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		//실행항 쿼리 준비
		String sqlQuery = " SELECT * FROM DEPT ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {	// 다음에 읽어올 데이터(행단위)가 있는가? 
				// rs가 하나의 행을 가리키고, 열단위 값을 기준으로 조회
				
				//column Index 기준 조회
//				System.out.print(rs.getInt(1) + " ");
//				System.out.print(rs.getString(2) + " ");
//				System.out.println(rs.getString(3));
				
				// column 이름(별칭) 기준 조회
				System.out.print(rs.getInt("DEPTNO") + " ");
				System.out.print(rs.getString("DNAME") + " ");
				System.out.println(rs.getString("LOC"));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
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
