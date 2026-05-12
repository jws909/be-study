package be_study.iter;

public class Iter03 {

	public static void main(String[] args) {
	
		//반복문 중첩
		
		// 삼항 ? (참) : (거짓)
		// 삼항 ? (참) : ( 삼항 ? (참) : (거짓))
		
		// if()
		// if() {
		// 	  if()
		// }
		
		// i: 1 2 3 4 5 | 6
		for(int i=1; i<=5; i++) {
			
			//실행문
			System.out.println("for i 실행문 : "+ i);
			
			// j: 1 2 3 | 4
			for(int j=1; j<=3; j++) {
				System.out.println("내부 for j 실행문 : "+ j);
			}
			
			System.out.println("===for i 실행문 한싸이클 종료===");
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				for(int k=1; k<=2; k++) {
					//실행문... i j k 변수 활용
					
					/*
					 i:1  j:1  k:1
					 i:1  j:1  k:2
					 i:1  j:2  k:1
					 i:1  j:2  k:2
					 i:1  j:3  k:1
					 i:1  j:3  k:2
					 
					 i:2  j:1  k:1
					 i:2  j:1  k:2
					 i:2  j:2  k:1
					 i:2  j:2  k:2
					 i:2  j:3  k:1
					 i:2  j:3  k:2
					 
					 ...
					 ...
					 
					 i:5  j:1  k:1
					 i:5  j:1  k:2
					 i:5  j:2  k:1
					 i:5  j:2  k:2
					 i:5  j:3  k:1
					 i:5  j:3  k:2
					*/
				}
			}
		}
		
		
		// 방 3개 청소
		// 		3번 쓸기
		//		2번 닦기
		//		1번 쓰레기정리
		
		// for 방3
		//		for 3번쓸기
		//		for 2번닦기
		//		쓰레기정리
		
		for(int i=1; i<=3; i++) {	//방 3개 i: 1 2 3
			System.out.println(i + "번 방 청소");
			
			//3번 쓸기
			for(int j=1; j<=3; j++) {	// j: 1 2 3 (3번 쓸기)
				System.out.print("쓸기 ");
			}
			System.out.println();
			
			int k=1;
			while(k<=2) {	// k: 1 2 (2번 닦기)
				System.out.print("닦기 ");
				k++;
			}
			System.out.println();
			
			System.out.println("쓰레기정리");
		}
	}

}
