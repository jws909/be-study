package be_study.quiz.quiz38.v2;

public class Dropship extends Unit {
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x +", "+ y + " 위치로 날아서 이동하였습니다.");
	}
	
	public void load() {
		System.out.println("유닛을 태웠습니다.");
	}
	
	public void unload() {
		System.out.println("유닛을 내렸습니다.");
	}
}
