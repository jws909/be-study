package be_study.quiz.quiz38.v1;

//base code
public class Marine extends Unit { // 보병
	
	@Override
	public void move(int x, int y) { //지정된 위치로 걸어서 이동
		super.move(x, y);
		System.out.println(x +", "+ y + " 위치로 걸어서 이동하였습니다.");
	}
	public void stimPack() {
		System.out.println("스팀팩 사용");
	}
}