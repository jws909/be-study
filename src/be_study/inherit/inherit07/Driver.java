package be_study.inherit.inherit07;

//자바에 모든 클래스는 기본으로 extends Object
public class Driver {
	//운전자
	
	public void driveBus(Bus bus) {
		System.out.println("운전자 driveBus");
		bus.run();
	}
	
	public void driveTaxi(Taxi taxi) {
		System.out.println("운전자 driveTaxi");
		taxi.run();
	}
	
	//Vehicle vehicle
	//Vehicle vehicle = new Vehicle() Bus() Taxi()
	public void drive(Vehicle vehicle) {
		System.out.println("운전자 drive");
		vehicle.run();
	}
	
	
	// toString 메소드 선언(생성) 
	// -> 메소드 재정의(오버라이딩)
	public String toString() {
		return "이것은 Driver 입니다.";
	}
}
