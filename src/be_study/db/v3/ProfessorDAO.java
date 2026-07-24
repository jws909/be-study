package be_study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
	
	public List<ProfessorDTO> findProfessortList(){
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		conn = DBConnectionManager.connectDB();
		
		//String sqlQuery = " SELECT PROFNO, NAME, ID, HIREDATE FROM PROFESSOR ";
		
		String sqlQuery = " SELECT PROFNO, NAME, ID, " +
						  " TO_CHAR(HIREDATE, 'YYYY-MM-DD') HIREDATE " +
						  " FROM PROFESSOR ";
		
		List<ProfessorDTO> professorList = null;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				ProfessorDTO professor = new ProfessorDTO();
				professor.setProfno(rs.getInt("PROFNO"));
				professor.setName(rs.getString("NAME"));
				professor.setId(rs.getString("ID"));
				
				//professor.setHiredate(rs.getDate("HIREDATE"));
				// LocalDateTime <--> java.sql.Date 타입 불일치로 저장 불가
				
				//Timestamp -> LocalDateTime
				//LocalDateTime ldt = ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("HIREDATE"));
				//professor.setHiredate(ldt);
				
				//Timestamp -> LocalDateTime -> DateString
				//LocalDateTime ldt = ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("HIREDATE"));
				//String ds = ConvertDateUtil.convertLocalDateTimeToDateString(ldt);
				//professor.setHiredate(ds);
				professor.setHiredate(rs.getString("HIREDATE"));
				
				if(professorList == null)
					professorList = new ArrayList<>();
				professorList.add(professor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return professorList;
	}
	
	public int saveProfessor(ProfessorDTO professorDTO) {
		Connection conn = null;
		PreparedStatement psmt = null;
		
		conn = DBConnectionManager.connectDB();
		
//		String sqlQuery = " INSERT INTO PROFESSOR " +
//					" VALUES (?,?,?,'position',100,?,0,0,NULL,NULL) ";
		
		String sqlQuery = " INSERT INTO PROFESSOR " +
				" VALUES (?,?,?,'position',100,TO_DATE(?,'YYYY-MM-DD'),0,0,NULL,NULL) ";
		
		int result = 0;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, professorDTO.getProfno());
			psmt.setString(2, professorDTO.getName());
			psmt.setString(3, professorDTO.getId());
			
//			LocalDateTime ldt = ConvertDateUtil.convertDateStringToLocalDateTime(professorDTO.getHiredate());
//			psmt.setTimestamp(4, ConvertDateUtil.convertLocalDateTimeToTimestamp(ldt));
			psmt.setString(4, professorDTO.getHiredate());
			
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, null);
		}
		
		return result;
	}
}
