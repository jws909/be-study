package be_study.quiz;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)
		System.out.println("2x + 4y = 10");
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5; y++) {
				if(x + 2*y == 5) {
					System.out.println("x: "+ x + ", y: "+ y);
					break;
				}
			}
		}
		
//		2.
//		정수 2개를 입력 받아서,
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수 입력(num1 num2): ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if(num1 > num2)
			System.out.println(num1 +" - "+ num2 +" = "+ (num1-num2));
		else
			System.out.println(num2 +" - "+ num1 +" = "+ (num2-num1));
		
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		
		System.out.print("4개의 윷 입력: ");
		int y1 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int y3 = scanner.nextInt();
		int y4 = scanner.nextInt();
		int result = y1 + y2 + y3 + y4;
		
		switch(result) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		}
		
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
		System.out.print("별 개수: ");
		int star = scanner.nextInt();
		
		for(int i=0; i<star; i++)
			System.out.print("*");
		
	}

}
