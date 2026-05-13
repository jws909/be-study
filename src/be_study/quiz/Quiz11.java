package be_study.quiz;

public class Quiz11 {

	public static void main(String[] args) {
		
		System.out.println("-----반복문 1개-----");
		//1)반복문 1개 12345 5번반복
		for(int i=0; i<5; i++) {
			System.out.println(12345);
		}
		
		System.out.println("------------------");
		//2)반복문 1개 11111 ~ 55555
		for(int i=1; i<=5; i++) {
			System.out.println(i*11111);
		}
		
		
		System.out.println("-----반복문 2개-----");
		//1)반복문 2개 12345 5번반복
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		//2)반복문 2개 11111 ~ 55555
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
