package be_study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 타입 변환
		
		// int double
		
		int i1 = 30;
		int i2 = i1;	// 정수형 = 정수형
//		int i3 = 3.11;	// 정수형 = 실수형값		불가능
		
		double d1 = 3.11;
		double d2 = d1;	//실수형 = 실수형
		
		double d3 = 40;		//실수형 = 정수형값		double = int	40 -> 40.0
		double d4 = 40.0;	//실수형 = 실수형값
		
		System.out.println(i1);
		System.out.println(d3);
		
		double d5 = i1; //실수형 = 정수형	int -> double	자동타입변환
//										30	-> 30.0
		System.out.println(d5);
		
		char c1 = 'A';
		int i3 = c1;	// int = char	'A' -> 65
		System.out.println(c1);
		System.out.println(i3);
		
		char c2 = (char)i3;  // char = int	큰 타입 -> 작은 타입
		System.out.println(c2);
		
		double dd1 = 12.64;
		int ii1 = (int)dd1;		//정수형 = 실수형	12.64 -> 12
		System.out.println(ii1);
		
		
		//java 정수 -> int
		//java 실수 -> double
		
		float f1 = (float)4.45;	//	float = double
		float f2 = 4.45f;
		double dd2 = f1; //	double = float	자동타입변환
		
		
		//연산에서 타입변환
		int i10 = 3;
		double d10 = 5;
		
//		int i11 = i10 + d10;	// int + double -> double
		//		  3	+ 5.0 = 8.0
		double d11 = i10 + d10;
		
		
		int i12 = 10;
		double d12 = 5.5;
		
		int i13 = (int)(i12 + d12); // int + double -> double
		//		  		10 + 5.5 -> 15.5 -> (int)15
		
		i13 = i12 + (int)d12;
		
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int result = (int)dv1 + (int)dv2;	// 5 + 6 = 11
		System.out.println(result);
		result = (int)(dv1 + dv2);		// (int)12.1 = 12
		System.out.println(result);
		
		
		int x = 1;
		int y = 2;
		double result2 = x / y;
		
		System.out.println(result2);	//0.0
		
		result2 = (double)x / y;
		System.out.println(result2);	//0.5
		
	}

}
