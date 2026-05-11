package be_study.cond;

public class Cond04 {

	public static void main(String[] args) {
		
		// 조건문
		// 조건문 (조건식 && 조건식)
		// 조건문 (조건식 || 조건식)
		
		// 삼항연산자 중첩
		// 조건식 ? 참 : 거짓
		// 조건식 ? 참 : (조건식 ? 참 : 거짓)
		
		// 조건문 중첩
		
		/*
			
			if() {
				
				if() {
				}
				
			} else {
			
				if() {
				}
				
			}
		
		*/
		
		/*
			수면시작시간
			
			21시 기준
				전에 -> 일찍
				늦게 -> 늦게
				
			실제수면시간
			
			8시간 기준
				적게
				많이
				
			경우의 수
			
			일찍 적게
			일찍 많이
			늦게 적게
			늦게 많이
		*/
		
		int goBedTime = 23;	//23시에 자러가고
		int sleepTime = 5;	//5시간 수면
		
		if(goBedTime < 21) { //일찍
			if(sleepTime < 8) { //적게
				System.out.println("일찍 적게");
			} else { //많이
				System.out.println("일찍 많이");
			}
		} else { //늦게
			if(sleepTime < 8) { //적게
				System.out.println("늦게 적게");
			} else { //많이
				System.out.println("늦게 많이");
			}
		}
		
		if(goBedTime < 21 && sleepTime < 8) {
			System.out.println("일찍 적게");
		} else if(goBedTime < 21 && sleepTime >= 8) {
			System.out.println("일찍 많이");
		} else if(goBedTime >= 21 && sleepTime < 8) {
			System.out.println("늦게 적게");
		} else {
			System.out.println("늦게 많이");
		}
		
		int point = 50;
		
		// 0 ~ 100
		
		if(point >= 0 && point <= 100) { // 0~100점이 보장
			if(point >= 50) {
				System.out.println("잘했네");
			} else {
				System.out.println("아쉽네");
			}
		} else {
			System.out.println("잘못된 점수가 입력되었습니다. 점수는 0~100점만 가능합니다.");
		}
		
	}

}
