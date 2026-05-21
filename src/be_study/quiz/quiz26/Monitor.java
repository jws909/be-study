package be_study.quiz.quiz26;

public class Monitor {
//	1. Monitor 클래스 생성 -> 클래스 생성
//	2. 속성 ( 제조회사, 인치, 가격, 색상, 최대해상도x, 최대해상도y ) -> 필드변수 생성
	String company;
	int size;
	int price;
	String color;
	int x;
	int y;
//	3. 모니터는 만들때 필수 값이 필요합니다. -> 생성자 (매개변수)
//	(제조회사, 인치, 가격)
	Monitor(String company, int size, int price){
		this.company = company;
		this.size = size;
		this.price = price;
	}
//	4. 색상과 해상도는 옵션으로 선택할 수 있어서, 이 후에 별도로 입력 받겠습니다. -> set메소드
//	setXY, setColor 값을 저장 할 수 있도록.
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void setColor(String color) {
		this.color = color;
	}
//	5. 모니터클래스에는 전원을 키는 기능이 있습니다. -> 전원켜기 메소드
//	전원이 켜진 후 "전원이 켜졌습니다"를 출력해줍니다.
	void powerOn() {
		System.out.println("전원이 켜졌습니다");
	}
//	6. 모니터 클래스에는 가격인상 기능이 있습니다. -> return금액 가격인상 메소드
//	입력된 만큼의 금액이 인상되고 인상된 후 최종 금액을 반환합니다.
	int increasePrice(int addPrice) {
		price += addPrice;
		return price;
	}

//	9. 모니터 클래스에는 자신의 정보를 정렬하여 출력해주는 기능이 있습니다. -> 출력기능 메소드
	void showSpec() {
		System.out.printf("%s제품 %d인치 %dX%d ", company, size, x, y);
		System.out.println(color +" "+ price +"원");
	}
}
