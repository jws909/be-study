package be_study.exp;

import java.util.Scanner;

public class Exp01 {

	public static void main(String[] args) {
		
		
		//예외처리
		
		TempCls tc1 = null;	// new TempCls();
		
		if(tc1 != null) {
			tc1.t = 50;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		try { //예외 발생 가능성이 있는 시도해볼 코드 작성
			
			System.out.print("숫자 입력하세요 : "); //런타임 예외
			int input = scanner.nextInt(); //실행해서 입력받는 순간 값을 확인해봐야 예외여부를 판단가능함
			System.out.println("당신이 입력한 숫자는 : " + input);
			
		} catch(Exception e) { //예외 발생시 대응할 부분 코드 영역
			System.out.println("숫자로만 입력하세요");
		}
		
		scanner.nextLine();
		
		String s = scanner.nextLine();
		
		try {
			int n = Integer.parseInt(s); //s 를 숫자로 변환 (s가 숫자형이 아니면 예외 발생)
		} catch (Exception e) {
			System.out.println("숫자로 입력하세요");
		}
		
		int n = 0;
		try {
			System.out.println("parseInt 실행전");
			n = Integer.parseInt(s);
			System.out.println("parseInt 실행 후----");
		} catch(Exception e) {
			System.out.println("문제발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("여기는 finally 부분.");
			System.out.println("예외 발생 여부와 상관없이 마지막에 꼭 실행됨.");
		}
		
		//Exception
//		int q;
//		System.out.println(q);
		
		//Class.forName("java.lang.String");	그냥은 사용하지 못하고

		
		try {
			Class.forName("java.lang.String");	//try catch 감싸야만한다 (컴파일 단계)
			Class.forName("java.lang.String123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("==========end==========");
	}

}


class TempCls {
	int t;
}