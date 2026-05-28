package be_study.inherit.inherit02;

import be_study.inherit.inherit01.Parent;

public class HideChild extends Parent {
	
	HideChild(){
		super(0);
	}
	
	HideChild(int money){
		super(money);
	}
	
	public void showMoney() {
		//protected int money;
		// 같은 패키지 접근 가능 + 다른 패키지여도 자식 클래스면 접근 가능
		System.out.println(money); //접근가능
	}

}
