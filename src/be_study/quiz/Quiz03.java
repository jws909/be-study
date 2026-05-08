package be_study.quiz;

public class Quiz03 {

	public static void main(String[] args) {
//		1. 아래 1), 2) 에 맞게 풀이.
		System.out.println("1.-------");
		int x1 = 10;
		int y1 = 4;
		double result1;
		
//		1) 결과가 2가 나오도록 작성하세요
		System.out.print("1) ");
		result1 = x1/y1;
		System.out.println((int)result1);
		
//		2) 결과가 2.5가 나오도록 작성하세요
		System.out.print("2) ");
		result1 = (double)x1 / y1;
		System.out.println(result1);
	
		
//		2. 결과가 7.5가 나오도록 작성하세요
		System.out.println("2.-------");
		double a2 = 3.5;
		double b2 = 4.7;
		double result2 = a2 + (int)b2;
		System.out.println(result2);
	
//		3. 계산결과가 12가 나오도록 작성하세요
		System.out.println("3.-------");
		String a3 = "3.4";
		String b3 = "4";
		int result3 = (int)Double.parseDouble(a3) * Integer.parseInt(b3);
		System.out.println(result3);
	
//		----------------------------------------------------
	
//		4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
		System.out.println("4.-------");
		String a4 = "10";
		int b4 = 3;
		double c4 = 4.5;
		String result4 = a4 + (int)(b4 * c4);
		System.out.println(result4);
	
	
//		5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
		System.out.println("5.-------");
		int a5 = 4;
		double b5 = 3.4;
		String c5 = "6.8";
		String result5 = (int)(Double.parseDouble(c5)/b5)
						+String.valueOf(a5)
						+(int)(Double.parseDouble(c5)-b5);
		System.out.println(result5);
	
//		6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		System.out.println("6.-------");
		int x6 = 111;
		int y6 = 13;
		int result6;
	
//		1) 출력결과 : 7
		System.out.print("1) ");
		result6 = x6 % y6;
		System.out.println(result6);
//		2) 출력결과 : 8
		System.out.print("2) ");
		result6 = x6 / y6;
		System.out.println(result6);

	}

}
