package be_study.api.v2;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;

public class MidFcstInfoServiceRepository {

	//기상청_중기예보 조회서비스 
	//중기기온조회
	//https://www.data.go.kr/data/15059468/openapi.do
	//요청주소 http://apis.data.go.kr/1360000/MidFcstInfoService/getMidTa
	//서비스URL http://apis.data.go.kr/1360000/MidFcstInfoService
	
	public String requestApi_getMidTa(String tmFc, String regId) throws IOException {
		
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/MidFcstInfoService/getMidTa"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=서비스키"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
        urlBuilder.append("&" + URLEncoder.encode("regId","UTF-8") + "=" + URLEncoder.encode(regId, "UTF-8")); /*11B10101 서울, 11B20201 인천 등 ( 별첨엑셀자료 참고)*/
        urlBuilder.append("&" + URLEncoder.encode("tmFc","UTF-8") + "=" + URLEncoder.encode(tmFc, "UTF-8")); /*-일 2회(06:00,18:00)회 생성 되며 발표시각을 입력- YYYYMMDD0600(1800) 최근 24시간 자료만 제공*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        //System.out.println(sb.toString());
        
        return sb.toString();  // api 요청을 통해 응답받은 json 포맷의 텍스트
	}
	
	public MidTaDTO getMidTa(String tmFc, String regId) {
		
		MidTaDTO midTaDTO = null;
		
		try {
			String jsonString = requestApi_getMidTa(tmFc, regId);
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			JSONObject response = (JSONObject)jsonObj.get("response");
			JSONObject header = (JSONObject)response.get("header");
			
			midTaDTO.setResultCode(header.get("resultCode").toString());
			midTaDTO.setResultMsg(header.get("resultMsg").toString());
			
			JSONObject body = (JSONObject)response.get("body");
			JSONObject items = (JSONObject)body.get("items");
			JSONArray item = (JSONArray)items.get("item");
			JSONObject item0 = (JSONObject)item.get(0);
			
			midTaDTO.setTmFc(tmFc);
			midTaDTO.setRegId(regId);
			midTaDTO.setTaMin4(((Number)item0.get("taMin4")).intValue());
			midTaDTO.setTaMax4(Integer.parseInt(item0.get("taMax4").toString()));
			midTaDTO.setTaMin5(((Number)item0.get("taMin5")).intValue());
			midTaDTO.setTaMax5(((Number)item0.get("taMax5")).intValue());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return midTaDTO;
	}
}
