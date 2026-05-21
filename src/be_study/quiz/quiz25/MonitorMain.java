package be_study.quiz.quiz25;

public class MonitorMain {

	public static void main(String[] args) {
		//모니터 클래스 활용
		//*별도의 main 메소드를 가진 클래스 파일 필요.
//		모니터 객체 인스턴스를 생성하여, 모니터 타입 변수에 저장한 후 아래와 같이 출력되도록 작성.
		//Monitor(String company, String model, int size)
		Monitor ss = new Monitor("삼성", "더프레임", 65);
		Monitor lg = new Monitor("LG", "올레드", 80);
		
		//실행 시 아래와 같은 형태로 출력이 나와야합니다.
//		제조사:삼성 모델명:더프레임 인치:65인치
//		제조사:LG 모델명:올레드 인치:80인치
		ss.printInfo();
		lg.printInfo();

	}

}
