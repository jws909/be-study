package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
		//규칙 찾아보기.

//		1 2 2 2 2
//		3 1 2 2 2
//		3 3 1 2 2
//		3 3 3 1 2
//		3 3 3 3 1
		
		int[][] numArr = new int[5][5];
		
		//입력
		// i: 0	 1	  2	     3	      4	       
		// j:    0    0 1    0 1 2    0 1 2 3 
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<i; j++) {
				numArr[i][j] = 3;
				numArr[j][i] = 2;
			}
			numArr[i][i] = 1;
		}
		
		//출력
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(numArr[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
