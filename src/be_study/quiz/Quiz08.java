package be_study.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//출생년도와 주민등록번호 뒷자리 첫번째 숫자를 입력받아서, 나이와 성별을 출력하세요.
		//기준은 2026년으로 함.
		//나이는 단순하게 2025년과의 차이로 함 (만 나이, 월 따지지 않음)
		//2000년생 = 27살
		//1996년생 = 31살

		//2000년생 이후로는 뒷자리 남자 : 3, 여자 : 4
		//2000년생 이전은 뒷자리 남자 : 1, 여자 : 2
		//그 외에 케이스가 들어오면 잘못된 입력이라고 출력하도록 처리.
		//어떤 경우가 잘못된 경우일지 한번 생각해보세요~

		//주민번호 뒷자리 첫번째 수 구분.
		//남자 : 1 이거나 3
		//여자 : 2 이거나 4

		//예시 1)
		//출생년도를 입력하세요 : 2000
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 4
		//결과 : 27살 여자입니다.

		//예시 2)
		//출생년도를 입력하세요 : 1998
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 1
		//결과 : 29살 남자입니다.
		
		System.out.print("출생년도: ");
		int birthYear = scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자: ");
		int firstNum = scanner.nextInt();
		boolean errFlag = false;
		int age = 0;
		String sex = "";
		
		if(birthYear < 2000 && birthYear > 1900) {
			age = 2027 - birthYear;
			if(firstNum == 1) {
				sex = "남자";
			} else if(firstNum == 2) {
				sex = "여자";
			} else {
				errFlag = true;
			}
		} else if(birthYear >= 2000 && birthYear < 2027) {
			age = 2027 - birthYear;
			if(firstNum == 3) {
				sex = "남자";
			} else if(firstNum == 4) {
				sex = "여자";
			} else {
				errFlag = true;
			}
		} else {
			errFlag = true;
		}
		
		if(errFlag) {
			System.out.println("잘못된 입력입니다.");
		} else {
			System.out.println(age +"살 "+ sex +"입니다.");
		}
	}

}
