package be_study.quiz.quiz34;

public class Fire {
	boolean isOnFire;	//불이 켜져있는지
	double celsius;		//세기 조절(온도)
	
	Fire(){
		isOnFire = false;
		celsius = 0;
	}
	
	public void turnOn(double power) { //세기만큼 온도 증가
		isOnFire = true;
		celsius += power;
	}
	
	public void turnOff() {	//불 끄기
		isOnFire = false;
		celsius = 0;
	}
}
