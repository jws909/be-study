package be_study.db.v3;

import java.util.List;

public class DBSampleMain {

	public static void main(String[] args) {
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		List<ProfessorDTO> professorList = professorDAO.findProfessortList();
		
		if(professorList != null) {
			for(ProfessorDTO p : professorList) {
				//System.out.println(p);
				//yyyy-MM-dd
				String hiredate = ConvertDateUtil.convertLocalDateTimeToDateString(p.getHiredate());
				System.out.println(hiredate);
			}
		}

	}

}
