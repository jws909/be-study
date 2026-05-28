package be_study.quiz.quiz34;

import java.util.ArrayList;

public class Kitchen {
	int area;			//공간 넓이
	String wallColor;	//벽지색
	String height;		//층고
	
	Refrigerator refrige; //냉장고
	Gasrange gas;		//가스레인지
	TrashBin[] tBin;	//쓰레기통 객체 배열
	ArrayList<Cup> cup;	//컵 객체 리스트
	
	//생성자
	
	//메소드
	
	public void cleanAllandOffAll() {
		for(TrashBin t : tBin) {
			t.openBin();
			t.clearBin();
			t.closeBin();
		}
		gas.turnOffAllGas();
	}
}
