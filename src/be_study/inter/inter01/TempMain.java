package be_study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		
		//인터페이스는 자체적인 객체 생성 불가
		//TempInterface ti = new TempInterface();
		
		TempObject t1 = new TempObject();
		t1.method1();
		//상수를 객체에서 접근하는것은 권장되지않는다
//		System.out.println(t1.SUCESS);
//		System.out.println(t1.FAIL);
		
		System.out.println(TempInterface.SUCESS);	//상수 사용 접근 방식
		System.out.println(TempInterface.FAIL);
		
		//부모타입변수 = 자식객체변수
		//인터페이스타입변수 = 구현한객체변수
		TempInterface t2 = new TempObject();
		t2.method1();
		
		TempInterface[] tArr = {new TempObject(), new TempObject()};
		
		TempObject t3 = (TempObject)t2;
		t3.method99();
		
		TempInterface t10 = new TempObject();
		TempInterface2 t11 = new TempObject();
		
		t10.method1();
		
		t11.method2();
		t11.method3();
		
		/*
			클래스 상속
				- 부모클래스 객체 생성 가능
				- 필드변수 선언 가능
				- 메소드 구현
				- 부모타입변수 = 자식객체
				- 싱속 선언 1개만 가능
				- A is a B
			
			추상클래스 상속
				- 부모클래스 객체 생성 불가능
				- 필드변수 선언 가능
				- 메소드 구현 + 추상 메소드 선언
				- 추상부모타입변수 = 자식객체
				- 상속 선언 1개만 가능
				- A is a B
			
			인터페이스 구현
				- 인터페이스 객체 생성 불가능
				- 필드변수 선언 불가능 -> 변수는 전부 상수화(static final)
				- 추상메소드 선언 (abstract)
				- 인터페이스타입변수 = 구현객체
				- 인터페이스 구현 여러개 (n개)
				- 인터페이스는 인터페이스를 다중 상속 가능
				- A has a B
			
			*공통
				다형성 : 동일한 사용법 -> 다른 수행 결과
				매개변수, 리턴타입 다형성
			
		*/
	}

}
