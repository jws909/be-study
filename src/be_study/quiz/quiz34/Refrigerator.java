package be_study.quiz.quiz34;

public class Refrigerator {
	String brand;		//브랜드명
	double volume;		//내부 용량
	boolean isPowerOn;	//전원 ON/OFF
	double celsius;		//온도(섭씨)
	int numberOfDoor;	//문의개수
	
	IceTray iceTray;	//냉동실에 있는 얼음트레이
	
	//온도조절	+200도 -500도 이렇게 할수없다
	//온도 조절이 가능한 범위 -20 ~ 10
	//					 -15 ~ 8
	double maxCelsius;	//최고 온도
	double minCelsius;	//최저 온도
	
	public void powerOn() {
		isPowerOn = true;
	}
	
	public void powerOff() {
		isPowerOn = false;
	}
	
	public void upTemperature() {
		celsius += 5;
	}
	
	public void downTemperature() {
		celsius -= 5;
	}
	
	public double upTemperature2() {
		this.upTemperature();
		return celsius;
	}
	
	public double downTemperature2() {
		this.downTemperature();
		return celsius;
	}
	
	public boolean upTemperature3() {
		this.upTemperature();
		if(celsius > maxCelsius) { //천장 도달하면 true
			celsius = maxCelsius;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean downTemperature3() {
		this.downTemperature();
		if(celsius < minCelsius) { //바닥 도달하면 true
			celsius = minCelsius;
			return true;
		} else {
			return false;
		}
	}
	
	//한개로 매개변수를 잘 넘겨
	void controlTemperature(boolean isUp) {
		if(isUp)
			this.upTemperature();
		else
			this.downTemperature();
	}
	
	void controlTemperature(int change) {
		//최대 최저 온도 필터 추가
		celsius += change;
	}
}
