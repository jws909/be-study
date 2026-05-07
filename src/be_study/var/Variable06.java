package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		
		// 키보드로부터 입력 받기 Scanner
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = 10;
		
		// 기본타입 값이 같은가? 비교하는 연산자 ==
		// == 비교 -> 결과 -> 논리형 (true/false)
		
		boolean b1 = num1 == num2;	//(true/false)
		System.out.println(b1);
		
		scanner.nextLine(); // \n 청소용
		
		String str1 = scanner.nextLine();
		String str2 = "커피";
		System.out.println(str1 +"\t"+ str2);
		System.out.println(str1 == str2);	// 비교 안됨
		
		// 문자열(String) 값 비교할떄는 == 으로 인식안됨. -> .equals() 기능을 사용
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str1));
		
		System.out.println(str1 == "커피");
		System.out.println(str1.equals("커피"));
	}

}
