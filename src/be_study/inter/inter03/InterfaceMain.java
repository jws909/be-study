package be_study.inter.inter03;

public class InterfaceMain {

	public static void main(String[] args) {
		
		IPhone p1 = new IPhone();
		GalaxyPhone p2 = new GalaxyPhone();
		LGPhone p3 = new LGPhone();
		
		Callable c1 = new IPhone();
		Callable c2 = new GalaxyPhone();
		Callable c3 = new LGPhone();
		
		Person p = new Person();
		p.callPhone = p1; //아이폰
		p.call("1234");   //사용법 동일 Callable
		
		p.callPhone = p2; //갤럭시폰
		p.call("1234");   //사용법 동일 Callable
		
		p.callPhone = p3; //LG폰
		p.call("1234");   //사용법 동일 Callable

		BluetoothSpeaker bs = new BluetoothSpeaker();
		
		Connectable cc = bs;
		cc = p2;
		
//		cc = p1; //IPhone 은 Connectable을 구현하고 있지 않음
		
		Connectable cc1 = new BluetoothSpeaker();
		Connectable cc2 = new GalaxyPhone();
	}

}
