package be_study.oper;

public class Operator01 {

	public static void main(String[] args) {
		
		// 산술 + - * / %
		
		System.out.println(1+1);
		System.out.println(10-5);
		System.out.println(5*9);
		System.out.println(30/7);
		System.out.println((double)30/7);
		System.out.println(30/7.0);
		System.out.println(9%5);
		System.out.println(28%9);
		
		System.out.println("---------------------");
		// 부호 + -
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		System.out.println(-(-10));

		
		System.out.println("---------증감---------");
		// 증강	++ --	1증가	1감소		처리후 대상 변수의 값이 변경된 값으로 저장됨.
		// ++변수		:증가 먼저
		// 변수++		:증가 나중에
		
		int x = 10;
		System.out.println(x);	// 10
		System.out.println(++x);// 11
		System.out.println(x);	// 11
		
		System.out.println(1+x);// 12
		System.out.println(x);	// 11
		
		System.out.println(x++);// 11
		System.out.println(x);	// 12
		
		int y = 8;
		System.out.println(y--);// 8
		System.out.println(--y);// 6
		System.out.println(y);	// 6
		
		int z = 30;
		System.out.println(z+1);// 31
		System.out.println(z++);// 30
		System.out.println(z);	// 31
		
		z++;
		++z;
		z=z+1;
		z+=1;
		
		
		System.out.println("---------------------");
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w--;
		
		System.out.printf("%d %d %d %d \n", q, w, e, r);
		// q==2, w==2, e==12, r==6
		
		
		System.out.println("--------논리부정--------");
		// 논리부정 !	not
		// true	false
		
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);
		
		isHungry = false;
		isHungry = !isHungry;	//true
		
		// 문자열 결합 연산자 +
		System.out.println(133 + 3.345 + "문자");
		
		System.out.println("---------비교---------");
		System.out.println(1 == 2);	// false
		System.out.println(1 != 2);	// true
		System.out.println(3 < 5);	// true
		System.out.println(10 >= 9);// true
		System.out.println(4 > 4);	// false
		System.out.println(9 <= 1);	// false
		
		boolean b1 = (9 > 8); //true
		
		System.out.println("---------논리---------");
		//	AND &&		OR ||		NOT !		XOR ^
		boolean b2 = 10 > 6 && 10 > 5;
		//			   true && true	   -> true
		System.out.println(b2);
		
		boolean b3 = (5 != 1) || (10 < 4);
		//			    true  || false    -> true
		System.out.println(b3);
		
		boolean b4 = (2 >= 1) && !(3 < 4);
		//				true  && !true     -> false
		System.out.println(b4);
		
		
		// 대입
		int a = 30;
		a = 50;
		a += 30;	// a = a + 30;
		a -= 10;	// a = a - 10;
		a *= 3;		// a = a * 3;
		a /= 2;		// a = a / 2;
		a %= 4;		// a = a % 4;
		
		System.out.println("-------삼항 연산자-------");
		// 삼항 연산자
		
		//조건식 ? 참 : 거짓
		int point = 300;	//적립된 포인트
		
		// 포인트 0~200점 -> 사은품 생수
		// 200점 넘으면   -> 사은품 커피
		String eventItem = (point > 200) ? "커피" : "생수";
		System.out.println(eventItem);
		
		eventItem = point <= 200 ? "생수" : "커피";
		System.out.println(eventItem);
		
		System.out.println(point > 50 ? "단골" : "신규");
		
		/* 삼항연산자 중첨
		 * 
		 * (조건식) ? 참 : 거짓
		 * (조건식) ? 참 : ( (조건식) ? 참 : 거짓 )
		 * 
		 * (조건식) ? 참 : ( (조건식) ? ( (조건식) ? 참 : 거짓 ) : 거짓 )
		 */
		
		// 0~200 : 생수
		// 201~300 : 커피
		// 301~	: 맥주
		
		point = 150;
		eventItem = point > 300 ? "맥주" : point > 200 ? "커피" : "생수";
		System.out.println(eventItem);
		
		point = 220;
		eventItem = point > 300 ? "맥주" : point > 200 ? "커피" : "생수";
		System.out.println(eventItem);
		
		point = 550;
		eventItem = point > 300 ? "맥주" : point > 200 ? "커피" : "생수";
		System.out.println(eventItem);
		
		int num = 10;
		// 양수 음수
		System.out.println( num < 0 ? "음수" : "양수");
		
		// 음수 0 양수
		
		num = -5;
		System.out.println(  num == 0 ? "0" : ( num > 0 ? "양수" : "음수")    );
		System.out.println(  num != 0 ? ( num < 0 ? "음수" : "양수" ) : "0" );
		System.out.println(  num > 0 ? "양수" : ( num < 0 ? "음수" : "0" )  );
		System.out.println(  num >= 0 ? ( num == 0 ? "0" : "양수" ) : "음수" );
	}

}
