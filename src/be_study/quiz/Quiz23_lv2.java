package be_study.quiz;

import java.util.Scanner;

public class Quiz23_lv2 {

	public static void main(String[] args) {
//		- 레벨 2
//		엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
//		탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
//		(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
//
//		+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
//		+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
//		+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)

		Scanner scanner = new Scanner(System.in);
		
		int numPeople = (int)(Math.random()*20)+1;	//탑승 인원은 1~20명 안에서 랜덤
		int[] floor = new int[numPeople]; 	//내리는 층 2~100랜덤으로 돌려서 배열에 저장, 중복값은 제외
		int[] weight = new int[numPeople];	//인원별 몸무게 40~150 랜덤
		for(int i=0; i<floor.length; i++) {
			//층 저장
			while(floor[i] == 0) { //floor[i]가 0이면 계속 반복
				floor[i] = (int)(Math.random()*98) + 2;	//2~100층 랜덤
				//중복체크해서 중복이면 floor[i] = 0;
				for(int j=0; j<i; j++) {
					if(floor[i] == floor[j]) {
						floor[i] = 0;
						break;
					}
				}
			}
			
			//무게 저장
			weight[i] = (int)(Math.random()*110) + 40; //40~150kg 랜덤
		}
		System.out.println("탑승하고싶은 인원수: "+ numPeople);
		System.out.print("내리고 싶은 층수: ");
		for(int f : floor)
			System.out.print(f +" ");
		System.out.println();
		System.out.print("탑승하고 싶은 인원의 몸무게: ");
		for(int w : weight)
			System.out.print(w +"kg ");
		System.out.println();
		
		System.out.print("엘리베이터가 멈출 수 있는 최대 횟수: ");
		
		boolean isStoped = false;	//엘리베이터 작동 중지 여부
		int limit = scanner.nextInt();
		//0이하를 입력받으면 바로 점검
		if (limit <= 0)
			isStoped = true;
		
		System.out.print("무게 제한(kg): ");
		int weightLimit = scanner.nextInt();
		System.out.print("정원(명): ");
		int peopleLimit = scanner.nextInt();
		
		//정원과 무게를 계산하여 탑승할수있는 인원까지만 index를 계산
		int totalWeight = 0; //무게의 합
		int peopleCount = 0; //인원수
		//정원과 총 무게가 제한보다 작을때만 반복
		while(true) {
			//총 무게에 현 인원의 무게를 더하고 인원수 증가
			totalWeight += weight[peopleCount++];
			//무게가 넘어갈 경우
			if(totalWeight > weightLimit) {
				peopleCount--;
				break;
			}
			//정원이 넘어갈 경우
			if(peopleCount > peopleLimit) {
				peopleCount--;
				break;
			}
			//탑승하고 싶은 인원이 전부 탑승할경우
			if(peopleCount == numPeople)
				break;
		}
		
		
		System.out.println("탑승가능한 인원: "+ peopleCount);
		System.out.print("층수: ");
		for(int i=0; i<peopleCount; i++)
			System.out.print(floor[i] +" ");
		System.out.println();
		System.out.print("무게: ");
		for(int i=0; i<peopleCount; i++)
			System.out.print(weight[i] +"kg ");
		System.out.println();
		
		//입력받은 층수를 낮은수부터 정렬하여 orderedFloor배열에 저장
		//위에서 계산한 index크기만큼만 생성
		int[] orderedFloor = new int[peopleCount];
		for(int i=0; i<orderedFloor.length; i++) {
			int minFloor = 101;
			int minIndex=0;
			//floor배열의 최소값을 찾는다 위에서 계산한 index까지만 계산
			for(int idx=0; idx<peopleCount; idx++) {
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
