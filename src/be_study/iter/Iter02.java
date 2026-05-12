package be_study.iter;

public class Iter02 {

	public static void main(String[] args) {
		
		/*
		 * for(초기화; 조건식; 증감식) {
		 * 		실행문;
		 * }
		 * 
		 * while(조건식) {
		 * 		실행문;
		 * }
		 * 
		 * 초기화;
		 * while(조건식){
		 * 		실행문;
		 * 		증감식;
		 * }
		 * 
		 */
		
		
		// 단순 5번 반복
		for(int i=0; i<5; i++) {
			System.out.println("for문 반복");
		}
		
		int i=0;
		while(i<5) {
			System.out.println("while문 반복");
			i++;
		}
		
		
		//무한 반복 무한루프
		
		/*
		while(true) {
			System.out.println("무한 반복");
		}
		*/
		
		i = 10;
		while(true) {
			System.out.println("while(true) : "+ i);
			
			if(i == 20) break;
			i++;
		}
		
		
		i = 30;
		do {
			System.out.println("조건 상관없이 일단 먼저 한번 실행 do while");
		} while(i<10);
		
		while(i<10) {
			System.out.println("그냥 while문");
		}
		
		
		System.out.println("-------------------------------");
		
		for(i=1; i<=10; i++) {
			
			if(i==5) continue; //이번 턴은 패스하고 다음 진행으로 넘어가라

			System.out.print(i +" ");
			
			if(i==8) break;  //그만 멈추고 나가라
		}
		System.out.println();
		
		i = 1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.print(i +" ");
			if(i==8) break;
			i++;
		}
		System.out.println();
	}

}
