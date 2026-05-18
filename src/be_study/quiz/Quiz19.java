package be_study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
	
		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
		//규칙을 찾아서 중첩된 반복문을 활용하여 값을 저장하고
		//아래와 같이 4*4 형태로 출력하시오.

//		1.
//		1   2   3   4
//		5   6   7   8
//		9   10 11 12
//		13 14 15 16
		
		int[][] num44 = new int[4][4];
		
		//값입력
		//16까지 순서대로 입력
		for(int i=0; i<16; i++)
			num44[i/4][i%4] = i+1;
		
		//출력
		for(int i=0; i<num44.length; i++) {
			for(int j=0; j<num44[i].length; j++)
				System.out.printf("%2d ", num44[i][j]);
			System.out.println();
		}
		System.out.println("-------------");
		
//		2.
//		1 5  9  13
//		2 6 10 14
//		3 7 11 15
//		4 8 12 16
		
		//값입력
		//1번 행 열을 반대로
		for(int i=0; i<16; i++)
			num44[i%4][i/4] = i+1;
		
		//출력
		for(int i=0; i<num44.length; i++) {
			for(int j=0; j<num44[i].length; j++)
				System.out.printf("%2d ", num44[i][j]);
			System.out.println();
		}
		System.out.println("-------------");
				
//		3.
//		16 15 14 13
//		12 11 10 9
//		8   7   6  5
//		4   3   2  1
			
		//값입력
		//16부터 거꾸로 입력
		for(int i=0; i<16; i++)
			num44[i/4][i%4] = 16-i;
		
		//출력
		for(int i=0; i<num44.length; i++) {
			for(int j=0; j<num44[i].length; j++)
				System.out.printf("%2d ", num44[i][j]);
			System.out.println();
		}
		System.out.println("-------------");
			
//		4.
//		16 12 8 4
//		15 11 7 3
//		14 10 6 2
//		13 9  5  1
			
		//값입력
		//3번 행 열을 반대로
		for(int i=0; i<16; i++)
			num44[i%4][i/4] = 16-i;
		
		//출력
		for(int i=0; i<num44.length; i++) {
			for(int j=0; j<num44[i].length; j++)
				System.out.printf("%2d ", num44[i][j]);
			System.out.println();
		}
		System.out.println("-------------");

	}

}
