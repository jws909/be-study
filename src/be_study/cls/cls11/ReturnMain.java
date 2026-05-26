package be_study.cls.cls11;

public class ReturnMain {

	public static void main(String[] args) {
		
		//return 기본타입;
		//return 배열;
		//return ArrayList;
		//return 객체;
		
		//데이터 전달을 위한 포장용도로 클래스
		
		//성적
		// 국어 수학 영어
		AllScore score = getScore();
		System.out.println(score.lang);
		System.out.println(score.math);
		System.out.println(score.eng);
	}
	
	public static AllScore getScore() {
		AllScore as = new AllScore();
		as.lang = 70;
		as.math = 90;
		as.eng = 80;
		
		return as;	//객체 1개 리턴
	}
	
	//점수 3개를 한번에 전달
	public static String scoreInfo() {
		// 70 90 80
		return "70|90|80";
	}
	
	public static int mathScore() {
		return 90;
	}
	
	public static int engScore() {
		return 80;
	}

	
}
