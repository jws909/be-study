package be_study.quiz.quiz42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck implements Usable {
	public String truckName;
	public List<Food> foodList;
	boolean isOpened;
	
	public FoodTruck(String truckName) {
		this.truckName = truckName;
		foodList = new ArrayList<>();
		isOpened = false;
	}

	//메뉴 추가
	public void addMenu(Food food) {
		foodList.add(food);
	}
	public void addMenu(String name, int price, int stock) {
		foodList.add(new Food(name, price, stock));
	}
	
	public void startSales() { //영업시작
		this.isOpened = true;
		System.out.println("======["+ this.truckName +" 푸드트럭 영업시작]======");
		while(isOpened){
			System.out.println("***[기능선택]***");
			System.out.println("1.메뉴보기 2.주문하기 3.재고추가 4.마감하기");
			int selectedMenu = this.selectNum(1, 4);
			
			switch(selectedMenu) {
			case 1:
				this.showMenu();
				break;
			case 2:
				this.order();
				break;
			case 3:
				this.manageStock();
				break;
			case 4:
				this.close();
				isOpened = false;
			}
		}
	}
	
	//숫자를 범위 안에서만 입력하도록 하는 메소드
	public int checkBoundary(int start, int end) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int num = scanner.nextInt();
			if(num > end || num < start)
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
			else
				return num;
		}
	}
	
	//선택한 번호를 return하는 메소드(start~end사이에 있는 값만 리턴)
	public int selectNum(int start, int end) {
		Scanner scanner = new Scanner(System.in);

		System.out.print(">>> 입력 : ");
			
		int selectedNum = checkBoundary(start, end);
		
		return selectedNum;
	}
	
	@Override
	public void showMenu() {
		System.out.println("-------[메뉴]-------");
		for(int i=0; i<foodList.size(); i++)
			System.out.printf("[%d] %s\n", i+1, foodList.get(i));
	}

	@Override
	public void order() {
		System.out.println("***[메뉴선택]***");
		System.out.println("메뉴 번호를 입력해주세요.");
		int selectedMenu = selectNum(1, foodList.size());
		int index = selectedMenu - 1;
		System.out.println("주문할 개수를 입력해주세요.");
		int foodNum = selectNum(1, foodList.get(index).stock);
		
		foodList.get(index).sold(foodNum);
	}

	//한번에 10개까지만 추가가능
	@Override
	public void manageStock() {
		System.out.println("재고 조정할 메뉴 번호를 입력해주세요.");
		int selectedMenu = selectNum(1, foodList.size());
		int index = selectedMenu - 1;
		System.out.println("재고 조정할 개수를 입력해주세요. (최대 10개)");
		int addNum = selectNum(1, 10);
		
		foodList.get(index).addStock(addNum);
		
		System.out.println("[재고 조정 적용]");
		System.out.println(foodList.get(index));
	}

	@Override
	public void close() {
		int totalSales = 0;
		int totalLoss = 0;
		
		for(Food f : foodList) {
			totalSales += f.getSalesCost();
			totalLoss += f.getLoss();
		}
		int totalEarn = totalSales - totalLoss;
		System.out.println("=====[영업마감]=====");
		System.out.println("----[마감정보]----");
		System.out.println(">>> 총매출액 : "+ totalSales);
		System.out.println(">>> 원가차감 : "+ totalLoss);
		System.out.println(">>> 최종수익 : "+ totalEarn);
	}
}
