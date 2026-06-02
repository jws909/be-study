package be_study.quiz.quiz38.v1;

public class Unit {
	int x, y; //현재위치
	
	public void move(int x, int y) { //지정된 위치로 이동
		this.x = x;
		this.y = y;
	}
	
	public void stop() { //현재 위치에 정지
		System.out.println(x +", "+ y + " 위치에 정지하였습니다.");
	}
}
