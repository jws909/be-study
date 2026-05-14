package be_study.quiz;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90
		int[] numArr = new int[5];
		for(int i=0; i<numArr.length; i++)
			numArr[i] = scanner.nextInt();
		System.out.println("몇번째 수인가요? ");
		int index = scanner.nextInt();
		System.out.println(numArr[index-1]);
		
		
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		numArr = new int[5];
		for(int i=0; i<numArr.length; i++)
			numArr[i] = scanner.nextInt();
		for(int i=numArr.length-1; i>=0; i--)
			System.out.print(numArr[i] +" ");
		System.out.println();

//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  10 11 12
//		13 14 15 16
		int[][] num44 = new int[4][4];
		
		for(int i=0; i<16; i++) {
			int x = i/4;
			int y = i%4;
			num44[x][y] = i+1;
		}
		
		for(int i=0; i<num44.length; i++) {
			for(int j=0; j<num44[i].length; j++) {
				System.out.print(num44[i][j] +" ");
			}
			System.out.println();
		}

	}

}
