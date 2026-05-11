package be_study.quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		System.out.println("1.");
		System.out.print("삼각형의 밑변 입력: ");
		double width = scanner.nextDouble();
		System.out.print("삼각형의 높이 입력: ");
		double height = scanner.nextDouble();
		System.out.println("삼각형의 넗이: "+ (width * height / 2));

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
		System.out.println("2.");
		System.out.print("사다리꼴의 윗변 입력: ");
		double top = scanner.nextDouble();
		System.out.print("사다리꼴의 밑변 입력: ");
		double bottom = scanner.nextDouble();
		System.out.print("사다리꼴의 높이 입력: ");
		height = scanner.nextDouble();
		System.out.println("사다리꼴의 넓이: "+ ((top+bottom) * height / 2));
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		System.out.println("3.");
		System.out.println("우리반은 24명입니다. 과자가 100개 있습니다.");
		System.out.printf("과자는 한명당 %d개씩받고 %d개가 남습니다.\n", 100 / 24, 100 % 24);
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		System.out.println("4.");
		int num = scanner.nextInt();
		
		System.out.println("백의자리 : "+ num/100);
		System.out.println("십의자리 : "+ num%100/10);
		System.out.println("일의자리 : "+ num%10);
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		System.out.println("5.");
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x="+x+ " y="+y);

	}

}
