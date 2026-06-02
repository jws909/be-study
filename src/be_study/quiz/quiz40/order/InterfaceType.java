package be_study.quiz.quiz40.order;

//basecode
public class InterfaceType {
	public static void main(String[] args) {
		// 객체 생성
		Food f = new Food("족발", 19800);
		Electronics e = new Electronics("에어팟", 199000);
		Clothing c = new Clothing("셔츠", 49900);
		Orderable[] orderList = {f, e, c};
		// 총합 계산
		int totalPrice = 0;
		for(Orderable order : orderList)
			totalPrice += order.discountedPrice();
		// 결과 출력
		System.out.println("총합: "+ totalPrice +"원");
	}
}

class Food implements Orderable {
	private String name;
	private int price;

	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 1. 오버라이딩을 통해, 음식 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		int discountedPrice = (int)(price * 0.9);
		return discountedPrice;
	}
}

class Electronics implements Orderable {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 2. 오버라이딩을 통해, 전자기기 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		int discountedPrice = (int)(price * 0.8);
		return discountedPrice;
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	/* 3. 오버라이딩을 통해, 의류 할인율을 적용하세요. */
	@Override
	public int discountedPrice() {
		int discountedPrice = (int)(price * 0.7);
		return discountedPrice;
	}
}