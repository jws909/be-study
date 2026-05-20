package be_study.cls.cls02;

public class Phone2 {
	//this() 생성자 호출
	
	//필드
	String model; //모델명
	int price; //가격
	int battery; //배터리용량
	
	Phone2(String model){ 
//		this.model = model;
//		this.price = 0;
//		this.battery = 2500;
		this(model, 0, 2500);
	}
	
	Phone2(String model, int price){
//		this.model = model;
//		this.price = price;
//		this.battery = 2500;
		this(model, price, 2500);
	}
	
	Phone2(int battery, String model){
//		this.battery = battery;
//		this.model = model;
//		this.price = 0;
		this(model, 0, battery);
	}
	
	Phone2(String model, int price, int battery){
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	
	//메소드
}
