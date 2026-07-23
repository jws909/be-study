package be_study.quiz.quiz46;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Quiz46 {

	public static void main(String[] args) {
		
		List<Professor> profList1 = findProfessorListByDeptno(101);
		
		if(profList1 != null) {
			for(Professor p : profList1)
				System.out.println(p);
		} else {
			System.out.println("조회된 데이터가 없습니다.");
		}
		
	}
	
	public static List<Professor> findProfessorListByDeptno(int deptno){
		DBConnection DB = new DBConnection();
		
		DB.connectDB();
		
		List<Professor> profList = null;
		String sqlQuery = " SELECT PROFNO,NAME,ID,POSITION,PAY,DEPTNO " +
						  " FROM PROFESSOR " +
						  " WHERE DEPTNO = ? ";
		
		try {
			
			DB.psmt = DB.conn.prepareStatement(sqlQuery);
			DB.psmt.setInt(1, deptno);
			DB.rs = DB.psmt.executeQuery(); //쿼리실행
			
			while(DB.rs.next()) {
				//데이터가 있다
				Professor prof = new Professor(DB.rs.getInt("PROFNO"),
											   DB.rs.getString("NAME"),
											   DB.rs.getString("ID"),
											   DB.rs.getString("POSITION"),
											   DB.rs.getInt("PAY"),
											   DB.rs.getInt("DEPTNO"));
				
				if(profList == null)
					profList = new ArrayList<>();
				
				profList.add(prof);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DB.disconnectDB();
		
		return profList;
	}
}
