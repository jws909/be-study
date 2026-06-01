package be_study.abst;

public class Hite extends Beverage {
	
	double alcohol; //몇도짜리냐
	
	public void checkAlcohol() {
		System.out.println("Hite 알콜 도수 확인");
	}

	public void checkSafety() {
		System.out.println("알콜 도수 문제 확인");
	}
}
