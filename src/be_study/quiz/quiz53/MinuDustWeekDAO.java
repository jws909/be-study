package be_study.quiz.quiz53;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MinuDustWeekDAO {
	/*
	CREATE TABLE MINU_DUST
	(
	    SEARCH_DATE VARCHAR2(10) PRIMARY KEY,
	    FRCST_ONE_DT VARCHAR2(10),
	    FRCST_ONE_CN VARCHAR2(4000),
	    FRCST_TWO_DT VARCHAR2(10),
	    FRCST_TWO_CN VARCHAR2(4000)
	); 
	*/

	public int saveMinuDust(MinuDustDTO minuDustDTO) {
		Connection conn = null;
		PreparedStatement psmt = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " INSERT INTO MINU_DUST "
				+ " VALUES (?,?,?,?,?) ";
		
		int result = 0;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setString(1, minuDustDTO.getSearchDate());
			psmt.setString(2, minuDustDTO.getFrcstOneDt());
			psmt.setString(3, minuDustDTO.getFrcstOneCn());
			psmt.setString(4, minuDustDTO.getFrcstTwoDt());
			psmt.setString(5, minuDustDTO.getFrcstTwoCn());
			
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, null);
		}
		
		return result;
	}
}
