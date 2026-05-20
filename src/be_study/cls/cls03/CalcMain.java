package be_study.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		
		//계산기 객체 생성
		Calc c1 = new Calc();
		
		//c1.name = "이름";
		//	필드변수접근
		//	클래스변수명.필드변수명
		
		//	메소드 호출
		//	클래스변수명.메소드명();
		
		c1.powerOn(); //메소드 호출(실행)
		
		// c1.powerOn();	매개변수가 없는 powerOn 이름의 메소드 호출
		c1.setOwner("나이름");
		
		Calc c2 = new Calc();
		c2.powerOn();
		c2.setOwner("다네임");
		
		c2.sum(10, 20);	//리턴타입이 있더라도 값을 받지않아도 된다
		int result1 = c2.sum(10, 20);
		System.out.println(result1);
		
		System.out.println(c2.sum(30, 50));
		
		double result2 = c2.divide(30, 7);
		System.out.println(result2);
		System.out.println(c2.divide(30, 7));
		
		int result3 = (int)c2.divide(30, 7);
		System.out.println(result3);
		
		int chkB = c2.checkBattery();
		System.out.println("잔여배터리량 : "+ chkB);
		System.out.println("계산기제조사 : "+ c2.madeByInfo());
		
		String info = c2.madeByInfo();
	}

}
