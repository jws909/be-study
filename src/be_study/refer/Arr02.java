package be_study.refer;

public class Arr02 {

	public static void main(String[] args) {
		
		//배열 중첩
		//1차원 배열
		
		//다차원 배열
		//2차원 배열
		//3차원 배열
		//...
		
		// int			변수
		// int[]		1차원 배열
		// int[][]		2차원 배열
		// int[][][]	3차원 배열
		
		int n = 10;						// ㅁ
		int[] arr1 = new int[5];		// ㅁㅁㅁㅁㅁ
		
		int[][] arr2 = new int[3][5];
		
		/*
		     01234
		0 	ㅁㅁㅁㅁㅁ
		1 	ㅁㅁㅁㅁㅁ
		2 	ㅁㅁㅁㅁㅁ
		
		*/
		
		int[][] arr3 = new int[4][3];
		
		/*
			012
		0	ㅁㅁㅁ
		1	ㅁㅁㅁ
		2	ㅁㅁㅁ
		3	ㅁㅁㅁ
		
		*/
		
		int[] arr11 = {1, 2, 3, 4, 5, 6};
		
		int[][] arr22 = {{1, 2, 3}, {4, 5, 6}};
		//	1 2 3
		//	4 5 6
		
		int[][] arr33 = {{1, 2}, {3, 4}, {5, 6}};
		//	1 2
		//	3 4
		//	5 6
		
		System.out.println(arr22[0][2]);
		System.out.println(arr33[2][1]);
		
		int[][] arr4 = new int[2][3];
		// 2행 3열
		// ㅁㅁㅁ
		// ㅁㅁㅁ
		
		
		// 행마다 열개수를 다르게
		arr4 = new int[3][];
		arr4[0] = new int[2];
		arr4[1] = new int[3];
		arr4[2] = new int[4];
		// ㅁㅁ
		// ㅁㅁㅁ
		// ㅁㅁㅁㅁ
		
		// 출력
		for(int i=0; i<arr4.length; i++) { //행 인덱스 0 1 2
			for(int j=0; j<arr4[i].length; j++) { //열 인덱스 0 1, 0 1 2, 0 1 2 3
				System.out.print(arr4[i][j] +" ");
			}
			System.out.println();
		}
		
		
	}

}
