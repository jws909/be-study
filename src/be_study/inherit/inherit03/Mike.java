package be_study.inherit.inherit03;

public class Mike {
	
	//마이크
	String type;
	String model;
	int price;
	
	public void volumeUp() {
		System.out.println("Mike volumeUp()");
	}
	
	public void check() {
		System.out.println("Mike check() 기능체크");
	}
	
	
	//메소드 재정의 불가
	public final void noMethod() {
		System.out.println("Mike noMethod()");
	}
	
	//여러 메소드...
}
