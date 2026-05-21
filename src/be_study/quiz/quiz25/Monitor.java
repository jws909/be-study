package be_study.quiz.quiz25;

public class Monitor {
	//다음 가이드에 따라 클래스를 선언하고, 클래스 인스턴스를 생성하세요.
	//생성한 클래스 변수의 값들을 차례대로 출력하는 메소드를 구현하여 호출하세요.

	//모니터 클래스 생성
//	*속성
//	인치수(int타입)
//	제조사(String타입)
//	모델명(String타입)
	int size;
	String company;
	String model;

//	*생성자
//	매개변수로 3개를 모두 받아서 저장하는 생성자
	Monitor(String company, String model, int size){
		this.company = company;
		this.model = model;
		this.size = size;
	}
	
//	*메소드
//	가지고 있는 3개의 정보를 출력하는 printInfo 메소드 생성
	void printInfo() {
		//제조사:삼성 모델명:더프레임 인치:65인치
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n", company, model, size);
	}
}
