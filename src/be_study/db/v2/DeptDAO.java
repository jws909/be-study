package be_study.db.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Repository
//DAO : Data Access Object
public class DeptDAO {

	// Dept 데이터 관련된 DB 접근 객체
	
	public Dept findDeptByDeptno(int deptno) {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		conn = DBConnectionManager.connectDB(); //DB 연결 후 연결된 객체 return
		Dept dept = null;
		
		//실행항 쿼리 준비
		String sqlQuery = " SELECT * FROM DEPT WHERE DEPTNO = ? ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 셋팅 (쿼리에 있는 ? 위치에 값 채우기)
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery(); //쿼리실행
			
			//조회한 데이터가 1개인 경우
			if(rs.next()) {
				//데이터가 있다
				dept = new Dept();
				
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return dept;
	}
	
	public Dept findDeptByDname(String dname) {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		// DB 연결
		conn = DBConnectionManager.connectDB();
		
		Dept dept = null;
		
		//실행항 쿼리 준비
		String sqlQuery = " SELECT * FROM DEPT WHERE DNAME = ? ";
		
		//쿼리 실행, 실행 후 후속 데이터 처리
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 셋팅 (쿼리에 있는 ? 위치에 값 채우기)
			psmt.setString(1, dname);
			
			rs = psmt.executeQuery(); //쿼리실행
			
			//조회한 데이터가 1개인 경우
			if(rs.next()) {
				//데이터가 있다
				dept = new Dept();
				
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return dept;
	}
	
	public List<Dept> findDeptList() {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		// DB 연결
		conn = DBConnectionManager.connectDB();

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
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return deptList;
	}
	
	
	// SELECT -> 쿼리실행 -> DB 테이블 정보 조회 -> ResultSet -> 객체/리스트단위 변수 변환
	
	// INSERT UPDATE DELETE -> 실행 -> return 결과 : 적용된 행의 갯수
	
	
	// 저장 INSERT
	
	public int saveDept(int deptno, String dname, String loc) {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
				
		conn = DBConnectionManager.connectDB(); //DB 연결 후 연결된 객체 return
		
		String sqlQuery = " INSERT INTO DEPT (DEPTNO, DNAME, LOC) "
						+ " VALUES ( ?, ?, ? ) ";
		
		int result = 0;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, deptno);
			psmt.setString(2, dname);
			psmt.setString(3, loc);
			
			// INSERT UPDATE DELETE -> 적용된 행 갯수
			// executeUpdate();
			
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, null);
		}
		
		return result;
	}
	
	public int saveDept(Dept dept) {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
				
		conn = DBConnectionManager.connectDB(); //DB 연결 후 연결된 객체 return
		
		String sqlQuery = " INSERT INTO DEPT (DEPTNO, DNAME, LOC) "
						+ " VALUES ( ?, ?, ? ) ";
		
		int result = 0;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());
			
			// INSERT UPDATE DELETE -> 적용된 행 갯수
			// executeUpdate();
			
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, null);
		}
		
		return result;
	}
	
	
	// 삭제 DELETE
	
	public int removeDept(int deptno) { //PK 컬럼 deptno 값 기준으로 삭제
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
				
		conn = DBConnectionManager.connectDB(); //DB 연결 후 연결된 객체 return
		
		String sqlQuery = " DELETE FROM DEPT WHERE DEPTNO = ? ";
		
		int result = 0;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, deptno);
			
			// INSERT UPDATE DELETE -> 적용된 행 갯수
			// executeUpdate();
			
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, null);
		}
		
		return result;
	}
	
	public int removeDept(Dept dept) { 
		return this.removeDept(dept.getDeptno());
	}
}
