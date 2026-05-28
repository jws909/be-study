package be_study.cls.cls13;

public class AttendMain {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "가가";
		s1.stuNum = 1;
//		s1.phone 010...
		s1.card = new Card(11, "체크", "가가", "신한");
		
		Student s2 = new Student();
		s2.name = "나나";
		s2.stuNum = 2;
		
		Card c2 = new Card(22, "신용", "나나", "국민");
		s2.setCard(c2);
		
		AttendTool tool = new AttendTool();
		tool.org = "트레이닝학원";
		tool.powerOn();
		
		boolean result1 = tool.checkAttend(c2);
		if(result1) {
			System.out.println("출결처리 성공");
		} else {
			System.out.println("실패. 카드 확인하세요.");
		}
		
		boolean result2 = tool.checkAttend(s1.card);
		
		int result3 = tool.checkAttend2(s2.getCard());
		
		//switch
		if(result3 == 1) {
			
		} else if(result3 == 2) {
			//...
		}
		
		boolean result4 = tool.checkAttend(c2, s2);
		boolean result5 = tool.checkAttend(c2, s1);
		boolean result6 = tool.checkAttend(s1.getCard(), s1);
		
		boolean result7 = tool.checkAttend(s1);

	}

}
