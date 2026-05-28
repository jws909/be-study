package be_study.cls.cls13;

//출결 체크 도구
public class AttendTool {
	
	boolean isPowerOn; //전원 켜짐 여부
	String org; //어떤 조직/회사를 위한 도구냐
	
	public void powerOn() {	//전원 켜는 기능
		isPowerOn = true; //전원켜진 상태 값 -> true -> 켜진상태
		//필요한 로직 코드
		System.out.println("전원이 켜졌습니다.");
	}
	
	//출결체크
	public boolean checkAttend(Card card) {
		
		//출결 체크
		// 카드 id 확인 -> 누구 카드냐 -> 지금 일/수업 참여하고 있는 사람이냐
		
		System.out.printf("%s 소유의 %s 카드 출결 확인\n", card.owner, card.brand);
		
		//출결체크 성공
		return true;
		
		//출결체크 실패(문제발생)
//		return false;
		
	}
	
	// 출결체크 결과 -> 기준코드		1:출근성공 2:실패 3:퇴근성공 4:조퇴처리 5:출근시각
	public int checkAttend2(Card card) {
		
		//로직
		// 지금시간, 카드누구꺼, 과정/회사 등록, 이전에 출근이 찍혀있느냐...
		
		System.out.printf("[checkAttend2] %s 소유의 %s 카드 출결 확인\n", card.owner, card.brand);
		
		//if...
		//return 4;
		//return 5;
		
		return 1; //출근처리성공
	}
	
	// 카드 + 카드 찍는 학생 -> 이게 맞는지 교차 ..
	public boolean checkAttend(Card card, Student student) {
		
		//상세 로직..
		System.out.println("카드 소유주 : "+ card.owner);
		System.out.println("카드 태그 학생 : "+ student.name);
		
		if(card.owner.equals(student.name)) { //카드 소유주 == 지금 카드찍는 학생
			return true;
		}
		
		return false;
	}
	
	//출결 체크할때 학생정보만 전달 -> 학생정보 내부에 card 객체 존재 -> 카드 내부에 정보
	public boolean checkAttend(Student student) {
		// student.name  학생이름
		// student.card  학생이보유한 카드
		// student.card.owner 카드가 누구카드다

		// == 비교 로직
		return true;
	}
}
