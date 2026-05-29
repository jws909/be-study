package be_study.inherit.inherit05.v4;

import java.util.ArrayList;
import java.util.List;

public class MainV4 {

	public static void main(String[] args) {
		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();	//부모타입 = 자식객체
		
		//강제타입변환
		DustCleaner dc1 = (DustCleaner)c2;
//		DustCleaner dc2 = (DustCleaner)c1; //java.lang.ClassCastException
		
		Cleaner c3 = new FloorCleaner();
		Cleaner c4 = new WindowCleaner();
		
		FloorCleaner fc = (FloorCleaner)c3;
		WindowCleaner wc = (WindowCleaner)c4;
		
		
		List<Cleaner> list = new ArrayList<>();
		
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		
		//사용법이 같음
		for(Cleaner c : list) {
			c.doClean();
			// 실행시 각자 재정의된 기능을 실행
			
			//본체에 들어있는게 어떤 클래스의 인스턴스냐? 그 클래스 출신이냐
			if(c instanceof DustCleaner)
				((DustCleaner) c).arrangeItem();
		}
		
		// 동일한 사용법으로 다양한 실행결과를 도출
		// 다형성
	}

}
