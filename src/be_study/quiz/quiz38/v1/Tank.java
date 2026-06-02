package be_study.quiz.quiz38.v1;

public class Tank extends Unit {
	
	@Override
	public void move(int x, int y) {
		super.move(x, y);
		System.out.println(x +", "+ y + " 위치로 바퀴로 이동하였습니다.");
	}
	
	public void changeMode() {
		System.out.println("공격모드를 변환하였습니다.");
	}
}
