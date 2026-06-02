package be_study.quiz.quiz38.v2;

// class Unit
// abstract class unit
// interface Unit ??? -> 필드변수X, 재정의하는 메소드 선언

public abstract class Unit {
	//추상클래스화
	// Unit 이라는 객체를 생성하면 어색하다
	
	int x, y; //현재위치
	
	public abstract void move(int x, int y);
	//직접 정의 X
	//재정의 강제
	//다형성을 위해서 부모클래스 쪽에 사용법을 인지를 위해 선언
	
	public void stop() { //현재 위치에 정지
		System.out.println(x +", "+ y + " 위치에 정지하였습니다.");
	}
}
