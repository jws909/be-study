package be_study.abst;

public class Coke extends Beverage {

	int sugar; //당분 함량
	
	public void introduce() {
		System.out.println("저는 Coke 입니다.");
	}
	
	public void checkSafety() {
		System.out.println("당분 함량 확인");
	}
}
