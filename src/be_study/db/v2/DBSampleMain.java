package be_study.db.v2;

import java.util.List;

public class DBSampleMain {
	public static void main(String[] args) {

		// DB dept 테이블 관련 데이터 접근 담당 객체
		DeptDAO deptDAO = new DeptDAO();

		Dept dept1 = deptDAO.findDeptByDeptno(30);
		System.out.println(dept1.getDname());
		System.out.println(dept1.getDeptno());
		System.out.println(dept1);

		Dept dept2 = deptDAO.findDeptByDeptno(90);
		if (dept2 == null) {
			System.out.println("90번에 해당하는 데이터가 없구나");
		} else {
			System.out.println(dept2);
		}

		Dept dept3 = deptDAO.findDeptByDname("RESEARCH");
		System.out.println(dept3);

		Dept dept4 = deptDAO.findDeptByDname("REST");
		System.out.println(dept4);

		List<Dept> deptList = deptDAO.findDeptList();
		if (deptList != null)
			for (Dept d : deptList)
				System.out.println(d);

		// DB product 테이블 관련 데이터 접근 담당 객체
		ProductDAO productDAO = new ProductDAO();

		// 단일 행(P_CODE = 104) 출력
		Product prod1 = productDAO.findProductBypCode(104);
		if (prod1 != null)
			System.out.println(prod1);
		else
			System.out.println("조회된 데이터가 없습니다.");

		System.out.println("--------------------------------------------");

		// 객체 리스트 출력
		List<Product> prodList1 = productDAO.findProductList();
		if (prodList1 != null) {
			for (Product p : prodList1)
				System.out.println(p);
		} else {
			System.out.println("조회된 데이터가 없습니다.");
		}

	}

}
