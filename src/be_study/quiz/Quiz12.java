package be_study.quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도를 입력해주세요: ");
		int year = scanner.nextInt();
		boolean isLeapYear = false;		//기본값은 윤년X
		
		if(year%4 == 0) {							
			if(year%100 != 0) 
				isLeapYear = true;		//4로 나누어떨어지면서 100으로 나누어떨어지지않을때 윤년O
			else
				if(year%400 == 0) 
					isLeapYear = true;	//100으로 나누어떨어지지만 400으로 나누어떨어져서 윤년O
		}
		
		//-----------------------------------------------------
//		if(year%400 == 0) isLeapYear = true;
//		else if(year%100 == 0) isLeapYear = false;
//		else if(year%4 == 0) isLeapYear = true;
//		else isLeapYear = false;
		
		//-----------------------------------------------------
//		if(year%400 == 0 || (year%4 == 0 && year%100 != 0))
//			isLeapYear = true;
		
		
		if(isLeapYear) 
			System.out.println("윤년입니다.");
		else 
			System.out.println("윤년이 아닙니다.");

	}

}
