package be_study.quiz.quiz38.v1;

public class UnitMain {

	public static void main(String[] args) {
		
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		
		m.x = 0;
		m.y = 0;
		m.move(2, 3);
		m.stop();
		m.stimPack();
		
		t.x = 0;
		t.y = 0;
		t.move(5, 9);
		t.stop();
		t.changeMode();
		
		d.x = 0;
		d.y = 0;
		d.move(1, 2);
		d.stop();
		d.load();
		d.unload();

	}

}
