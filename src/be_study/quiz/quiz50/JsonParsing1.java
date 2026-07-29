package be_study.quiz.quiz50;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParsing1 {
	public static void main(String[] args) {
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			JSONObject lib = (JSONObject)jsonObj.get("도서관");
			System.out.println("위치 : " + lib.get("위치"));
			
			JSONObject hour = (JSONObject)lib.get("운영시간");
			System.out.println("운영 시간 : ");
			System.out.println("평일 : " + hour.get("평일"));
			System.out.println("주말 : " + hour.get("주말"));
			
			JSONArray bookList = (JSONArray)lib.get("책목록");
			
			for(int i=0; i<bookList.size(); i++) {
				JSONObject book = (JSONObject)bookList.get(i);
				BookDTO bookDTO = new BookDTO();
				bookDTO.setTitle(book.get("제목").toString());
				bookDTO.setAuthor(book.get("저자").toString());
				bookDTO.setYearOfPublication(((Number)book.get("출판연도")).intValue());
				bookDTO.setPrice(((Number)book.get("가격")).intValue());
				bookDTO.setCanBorrowing((Boolean)book.get("대출가능"));
				JSONArray category = (JSONArray)book.get("카테고리");
				for(int j=0; j<category.size(); j++)
					bookDTO.addCategory(category.get(i).toString());
				System.out.println(bookDTO);
			}
			
			//특별서비스는 생략...
			JSONObject specialService = (JSONObject)lib.get("특별서비스");
			System.out.println(specialService.toString());
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	static String jsonString = ""
			+ "{"
			+ "\"도서관\": {"
			+ "\"위치\": \"서울특별시 강남구\","
			+ "\"운영시간\": {"
			+ "\"평일\": [\"09:00\", \"21:00\"],"
			+ "\"주말\": [\"10:00\", \"18:00\"]"
			+ "},"
			+ "\"책목록\": ["
			+ "{"
			+ "\"제목\": \"자바 프로그래밍\","
			+ "\"저자\": \"홍길동\","
			+ "\"출판연도\": 2023,"
			+ "\"가격\": 25000,"
			+ "\"대출가능\": true,"
			+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]"
			+ "},"
			+ "{"
			+ "\"제목\": \"데이터 분석 입문\","
			+ "\"저자\": \"김철수\","
			+ "\"출판연도\": 2022,"
			+ "\"가격\": 28000,"
			+ "\"대출가능\": false,"
			+ "\"카테고리\": [\"데이터\", \"분석\"]"
			+ "}"
			+ "],"
			+ "\"특별서비스\": {"
			+ "\"키오스크\": true,"
			+ "\"스터디룸\": {"
			+ "\"개수\": 5,"
			+ "\"예약 가능\": true,"
			+ "\"비용\": {"
			+ "\"1시간당\": 5000,"
			+ "\"하루\": 30000"
			+ "}"
			+ "}"
			+ "}"
			+ "}"
			+ "}";
}
