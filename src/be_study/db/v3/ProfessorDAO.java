package be_study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
	
	public List<ProfessorDTO> findProfessortList(){
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " SELECT PROFNO, NAME, ID, HIREDATE " +
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
				LocalDateTime ldt = ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("HIREDATE"));
				professor.setHiredate(ldt);
				
				if(professorList == null)
					professorList = new ArrayList<>();
				professorList.add(professor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return professorList;
	}
}
