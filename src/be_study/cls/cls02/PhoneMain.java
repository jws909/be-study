package be_study.cls.cls02;

public class PhoneMain {

	public static void main(String[] args) {
		
//		Phone p1 = new Phone();
		//매개변수 없는 생성자가 선언되어 있지 않으면 생성 불가
		
		Phone p2 = new Phone("갤럭시 S26");
		Phone p3 = new Phone("아이폰10", 990000);	//String model, int price
		
		//논리적 오류라 실제로 오류가 발생하지는 않는다, 단순히 int타입이기만하면 됨
		Phone p4 = new Phone("아이폰11", 3100); //가격대신 배터리 용량을 넣은 논리적 오류
		
		Phone p5 = new Phone(4000, "갤럭시Z플립");//int battery, String model
		
		Phone p6 = new Phone("갤럭시 폴드4", 2100000, 4200);
		
		

	}

}
