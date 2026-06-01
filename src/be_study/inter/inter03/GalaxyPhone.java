package be_study.inter.inter03;

public class GalaxyPhone implements Callable, Connectable {

	int callStatus; // 전화 상태변수
	
	@Override
	public void call() {
		System.out.println("GalaxyPhone call()");	
		//기능
		callStatus = Callable.CALL_ON;
	}

	@Override
	public void connect() {
		System.out.println("GalaxyPhone connect()");
	}

}
