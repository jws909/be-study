package be_study.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
		System.out.println("====for(1,2,3,4)====");
		//1) i가 0~10으로 11번 반복
		for(int i=0; i<11; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		//2) i가 1~9로 9번 반복
		for(int i=1; i<10; i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		//3) i가 10 ~ 100 으로 10번 반복
		for(int i=10; i<=100; i+=10) {
			System.out.print(i +" ");
		}
		System.out.println();

		//4) i가 25 50 75 100 해서 4번 반복
		for(int i=25; i<=100; i+=25) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		System.out.println("====while(5,6,7,8,9)====");
		int i=0;
		//5) i가 50 ~ 55로 6번 반복
		i=50;
		while(i<56) {
			System.out.print(i +" ");
			i++;
		}
		System.out.println();
		//6) i가 10 ~ 1로 10번 반복
		i=10;
		while(i>0) {
			System.out.print(i +" ");
			i--;
		}
		System.out.println();
		//7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		i=30;
		while(i>=0) {
			System.out.print(i +" ");
			i-=5;
		}
		System.out.println();
		//8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		i=30;
		while(i>0) {
			System.out.print(i +" ");
			i-=5;
		}
		System.out.println();
		//9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		i=25;
		while(i>=0) {
			System.out.print(i +" ");
			i-=5;
		}
		System.out.println();
		
		
		System.out.println("====while(1,2,3,4)====");
		//1) i가 0~10으로 11번 반복
		i=0;
		while(i<11) {
			System.out.print(i +" ");
			i++;
		}
		System.out.println();
		
		//2) i가 1~9로 9번 반복
		i=1;
		while(i<10) {
			System.out.print(i +" ");
			i++;
		}
		System.out.println();
		
		//3) i가 10 ~ 100 으로 10번 반복
		i=10;
		while(i<=100) {
			System.out.print(i +" ");
			i+=10;
		}
		System.out.println();

		//4) i가 25 50 75 100 해서 4번 반복
		i=25;
		while(i<=100) {
			System.out.print(i +" ");
			i+=25;
		}
		System.out.println();
		
		System.out.println("====for(5,6,7,8,9)====");
		//5) i가 50 ~ 55로 6번 반복
		for(int j=50; j<56; j++) {
			System.out.print(j +" ");
		}
		System.out.println();
		//6) i가 10 ~ 1로 10번 반복
		for(int j=10; j>0; j--) {
			System.out.print(j +" ");
		}
		System.out.println();
		//7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		for(int j=30; j>=0; j-=5) {
			System.out.print(j +" ");
		}
		System.out.println();
		//8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		for(int j=30; j>0; j-=5) {
			System.out.print(j +" ");
		}
		System.out.println();
		//9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		for(int j=25; j>=0; j-=5) {
			System.out.print(j +" ");
		}
		System.out.println();
	}

}
