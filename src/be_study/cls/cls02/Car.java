package be_study.cls.cls02;

public class Car {

	//필드 (속성 변수)
	String model; //모델명	기본값 null
	String color; //차량색상	기본값 null
	int price;	  //차량가격	기본값 0
	
	
	//생성자 (생성할때 초기화 할일...)
	// new 클래스명();	호출
	
	//생성자를 아무것도 만들지 않으면? -> 자동으로 기본 생성자가 추가
	// Car(){ }
	Car(){
		//기본생성자	매개변수가 없는 생성자
		//클래스명과 동일
		//객체 생성하면서 초기에 할일
		//	필드 초기화 (필드변수에 초기값 세팅)
		System.out.println("Car() 생성자 호출됨");
		color = "green";
		model = null;
		price = 0; //필드 초기화 수행
	}
	
	Car(String _model){
		System.out.println("Car(String _model) 생성자 호출됨");
		model = _model;
		
		//이 생성자를 통해서 객체가 만들어지는 과정
		//매개변수 전달은 _model 에 들어있는 값을
		// 객체의 필드변수 model 에 저장한다
	}
	
	//매개변수가 2개인 생성자
	Car(String model, String color){
		System.out.println("Car(String _model, String _color) 생성자 호출됨");
		this.model = model;
		this.color = color;
		
		//this.price = 1000000;
		//price = 10000000;	//변수명 이름이 겹치지 않으면 그냥 써도 필드변수로 인식
	}
	
	
	//메소드 (기능 동작)
}
