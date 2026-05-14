package be_study.quiz;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		
		String[] menuList = {"입력 메뉴입니다.", 
							 "수정 메뉴입니다.", 
							 "조회 메뉴입니다.", 
							 "삭제 메뉴입니다.",
							 "프로그램이 종료됩니다."};
		
		int menuNum = 0;
		while(true) {
			while(true) {
				System.out.print("   메뉴번호를 입력하세요 : ");
				menuNum = scanner.nextInt();
				if(menuNum<1 || menuNum>5)
					System.out.println("   잘못 입력하셨습니다.");
				else
					break;
			}
			
			System.out.println("   "+ menuList[menuNum-1]);
			if(menuNum == 5) break;
		}

	}

}
