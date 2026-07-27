package be_study.quiz.quiz47;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	public List<StudentDTO> findStudentList() {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " SELECT " +
						  " STUDNO,NAME,ID,GRADE,JUMIN, " +
						  " TO_CHAR(BIRTHDAY, 'YYYY-MM-DD') BIRTHDAY, " +
						  " TEL,HEIGHT,WEIGHT,DEPTNO1,DEPTNO2,PROFNO " +
						  " FROM STUDENT ";
		
		List<StudentDTO> studList = null;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {
				StudentDTO stud = new StudentDTO();
				
				stud.setStudno(rs.getInt("STUDNO"));
				stud.setName(rs.getString("NAME"));
				stud.setId(rs.getString("ID"));
				stud.setGrade(rs.getInt("GRADE"));
				stud.setJumin(rs.getString("JUMIN"));
				stud.setBirthday(rs.getString("BIRTHDAY"));
				stud.setTel(rs.getString("TEL"));
				stud.setHeight(rs.getInt("HEIGHT"));
				stud.setWeight(rs.getInt("WEIGHT"));
				stud.setDeptno1(rs.getInt("DEPTNO1"));
				stud.setDeptno2(rs.getInt("DEPTNO2"));
				stud.setProfno(rs.getInt("PROFNO"));
				
				if(studList == null)
					studList = new ArrayList<>();
				studList.add(stud);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studList;
	}
	
	public List<StudentDTO> findStudentListByGrade(int grade) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " SELECT " +
						  " STUDNO,NAME,ID,GRADE,JUMIN, " +
						  " TO_CHAR(BIRTHDAY, 'YYYY-MM-DD') BIRTHDAY, " +
						  " TEL,HEIGHT,WEIGHT,DEPTNO1,DEPTNO2,PROFNO " +
						  " FROM STUDENT " +
						  " WHERE GRADE = ? ";
		
		List<StudentDTO> studList = null;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, grade);
			rs = psmt.executeQuery();

			while(rs.next()) {
				StudentDTO stud = new StudentDTO();
				
				stud.setStudno(rs.getInt("STUDNO"));
				stud.setName(rs.getString("NAME"));
				stud.setId(rs.getString("ID"));
				stud.setGrade(rs.getInt("GRADE"));
				stud.setJumin(rs.getString("JUMIN"));
				stud.setBirthday(rs.getString("BIRTHDAY"));
				stud.setTel(rs.getString("TEL"));
				stud.setHeight(rs.getInt("HEIGHT"));
				stud.setWeight(rs.getInt("WEIGHT"));
				stud.setDeptno1(rs.getInt("DEPTNO1"));
				stud.setDeptno2(rs.getInt("DEPTNO2"));
				stud.setProfno(rs.getInt("PROFNO"));
				
				if(studList == null)
					studList = new ArrayList<>();
				studList.add(stud);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studList;
	}
	
	public int saveStudent(StudentDTO studentDTO) {
		Connection conn = null;
		PreparedStatement psmt = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " INSERT INTO STUDENT "
				+ " (STUDNO,NAME,ID,GRADE,JUMIN,BIRTHDAY,TEL,HEIGHT,WEIGHT,DEPTNO1,DEPTNO2,PROFNO) "
				+ " VALUES (?,?,?,?,?,TO_DATE(?,'YYYY-MM-DD'),?,?,?,?,?,?) ";
		
		int result = 0;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, studentDTO.getStudno());
			psmt.setString(2, studentDTO.getName());
			psmt.setString(3, studentDTO.getId());
			psmt.setInt(4, studentDTO.getGrade());
			psmt.setString(5, studentDTO.getJumin());
			psmt.setString(6, studentDTO.getBirthday());
			psmt.setString(7, studentDTO.getTel());
			psmt.setInt(8, studentDTO.getHeight());
			psmt.setInt(9, studentDTO.getWeight());
			psmt.setInt(10, studentDTO.getDeptno1());
//			psmt.setInt(11, studentDTO.getDeptno2()); // int형
			if(studentDTO.getDeptno2() == null) {
				psmt.setNull(11, Types.INTEGER);	//null 세팅
			} else {
				psmt.setInt(11, studentDTO.getDeptno2());
			}
			psmt.setInt(12, studentDTO.getProfno());
			
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, null);
		}
		
		return result;
	}
}
