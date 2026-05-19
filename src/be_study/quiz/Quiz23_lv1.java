package be_study.quiz;

import java.util.Scanner;

public class Quiz23_lv1 {

	public static void main(String[] args) {
//		- 레벨 1
//		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
//		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
//		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
//		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
//
//		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
		Scanner scanner = new Scanner(System.in);
		
		boolean isStoped = false;	//엘리베이터 작동 중지 여부
		System.out.print("엘리베이터가 멈출 수 있는 최대 횟수: ");
		int limit = scanner.nextInt();
		//0이하를 입력받으면 바로 점검
		if (limit <= 0)
			isStoped = true;
		
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
			if(!isStoped) { // 횟수 제한에 걸리지 않았을때
				System.out.print(i +"층 ");
				if(idx<orderedFloor.length && orderedFloor[idx] == i) {
					System.out.print(++idx +"번째 사람이 내립니다.");
					limit--;
					//횟수 제한에 걸리면 정지플래그 true
					if(limit <= 0) {
						isStoped = true;
					}
				}
				System.out.println();
			} else {	// 횟수 제한에 걸려서 엘리베이터가 멈췄을때
				System.out.print("점검 중");
				break;
			}
		}
		
		if(!isStoped) { // 엘리베이터가 작동을 멈추지 않았을때만 내려간다
			System.out.println("엘리베이터가 내려갑니다.");
			for(int i=99; i>0; i--)
				System.out.println(i + "층");
		}
	}

}
