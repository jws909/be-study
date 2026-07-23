package be_study.quiz.quiz45;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBProductMain {

	public static void main(String[] args) {
		
		// 단일 행(P_CODE = 104) 출력
		Product prod1 = findProduct();
		if(prod1 != null)
			System.out.println(prod1);
		else
			System.out.println("조회된 데이터가 없습니다.");
		
		System.out.println("--------------------------------------------");
		
		// 객체 리스트 출력
		List<Product> prodList1 = findProductList();
		if(prodList1 != null) {
			for(Product p : prodList1)
				System.out.println(p);
		} else {
			System.out.println("조회된 데이터가 없습니다.");
		}

	}

	public static Product findProduct() {
		DBConnection DB = new DBConnection();
		
		DB.connectDB();
		
		Product prod = null;
		String sqlQuery = " SELECT * FROM PRODUCT WHERE P_CODE = 104 ";
		
		try {
			
			DB.psmt = DB.conn.prepareStatement(sqlQuery);
			DB.rs = DB.psmt.executeQuery(); //쿼리실행
			
			if(DB.rs.next()) {
				//데이터가 있다
				prod = new Product();
				
				prod.setpCode(DB.rs.getInt("P_CODE"));
				prod.setpName(DB.rs.getString("P_NAME"));
				prod.setpPrice(DB.rs.getInt("P_PRICE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DB.disconnectDB();
		
		return prod;
	}
	
	public static List<Product> findProductList() {
		DBConnection DB = new DBConnection();
		
		DB.connectDB();
		
		List<Product> prodList = null;
		String sqlQuery = " SELECT * FROM PRODUCT ";
		
		try {
			
			DB.psmt = DB.conn.prepareStatement(sqlQuery);
			DB.rs = DB.psmt.executeQuery(); //쿼리실행
			
			while(DB.rs.next()) {
				//데이터가 있다
				Product prod = new Product();
				
				prod.setpCode(DB.rs.getInt("P_CODE"));
				prod.setpName(DB.rs.getString("P_NAME"));
				prod.setpPrice(DB.rs.getInt("P_PRICE"));
				
				if(prodList == null)
					prodList = new ArrayList<>();
				
				prodList.add(prod);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DB.disconnectDB();
		
		return prodList;
	}
}
