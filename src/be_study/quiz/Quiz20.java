package be_study.quiz;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int menuNum = 0; 			//선택한 메뉴
		int count = 0;	 			//주문한 수량
		int totalCost = 0;			//주문 총액
		String addMenu = "";		//추가주문 y/n
		boolean hasAddMenu = false;	//추가주문 여부
		
		
		String[] menu = {"아메리카노", "카페라떼", "바닐라라떼"};
		int[] price = {3500, 4100, 4300};
		int[] orderedCount = new int[3];
		
		while(true) {
			//메뉴 출력
			System.out.println("========= 메뉴 =========");
			for(int i=0; i<menu.length; i++)
				System.out.printf("%d. %s\t%d원\n", i+1, menu[i], price[i]);
			System.out.println("=======================");
			
			//메뉴와 주문수량 입력
			System.out.print("메뉴 선택 : ");
			menuNum = scanner.nextInt();
			System.out.print("수량 선택 : ");
			count = scanner.nextInt();
			scanner.nextLine();
			
			//추가주문 여부 y/n 이외의 문자 입력시 무한루프
			while(true) {
				System.out.print("추가 주문하시겠습니다?(y/n) : ");
				addMenu = scanner.nextLine();
				if(addMenu.equals("y") || addMenu.equals("Y")) {
					hasAddMenu = true;
					break;
				} else if(addMenu.equals("n") || addMenu.equals("N")) {
					hasAddMenu = false;
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.다시 입력해주세요.");
				}
			}
			orderedCount[menuNum-1] += count;	//선택한 메뉴의 주문수량 증가
			if(!hasAddMenu) break;	//추가주문없으면 break;
		}
		
		//주문한 메뉴, 메뉴별 총액, 주문 총액 출력
		System.out.println("=======================");
		for(int i=0; i<menu.length; i++) {
			if(orderedCount[i]!=0) {
				int cost = price[i] * orderedCount[i]; //각 메뉴별 총액
				System.out.printf("%s %d잔 : %d원\n", menu[i], orderedCount[i], cost);
				totalCost += cost;	//주문 총액
			}
		}
		System.out.println("=======================");
		System.out.println("총액 : "+ totalCost +"원");

	}

}
