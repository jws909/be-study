package be_study.refer;

public class Refer02 {

	public static void main(String[] args) {
		
		// enum 열거타입
		
		// 선호도 저장
		
		int likePoint = 50;	//60;	1~5
		
//		String likeLevel = "매우좋음";	// 매우나쁨 나쁨 보통 좋음 매우좋음
//		String likeLevel2 = "많이좋음"; // 저장값 목록을 벗어난 논리적오류
		
//		
//		//논리적 오류로 조건식에서 벗어나버린다.
//		if(likeLevel.equals("매우좋음")) {
//			
//		}
		
//		int likeValue = 1;	//1 2 3 4 5
//		
//		if(likeValue == 5) {
//			
//		}
		
		LikeIndex li1 = LikeIndex.VERYGOOD;
		LikeIndex li2 = LikeIndex.NORMAL;
		
		if(li1 == LikeIndex.VERYGOOD) {
			System.out.println("아주 좋은 등급이구나");
		} else if(li1 == LikeIndex.VERYBAD) {
			System.out.println("아주 안좋은데 대응이 필요하겠어");
		} else {
			//...
		}
		
		Week w1 = Week.TUE;
		Week w2 = Week.FRI;
		
		if(w2 == Week.FRI) {
			System.out.println("금요일 신나는 날");
		}
		
	}

}
