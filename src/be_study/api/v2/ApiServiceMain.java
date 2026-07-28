package be_study.api.v2;

public class ApiServiceMain {

	public static void main(String[] args) {
		
		//API 데이터 요청 -> 결과 값 응답하는 repository
		MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();
		
		// 시간기준, 지역코드 전달 -> (api 요청, 응답 json 파싱, dto 변환) -> dto 리턴
		// 날짜, 서울지역기준
		MidTaDTO m1 = repository.getMidTa("202607280600", "11B10101");
		System.out.println(m1);
		
		// 날짜, 인천지역기준
		MidTaDTO m2 = repository.getMidTa("202607280600", "11B20201");
		System.out.println(m2);
		
		// 파싱된 DTO 객체 보유 -> DB 저장
	}

}
