package be_study.var;

public class Variable04 {

	public static void main(String[] args) {
		
		String s1 = "12";
		int n1 = 11;
		int n2 = 22;
		
		System.out.println(n1 + n2 + s1);	// 11 + 22 + "12"= "3312"
		
		System.out.println(n1 + s1 + n2);	// 11 + "12" + 22 = "111222"
		
		String s2 = "1234";
		int n3 = 16;
		System.out.println(s2 + n3);	//123416
		
		//String 문자열 -> 숫자 (정수/실수) (int/double)
		
		System.out.println(Integer.parseInt(s2) + n3);
		//								   1234 + 16 = 1250
		
		String s3 = "33.55";
//		int n4 = Integer.parseInt(s3);	// 실수형태의 문자열 -> int 변환 시도 -> 오류발생
		
		double d4 = Double.parseDouble(s3);
		System.out.println(d4 + 12.1);
		
		String s4 = "12a.12b";
//		Double.parseDouble(s4);	// 숫자형태가 아닌 문자열을 숫자형으로 변환 시도
		
		boolean b1 = true; 		//false; 참/거짓
		String s5 = "false";	//문자열 "false"
		
		boolean b2 = Boolean.parseBoolean(s5);
		System.out.println(b2);
		
		
		// 기본타입 -> 문자열 String
		
		String s10 = String.valueOf(true);
		String s11 = String.valueOf(123);
		String s12 = String.valueOf(133.568);
		
		System.out.println(s11 + s10 + s12);
		
		String s13 = 123 + ""; // 자동형변환을 이용한 변환
	}

}
