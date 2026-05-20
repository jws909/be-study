package be_study.cls.cls03;

public class Calc {
	
	//계산기 객체
	//Calculator
	
	//필드
	//생성자
	//메소드
	
	/* 
		
		리턴타입 메소드명(매개변수){
			실행문
			return ...
		}
		
		리턴		매개변수
		O		O
		O		X
		X		O
		X		X
		
		리턴타입 : 결과로 반환할 데이터의 타입 (String, int, double ...)
				 반환할 것이 없으면? void
	 
	*/
	String name;
	
	// 계산기 전원 켜기 -> 리턴 X 매개변수 X
	void powerOn() {
		System.out.println("power On");
	}
	
	void showOwner() {
		System.out.println(name +" 님 소유자로 등록되었습니다.");
	}
	
	// 계산기 소유자 이름 등록 -> 리턴 X 매개변수 O
	void setOwner(String name) {
		this.name = name;
		this.showOwner();
	}
	
	// 계산기 계산 수행 -> 리턴 O 매개변수 O (더하기 더할 숫자 값 전달)
	int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	// 메소드 오버로딩 (매개변수의 타입, 순서, 개수 다르게) : 
	// 메소드 호출하는 시점에 어떤 메소드인지 구분이 가능해야함.
	double sum(double n1, double n2) {
		double result = n1 + n2;
		return result;
	}
	
	int sum(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result;
	}
	
	//나누기
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	//배터리 잔여량 확인 메소드 -> 리턴 O 매개변수 X
	int checkBattery() {
		//배터리 잔여 퍼센트
		return 80;
	}
	
	//제조사 (회사) 어디꺼냐 확인 메소드
	String madeByInfo() {
		return "카시오";
	}
}
