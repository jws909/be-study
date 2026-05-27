package be_study.quiz.quiz33;

import java.util.ArrayList;

public class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	ArrayList<Menu> menus;
	// 생성자
	public Order(int i, ArrayList<Menu> list) {
		orderNum = i;
		menus = list;
	}
	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		int totalPrice = 0;
//		for(Menu m : menus) {
//			totalPrice += m.price;
//		}
		for(int i=0; i<menus.size(); i++) {
			totalPrice += menus.get(i).price;
		}	
		return totalPrice;
	}
}