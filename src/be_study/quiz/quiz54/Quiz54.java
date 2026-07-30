package be_study.quiz.quiz54;

import java.util.ArrayList;
import java.util.List;

public class Quiz54 {
	public static void main(String[] args) {

		String[] participant1 = { "leo", "kiki", "eden" };
		String[] completion1 = { "eden", "kiki" };

		String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] completion2 = { "marina", "josipa", "nikola", "filipa" };

		String[] participant3 = { "mislav", "stanko", "ana", "mislav" };
		String[] completion3 = { "mislav", "stanko", "ana" };

		String result1 = solution(participant1, completion1); // leo
		String result2 = solution(participant2, completion2); // vinko
		String result3 = solution(participant3, completion3); // mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	// 메소드 선언부분
	public static String solution(String[] participant, String[] completion) {
		List<String> participantList = new ArrayList<>();
		
		//배열 participant를 리스트로 변환
		for(String parti : participant)
			participantList.add(parti);
		
		//배열 completion에 있는 이름으로 리스트에 하나씩 제거
		for(String comp : completion)
			participantList.remove(comp);
		
		//남은 한사람의 이름을 리턴
		return participantList.get(0);
	}
}
