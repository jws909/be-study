package be_study.quiz.quiz53;

public class ApiServiceMain {

	public static void main(String[] args) {
		ArpltnInforInqireSvcRepository repository = new ArpltnInforInqireSvcRepository();
		
		MinuDustWeekDAO minuDustWeekDAO = new MinuDustWeekDAO();
		MinuDustDTO minuDustDTO = null;
		
		try {
			minuDustDTO = repository.getMinuDustDTO("2026-07-26");
			System.out.println(minuDustDTO);
			
			int result = minuDustWeekDAO.saveMinuDust(minuDustDTO);
			if(result > 0)
				System.out.println("데이터 저장 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
