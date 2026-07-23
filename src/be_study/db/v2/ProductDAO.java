package be_study.db.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
	public Product findProductBypCode(int pCode) {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
		
		conn = DBConnectionManager.connectDB();
		
		Product prod = null;
		String sqlQuery = " SELECT * FROM PRODUCT WHERE P_CODE = ? ";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			psmt.setInt(1, pCode);
			rs = psmt.executeQuery(); //쿼리실행
			
			if(rs.next()) {
				//데이터가 있다
				prod = new Product();
				
				prod.setpCode(rs.getInt("P_CODE"));
				prod.setpName(rs.getString("P_NAME"));
				prod.setpPrice(rs.getInt("P_PRICE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return prod;
	}
	
	public List<Product> findProductList() {
		//db 연결, 실행 객체
		Connection conn = null; //db 연결
		PreparedStatement psmt = null; //db 연결해서 sql 명령 실행해주는 객체
		ResultSet rs = null; //sql 실행 후 select 결과를 저장하는 객체
				
		conn = DBConnectionManager.connectDB();
		
		List<Product> prodList = null;
		String sqlQuery = " SELECT * FROM PRODUCT ";
		
		try {
			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery(); //쿼리실행
			
			while(rs.next()) {
				//데이터가 있다
				Product prod = new Product();
				
				prod.setpCode(rs.getInt("P_CODE"));
				prod.setpName(rs.getString("P_NAME"));
				prod.setpPrice(rs.getInt("P_PRICE"));
				
				if(prodList == null)
					prodList = new ArrayList<>();
				
				prodList.add(prod);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return prodList;
	}
}
