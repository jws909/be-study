package be_study.inherit.inherit03;

public class BluetoothMike extends Mike {
	
	//블루투스 마이크는 마이크다
	boolean isConnected; //연결여부 상태
	int battery; //배터리 잔량
	
	//별도의 각자 필요한 메소드 확장
	public void connect() {
		//블루투스 연결합니다~
	}
	
	//기존에 있던 메소드 활용 -> check();
	
	//기존 메소드 업그레이드 (재정의)
//	private void volumeUp() {} // 메소드 재정의는 접근제한자 범위를 줄이면서 재정의 불가능
							   // default -> public 이렇게는 가능
	
	//Overriding
	public void volumeUp() {
		System.out.println("BluetoothMike volumeUp() 재정의");
	}
	
	//Overloading
	public void volumeUp(int v) {
		System.out.println(v +"만큼 볼륨 증가 BluetoothMike volumeUp(int v) 오버로딩");
	}
	
	//부모클래스 final 메소드 재정의 불가
//	public void noMethod() {}
}
