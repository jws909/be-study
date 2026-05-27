package be_study.quiz.quiz30;

public class Computer {
	
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
	String os;
	int memSize;
	
	Computer(int osIdx, int memSize){
		os = OS_TYPE[osIdx];
		this.memSize = memSize;
	}
	
	public void print() {
		System.out.println("운영체제: "+ os + ", 메인메모리: "+ memSize);
	}
	
}
