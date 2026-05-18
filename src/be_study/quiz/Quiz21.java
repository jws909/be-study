package be_study.quiz;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(i+j == 6) {
					System.out.println(i +", "+ j);
					break;
				}
			}
		}
		
//		2.
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
		int[] lotto = new int[6];
		
		for(int i=0; i<6; i++) {
			while(lotto[i] == 0) { //lotto[i]가 0이면 계속 반복
				//1~45 랜덤 번호
				lotto[i] = (int)(Math.random()*45) + 1;
				
				//중복체크해서 중복이면 lotto[i] = 0;
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						lotto[i] = 0;
						break;
					}
				}
			}
		}
		
		System.out.print("로또 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] +" ");
		}
		System.out.println();

//		3.
//		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
//		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
//		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
//		(*가능한 효율적인 구조를 생각해보세요)
//
//		ex)
//		1반 : 10 10 10 10 10
//		2반 : 20 20 20 20 20
//		3반 : 30 30 30 30 30
//
//		1반 평균 : 10
//		2반 평균 : 20
//		3반 평균 : 30
//		전체 평균 : 20
		
//		Scanner scanner = new Scanner(System.in);
//		int[][] score = new int[3][5];
//		double[] avg = new double[3];
//		double totalAvg = 0;
//		
//		//성적 입력
//		for(int i=0; i<score.length; i++) {
//			System.out.print((i+1) +"반 : ");
//			for(int j=0; j<score[i].length; j++) {
//				score[i][j]=scanner.nextInt();
//			}
//		}
//		
//		//평균 계산 및 출력
//		for(int i=0; i<score.length; i++) {
//			double sum = 0;
//			for(int j=0; j<score[i].length; j++) {
//				sum += score[i][j];
//			}
//			avg[i] = sum / score[i].length;
//			totalAvg += avg[i];
//			System.out.println((i+1) +"반 평균 : "+ avg[i]);
//		}
//		totalAvg /= avg.length;
		
//		//전체 평균 출력
//		System.out.println("전체 평균 : "+ totalAvg);
		
		
//		4. 주어진 2차원 배열보다 행과 열이 1씩 큰 배열을 선언하여,
//		각 행의 합과 각 열의 합, 마지막에는 전체의 합이 출력되도록 프로그램을 작성하시오.
//
//		ex)
//		int[][] arr =
//		{
//		{10, 20, 30},
//		{20, 30, 40},
//		{30, 40, 50}
//		};
//		이 주어지는 경우 최종 결과는
//		10 20 30 60
//		20 30 40 90
//		30 40 50 120
//		60 90 120 270
		
		int[][] arr = { {10, 20, 30},
						{20, 30, 40},
						{30, 40, 50} };
		
		// arr 보다 행과 열이 1씩 큰 배열을 선언(행과 열의 크기가 다르면 안됨)
		int[][] sumArr = new int[arr.length+1][arr[0].length+1];
		
		// 배열의 총합 sum
		int sum = 0;
		
		//arr의 값을 하나씩 탐색하는 중첩반복문
		for(int i=0; i<arr.length; i++) {	
			for(int j=0; j<arr[i].length; j++) {
				sumArr[i][j] = arr[i][j];				//arr 배열크기만큼은 그대로 복사
				sumArr[i][arr[i].length] += arr[i][j];	//arr의 i행의 합을 sumArr[i][4]에 저장
				sumArr[arr.length][j] += arr[i][j];		//arr의 j열의 합을 sumArr[4][j]에 저장
			}
			sum += sumArr[i][arr[i].length];	//총합
		}
		sumArr[arr.length][arr[0].length] = sum;		//총합을 sumArr[4][4]에 저장
		
		//sumArr 출력
		for(int i=0; i<sumArr.length; i++) {
			for(int j=0; j<sumArr[i].length; j++) {
				System.out.print(sumArr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
