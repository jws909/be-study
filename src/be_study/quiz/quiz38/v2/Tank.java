package be_study.quiz.quiz38.v2;

public class Tank extends Unit {
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x +", "+ y + " 위치로 바퀴로 이동하였습니다.");
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환하였습니다.");
	}
}
