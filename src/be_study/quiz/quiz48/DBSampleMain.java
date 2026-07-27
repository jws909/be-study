package be_study.quiz.quiz48;

import java.util.ArrayList;
import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		
		//101번 학과 학생 점수 리스트
		List<StudentScoreGradeDTO> ssgDTOList1 = null;
		ssgDTOList1 = studentDAO.findStudentScoreGradeListByDeptno(101);
		
		//102번 학과 학생 점수 리스트
		List<StudentScoreGradeDTO> ssgDTOList2 = null;
		ssgDTOList2 = studentDAO.findStudentScoreGradeListByDeptno(102);
		
		//101번 학과 학생과 102번 학과 학생 점수 전체 리스트
		List<StudentScoreGradeDTO> ssgDTOList = new ArrayList<>();
		ssgDTOList.addAll(ssgDTOList1);
		ssgDTOList.addAll(ssgDTOList2);
		
		//101번, 102번 학과 학생 점수 전체 리스트 출력
		if(ssgDTOList.size() > 0)
			for(StudentScoreGradeDTO ssgDTO : ssgDTOList)
				System.out.println(ssgDTO);

	}

}
