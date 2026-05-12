package be_study.iter;

public class Iter01 {

	public static void main(String[] args) {
	
		// 반복문 Iteration
		
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		
		
		// for문 반복문
		
		/*
		
		for(초기화식; 조건식; 증감식){
			실행문;
		}
		
		*/

		for(int i=1; i<=3; i++) {
			System.out.println("재밌다");
		}
		
		System.out.println("for문 끝");
		
		int i=0;
		
		for(i=1; i<3; i++) {
			System.out.println("피곤하다");
		}
		
		for(i=35; i<45; ++i) {	//10번 반복
			System.out.println("for 실행문"+(i-34));
		}
		
		System.out.println(i);	//45
		
		//----------------------------------------------
		
		//5회 반복
		for(i=10; i<15; i++) {
			System.out.println("다이어트 "+ (i-9) +"일차");
		}
		
		System.out.println("--------------------------------------------");
		
		
		// 숫자의 총합
		
		int number = 1 + 2 + 3 + 4 + 5; // + 6 7 8 ....
		
		int sum = 0;
		for(int n=1; n<=10; n++) {
			sum += n;
		}
		System.out.println("총 누적 합: "+ sum);
		
		
		// 누적합
		// 10 20 30 40 50 .... 100의 합
		sum = 0;
		for(i=1; i<=10; i++) {
			sum += i*10;
		}
		System.out.println("총 누적 합: "+ sum);
		//값의 변화 자체를 변경
		sum = 0;
		for(i=10; i<=100; i+=10) {
			sum += i;
		}
		System.out.println("총 누적 합: "+ sum);
		
		for(int k=2; k<20; k*=2) {}
		// k: 2 4 8 16 | 32
		
		for(int k=400; k>100; k-=50) {}
		// k: 400 350 300 250 200 150 | 100
		
		for(int k=100; k>=90; k--) {}
		// k: 100 99 98 97 96 95 94 93 92 91 90 | 89
	}

}
