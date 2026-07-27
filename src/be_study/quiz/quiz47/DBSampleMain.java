package be_study.quiz.quiz47;

import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		
		//1. 기본 student 전체 조회 메소드
		List<StudentDTO> entireStudentList = studentDAO.findStudentList();
		if(entireStudentList != null) {
			for(StudentDTO s : entireStudentList) {
				System.out.println(s);
			}
		}
		
		System.out.println("**3학년 학생-------------------------------------");
		//2. 학년(grade)을 받아서 해당 학년 student 데이터를 조회하는 메소드
		List<StudentDTO> studentListG3 = studentDAO.findStudentListByGrade(3);
		if(studentListG3 != null) {
			for(StudentDTO s : studentListG3) {
				System.out.println(s);
			}
		}
		
		System.out.println("-----------------------------------------------");
		//3. StudentDTO 객체를 전달받아서 데이터를 저장(Insert)하는 메소드
		//저장할 데이터 생성
		StudentDTO student1 = new StudentDTO();
		student1.setStudno(7777);
		student1.setName("Hong Gildong");
		student1.setId("Mr.Hong");
		student1.setGrade(1);
		student1.setJumin("1234561234567");
		student1.setBirthday("2000-05-31");
		student1.setTel("02)123-1234");
		student1.setHeight(174);
		student1.setWeight(85);
		student1.setDeptno1(101);
		student1.setDeptno2(201);
		student1.setProfno(1001);
		
		//데이터 저장
		int result1 = studentDAO.saveStudent(student1);
		if(result1 > 0)
			System.out.println("데이터 저장 성공");
		
		//입력한 데이터 확인 (1학년으로 입력했으니 1학년 리스트 불러오기)
		List<StudentDTO> studentListG1 = studentDAO.findStudentListByGrade(1);
		if(studentListG1 != null) {
			for(StudentDTO s : studentListG1) {
				System.out.println(s);
			}
		}
		
		StudentDTO student2 = new StudentDTO();
		student2.setStudno(7788);
		student2.setName("KimYusin");
		student2.setId("Mr.Kim");
		student2.setGrade(2);
		student2.setJumin("6543217654321");
		student2.setBirthday("2000-05-31");
//		student2.setTel("02)123-1234");
		student2.setTel(null);	//String s = null;
		student2.setHeight(180);
		student2.setWeight(96);
		student2.setDeptno1(102);
//		student2.setDeptno2(202);	// int형은 null값이 불가
		student2.setDeptno2(null);	// Integer는 null값이 가능
		student2.setProfno(1002);
		
		//데이터 저장
		int result2 = studentDAO.saveStudent(student2);
		if(result2 > 0)
			System.out.println("데이터 저장 성공");
				
		//입력한 데이터 확인 (2학년으로 입력했으니 2학년 리스트 불러오기)
		List<StudentDTO> studentListG2 = studentDAO.findStudentListByGrade(2);
		if(studentListG2 != null) {
			for(StudentDTO s : studentListG2) {
				System.out.println(s);
			}
		}
	}

}
