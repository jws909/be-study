package be_study.db.v4;

public class DBSampleMain {

	public static void main(String[] args) {
		
		
		//student
		//department
		
		// BE 프로세스
		
		// 조회
		// 조회... DB조회
		
		// FE 화면 전달
		
		int pk = 9511; //이전 사용중에 해당 학생정보 조회 요청 -> pk 값 전달 받음
		
		
		// 1) 각자 조회해서 각각 객체 전달
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO s1 = studentDAO.findStudentByStudno(pk);
		
		System.out.println(s1);
		
		// 학과 정보 조회 department
		// s1.getDeptno1();  학생의 전공 번호 deptno1 조회 가능
		// deptno pk 값으로 조회
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO d1 = departmentDAO.findDepartmentByDeptno(s1.getDeptno1());
		
		System.out.println(d1);
		
		System.out.println(s1.getName() + " : " + d1.getDname());
		
		// 2) join 쿼리 포함해서 한번에 합쳐진 DTO 객체로 전달
		StudentMypageDTO smDTO = studentDAO.findStudentMypageByStudno(pk);
		System.out.println(smDTO);
		System.out.println(smDTO.getName() + " : " + smDTO.getDname());
	}

}
