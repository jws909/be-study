package be_study.quiz;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
//		엘리베이터
//
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열 최대한 사용하시면 됩니다. )
//
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다.
//		(오로지 한번에 100층까지 쭉)
//		(100층을 찍고 다시 1층까지 내려와야함)
//
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
//		(
//		* 입력된 층은 중복되지 않게 입력이 된다고 가정
//		예시)
//		[10, 20, 35, 50, 11, 24] O 정상입력 케이스로 가정하고 진행
//		[10, 20, 35, 10, 20, 24] X 중복층 입력 없음으로 가정
//		)
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("탑승하는 인원을 입력해주세요: ");
		int numPeople = scanner.nextInt();
		//입력받은 인원만큼 층을 저장할 배열 생성
		int[] floor = new int[numPeople];
		
		//배열에 내릴 층 저장
		//예시) 10 20 35 50 11 24
		System.out.println(numPeople +"명의 내리는 층을 입력해주세요. (2층~100층)");
		System.out.print("[예시) 10 20 35 ...]: ");
		for(int i=0; i<floor.length; i++)
			floor[i] = scanner.nextInt();
		
		//입력받은 층수를 낮은수부터 정렬하여 orderedFloor배열에 저장
		int[] orderedFloor = new int[numPeople];
		for(int i=0; i<orderedFloor.length; i++) {
			int minFloor = 101;
			int minIndex=0;
			//floor배열의 최소값을 찾는다
			for(int idx=0; idx<floor.length; idx++) {
				if(minFloor > floor[idx]) {
					minFloor = floor[idx];
					minIndex = idx;
				}
			}
			//orderedFloor의 i번째에 최소값을 저장후 floor의 최소값이 있던곳에 101을 넣는다.
			orderedFloor[i] = minFloor;
			floor[minIndex] = 101;
		}
		
		System.out.println("엘리베이터가 올라갑니다.");
		System.out.println("1층");
		int idx = 0; //내린사람의 수
		for(int i=2; i<=100; i++) {
			System.out.print(i +"층 ");
			if(idx<orderedFloor.length && orderedFloor[idx] == i)
				System.out.print(++idx +"번째 사람이 내립니다.");
			System.out.println();
		}
		
		System.out.println("엘리베이터가 내려갑니다.");
		for(int i=99; i>0; i--)
			System.out.println(i + "층");
	}

}
