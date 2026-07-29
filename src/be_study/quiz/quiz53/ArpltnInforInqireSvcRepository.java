package be_study.quiz.quiz53;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;

public class ArpltnInforInqireSvcRepository {
	
	//초미세먼지 주간예보 조회
	//https://www.data.go.kr/data/15073861/openapi.do
	//요청주소 http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth
	//서비스URL http://apis.data.go.kr/B552584/ArpltnInforInqireSvc

	public String getMinuDustWeekFrcstDspth(String searchDate) throws Exception {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=서비스키"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode(searchDate, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/
        //urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode("2020-11-09", "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 호출 당일 날짜를 기준으로 주간예보 리스트 확인)*/
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
        
        return sb.toString();
	}
	
	public MinuDustDTO getMinuDustDTO(String searchDate) {
		MinuDustDTO minuDustDTO = null;
		
		try {
			String jsonString = this.getMinuDustWeekFrcstDspth(searchDate);
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject)jsonParser.parse(jsonString);
			JSONObject response = (JSONObject)jsonObj.get("response");
			JSONObject body = (JSONObject)response.get("body");
			JSONArray items = (JSONArray)body.get("items");
			JSONObject item0 = (JSONObject)items.get(0);
			
			minuDustDTO = new MinuDustDTO();
			
			minuDustDTO.setSearchDate(searchDate);
			minuDustDTO.setFrcstOneDt(item0.get("frcstOneDt").toString());
			minuDustDTO.setFrcstOneCn(item0.get("frcstOneCn").toString());
			minuDustDTO.setFrcstTwoDt(item0.get("frcstTwoDt").toString());
			minuDustDTO.setFrcstTwoCn(item0.get("frcstTwoCn").toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return minuDustDTO;
	}
}
