package be_study.inter.inter01;

//상속 : 부모클래스를 상속받는다. 확장한다. extends

//인터페이스를 구현하겠다
//인터페이스는 다중 구현이 가능하다
public class TempObject implements TempInterface, TempInterface2 {

	@Override
	public void method1() {
		//재정의 필수
		System.out.println("method1()");
	}
	
	public void method99() {
		System.out.println("method99()");
	}

	@Override
	public void method2() {
		System.out.println("method2()");
	}

	@Override
	public void method3() {
		System.out.println("method3()");
	}
	
}
