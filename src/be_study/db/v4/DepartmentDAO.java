package be_study.db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DepartmentDAO {

	public DepartmentDTO findDepartmentByDeptno(int deptno) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		conn = DBConnectionManager.connectDB();
		
		String sqlQuery = " SELECT * FROM DEPARTMENT WHERE DEPTNO = ? ";
		
		DepartmentDTO departmentDTO = null;
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, deptno);
			rs = psmt.executeQuery();

			if(rs.next()) {
				departmentDTO = new DepartmentDTO();
				
				departmentDTO.setDeptno(rs.getInt("DEPTNO"));
				departmentDTO.setDname(rs.getString("DNAME"));
				departmentDTO.setPart(rs.getInt("PART"));
				departmentDTO.setBuild(rs.getString("BUILD"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return departmentDTO;
	}
}
