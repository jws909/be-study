package be_study.api.v1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiServiceMain {

	public static void main(String[] args) {
		
		//API 데이터 요청 -> 결과 값 String return
		MidFcstInfoServiceRepository repository = new MidFcstInfoServiceRepository();
		
		try {
			//API 요청
			//String jsonString = repository.requestApi_getMidTa();
			
			//응답 텍스트
			String jsonString = "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL_SERVICE\"},\"body\":{\"dataType\":\"JSON\",\"items\":{\"item\":[{\"regId\":\"11B10101\",\"taMin4\":26,\"taMin4Low\":1,\"taMin4High\":1,\"taMax4\":33,\"taMax4Low\":1,\"taMax4High\":1,\"taMin5\":25,\"taMin5Low\":1,\"taMin5High\":1,\"taMax5\":34,\"taMax5Low\":1,\"taMax5High\":1,\"taMin6\":25,\"taMin6Low\":1,\"taMin6High\":1,\"taMax6\":35,\"taMax6Low\":1,\"taMax6High\":1,\"taMin7\":26,\"taMin7Low\":1,\"taMin7High\":1,\"taMax7\":35,\"taMax7Low\":1,\"taMax7High\":1,\"taMin8\":26,\"taMin8Low\":0,\"taMin8High\":1,\"taMax8\":35,\"taMax8Low\":0,\"taMax8High\":1,\"taMin9\":25,\"taMin9Low\":0,\"taMin9High\":1,\"taMax9\":35,\"taMax9Low\":0,\"taMax9High\":1,\"taMin10\":25,\"taMin10Low\":0,\"taMin10High\":1,\"taMax10\":35,\"taMax10Low\":0,\"taMax10High\":1}]},\"pageNo\":1,\"numOfRows\":10,\"totalCount\":1}}}";
			
			System.out.println("----------main 에서 json 응답 출력----------");
			System.out.println(jsonString);
			
			// 단순 JSON 포맷의 텍스트 -> 자바에서 활용하는 기준으로 파싱
			
			
			// json-simple 라이브러리 활용
			
			// 최초 : 파싱객체 JSONParser()	parse()
			// {	JSONObject
			// [	JSONArray
			// key:value	get("키값")
			
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			
			JSONObject response = (JSONObject)jsonObj.get("response");
			
			JSONObject header = (JSONObject)response.get("header");
			
			System.out.println(header.get("resultCode"));
			System.out.println(header.get("resultMsg"));
			
			JSONObject body = (JSONObject)response.get("body");
			
			System.out.println(body.get("dataType"));
			System.out.println(body.get("pageNo"));
			System.out.println(body.get("numOfRows"));
			System.out.println(body.get("totalCount"));
			
			JSONObject items = (JSONObject)body.get("items");
			
			JSONArray item = (JSONArray)items.get("item");
			
//			for(int i=0; i<item.size(); i++) {
//				item.get(i);
//			}
			
			JSONObject item0 = (JSONObject)item.get(0);
			
			System.out.println(item0.get("regId"));
			System.out.println(item0.get("taMin4"));
			System.out.println(item0.get("taMax4"));
			System.out.println(item0.get("taMin5"));
			System.out.println(item0.get("taMax5"));
			
			// json 자바스크립트기반 객체 { }
			// Java class Object 객체.toString()
			
			MidTaDTO midTaDTO = new MidTaDTO();
			
			midTaDTO.setResultCode(header.get("resultCode").toString());
			midTaDTO.setResultMsg(header.get("resultMsg").toString());
			
			midTaDTO.setTmFc("202607280600");
			midTaDTO.setRegId(item0.get("regId").toString());
			midTaDTO.setTaMin4(((Number)item0.get("taMin4")).intValue());
			midTaDTO.setTaMax4(Integer.parseInt(item0.get("taMax4").toString()));
			midTaDTO.setTaMin5(((Number)item0.get("taMin5")).intValue());
			midTaDTO.setTaMax5(((Number)item0.get("taMax5")).intValue());
			
			System.out.println(midTaDTO);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
