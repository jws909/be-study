package be_study.db.v2;

import java.util.ArrayList;
import java.util.List;

public class DBSampleMain {
	public static void main(String[] args) {
		
		// DB dept 테이블 관련 데이터 접근 담당 객체
		DeptDAO deptDAO = new DeptDAO();
		
		//insert 저장
		
		int result1 = deptDAO.saveDept(90, "DEV", "SEOUL");
		if(result1 > 0) {
			System.out.println("저장 성공 ~ 111");
		}
		
		Dept saveDept1 = new Dept();
		saveDept1.setDeptno(91);
		saveDept1.setDname("Adv");
		saveDept1.setLoc("Busan");
		
		int result2 = deptDAO.saveDept(saveDept1);
		if(result2 > 0) {
			System.out.println("저장 성공 ~ 222");
		}
		//----------------------------------------------
		
		int result3 = deptDAO.removeDept(90);
		if(result3 > 0) {
			System.out.println("삭제 성공 ~ 333");
		}
		
		int result4 = deptDAO.removeDept(saveDept1);
		if(result4 > 0) {
			System.out.println("삭제 성공 ~ 444");
		}
		
		//80번부서 삭제
		deptDAO.removeDept(80);
		Dept rmd1 = new Dept(80, null, null);
		deptDAO.removeDept(rmd1);
		
		//----------------------------------------------
		
		//여러개를 저장 하는 케이스
		
		List<Dept> saveDeptList = new ArrayList<Dept>();
		saveDeptList.add(new Dept(81, "dn81", "loc81"));
		saveDeptList.add(new Dept(82, "dn82", "loc82"));
		saveDeptList.add(new Dept(83, "dn83", "loc83"));
		
		int result5 = 0;
		for(Dept d : saveDeptList) {
			int r = deptDAO.saveDept(d);
			result5 += r;
		}
		if(result5 > 0) {
			System.out.println(result5 + "행 추가 완료");
		}
		
		//----------------------------------------------

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
