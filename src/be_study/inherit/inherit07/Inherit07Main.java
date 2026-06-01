package be_study.inherit.inherit07;

public class Inherit07Main {

	public static void main(String[] args) {
		
		//Object 객체
		
		Driver d1 = new Driver();
		Taxi t1 = new Taxi();
		Bus b1 = new Bus();
		
		System.out.println(d1.toString());
		System.out.println(t1.toString());
		System.out.println(b1.toString());
		
		t1.run();
		b1.run();
		
//		System.out.println(b1.필드변수);
//		System.out.println(b1.메소드());
		System.out.println(b1);
		//객체 변수 자체를 출력하겠다. -> toString()
		
		d1.driveBus(b1);
		d1.driveTaxi(t1);
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Bus();
		Vehicle v3 = new Taxi();
		Vehicle v4 = t1;
		
		d1.drive(v1);
		d1.drive(v2);
		d1.drive(v3);
		d1.drive(v4);
		
		System.out.println("Vehicle 타입 매개변수");
		System.out.println("Vehicle + 상속받은 자식객체 다 전달 가능");
		
		Taxi t2 = new Taxi();
		Bus b2 = new Bus();
		d1.driveBus(b2);
		d1.driveTaxi(t2);
		
		d1.drive(b2);
		d1.drive(t2);
		
		Taxi t3 = takeTaxi();
		Bus b3 = takeBus();
		Vehicle v11 = takeTaxi();
		Vehicle v12 = takeBus();
		
		Vehicle v13 = takeBus2();
//		Bus b4 = takeBus2(); //불가능
		
		Vehicle v = new Bus();
		Bus b = (Bus)v;
//		Bus b4 = (Bus)takeBus2();
		
		if(v13 instanceof Bus) {
			Bus b4 = (Bus)takeBus2();
			b4.run();
		}
		
	}
	
	public static Taxi takeTaxi() {	// Taxi t = new Taxi();
		return new Taxi();
	}
	
	public static Bus takeBus() { // Bus b = new Bus();
		return new Bus();
	}

	public static Vehicle takeBus2() { // Vehicle v = new Bus();
		return new Bus();
		//return new Taxi();
	}
}
