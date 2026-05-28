package be_study.quiz.quiz34;

public class Gasrange {
	int numberOfFire;	//화구수
	String brand;		//브랜드명
	int price;			//가격
	Fire[] fireArr;		//화구 객체 배열
	
	//생성자
	Gasrange(int numberOfFire, String brand, int price){
		this.numberOfFire = numberOfFire;
		this.brand = brand;
		this.price = price;
		fireArr = new Fire[numberOfFire];
		for(int i=0; i<fireArr.length; i++)
			fireArr[i] = new Fire();
	}
	
	public void turnOnGasrange(int index, double power) { // index번 화구를 power만큼 켜기
		fireArr[index].turnOn(power);
	}
	
	public void turnOffGasrange(int index) {
		fireArr[index].turnOff();
	}
	
	public void turnOffAllGas() {
		for(Fire f : fireArr)
			f.turnOff();
	}
}
