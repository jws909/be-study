package be_study.quiz.quiz48;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	
	public List<StudentScoreGradeDTO> findStudentScoreGradeListByDeptno(int deptno) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " SELECT "
				+ "    ST.STUDNO, ST.NAME, SC.TOTAL, H.GRADE "
				+ " FROM STUDENT ST, SCORE SC, HAKJUM H "
				+ " WHERE ST.STUDNO = SC.STUDNO "
				+ " AND SC.TOTAL BETWEEN H.MIN_POINT AND H.MAX_POINT "
				+ " AND ST.DEPTNO1 = ? ";
		
		List<StudentScoreGradeDTO> ssgDTOList = null;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				StudentScoreGradeDTO ssgDTO = new StudentScoreGradeDTO();
				
				ssgDTO.setStudno(rs.getInt("STUDNO"));
				ssgDTO.setName(rs.getString("NAME"));
				ssgDTO.setTotal(rs.getInt("TOTAL"));
				ssgDTO.setGrade(rs.getString("GRADE"));
				
				if(ssgDTOList == null)
					ssgDTOList = new ArrayList<>();
				ssgDTOList.add(ssgDTO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return ssgDTOList;
	}
}
