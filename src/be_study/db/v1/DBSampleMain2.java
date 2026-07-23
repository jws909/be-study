package be_study.db.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSampleMain2 {
	
	public static void main(String[] args) {
		
		List<Dept> deptList1 = findDeptList();
		
		if(deptList1 == null) {
			System.out.println("조회된 데이터가 없습니다.");
		} else { //데이터 있음
			for(Dept d : deptList1)
				System.out.println(d);
		}
		
		List<Dept> deptList2 = findDeptList2();
		
		if(deptList2.size() == 0) {
			System.out.println("조회된 데이터가 없습니다.");
		} else { //데이터 있음
			for(Dept d : deptList2)
				System.out.println(d);
		}
		
		if(deptList2 != null && deptList2.size() > 0) {
			//데이터가 있다
		}
	}
	
	public static List<Dept> findDeptList() {
		
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

		List<Dept> deptList = null;
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {	
				//데이터가 있다
				
				//한줄조회 한행데이터
				// 한행 데이터 -> Dept 객체 저장
				// List<Dept>	.add(Dept)
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));

				if(deptList == null)
					deptList = new ArrayList<>();
				
				deptList.add(dept);
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
		
		return deptList;
	}
	
	public static List<Dept> findDeptList2() {
		
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

		List<Dept> deptList = new ArrayList<>();
		//쿼리 실행, 실행 후 후속 데이터 처리
		
		try {
			
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {	
				//데이터가 있다
				
				//한줄조회 한행데이터
				// 한행 데이터 -> Dept 객체 저장
				// List<Dept>	.add(Dept)
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
				
				deptList.add(dept);
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
		
		return deptList;
	}
}
