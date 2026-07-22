package be_study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) {

		SampleEx se = new SampleEx();
		
		try {	//의무화는 아니지만, 런타임예외 막기위해 예외처리
			se.addItem1("하나");
		} catch (Exception e) {
			System.out.println("addItem1 하나를 호출한 main에서 예외처리");
		}
		
		try {
			se.addItem2("둘");//메소드 내부에서 이미 예외처리 했기 때문에, 현재 레벨에서는 예외 없음으로 인식
		} catch (Exception e) {
			System.out.println("addItem2 둘을 호출한 main에서 예외처리");
		}
		
		//se.addItem3("셋"); //throws Exception 존재 때문에 try catch 처리가 의무화
		try {
			se.addItem3("셋");
		} catch (Exception e) {
			System.out.println("addItem3 셋을 호출한 main에서 예외처리");
		}
		
		try {
			se.addItem4("넷"); //runtimeException 상태
		} catch (NullPointerException e) {
			System.out.println("addItem4 넷을 호출한 main에서 NullPointerException 예외처리");
		} catch (Exception e) {
			System.out.println("addItem4 넷을 호출한 main에서 Exception 예외처리");
		}
		
		try {
			se.addItem5("다섯");
		} catch (Exception e) {
			System.out.println("addItem5 다섯을 호출한 main에서 Exception 예외처리");
		}
		
		try {
			se.addItem6("여섯");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("addItem6 여섯을 호출한 main에서 Exception 예외처리");
		}
		
		int result = se.addItem7("일곱");
		if(result == 1) {
			System.out.println("addItem7 정상처리");
		} else {  //if result == -1
			System.out.println("addItem7 예외발생");
		}
		
		try {
			se.addItem9("아홉");
		} catch (ListFullException e) {
			e.printStackTrace();
			System.out.println("addItem9 아홉을 호출한 main에서 ListFullException 예외처리");
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
			System.out.println("addItem9 아홉을 호출한 main에서 InvalidParameterValueException 예외처리");
		}
		
		se.showList();
		se.addItem8("여덟");
		se.showList();
		
		se.addItem1("하나");
		se.addItem2("둘");
		se.showList();
		
//		try {
//			se.addItem9("아홉");
//		} catch (ListFullException | InvalidParameterValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}



class SampleEx {
	
	List<String> list;	// new ArrayList<String>();
	
	void addItem1(String s) {
		list.add(s);	//null 상태인 list에 add 시도할 경우 예외
	}
	
	void addItem2(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("SampleEx 내부 addItem2에서 예외처리");
		}
	}
	
	void addItem3(String s) throws Exception {  //Exception 이 발생할 수 있다
		list.add(s);
	}
	
	void addItem4(String s) throws NullPointerException {
		list.add(s);
	}
	
	void addItem5(String s) throws Exception {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("SampleEx 내부 addItem5에서 예외처리");
		}
	}
	
	void addItem6(String s) throws Exception {	//예외발생 가능성 경고
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("SampleEx 내부 addItem6 에서 예외처리");
			throw e;
		}
	}
	
	int addItem7(String s) {	//호출한 쪽에 예외 발생에 대한 여부를 전달
		try {
			list.add(s);
		} catch (Exception e) {
			//예외 발생
			// ... 처리
			return -1; // 예외발생 : -1
		}
		
		return 1; //정상 처리 반환 : 1
	}
	
	//예외를 직접 해결
	void addItem8(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			if(list == null) {
				list = new ArrayList<>();
				list.add(s);
			}
		}
	}
	
	void addItem9(String s) throws ListFullException, InvalidParameterValueException {
		try {
			list.add(s);
		} catch (Exception e) {
			
			// if....
			// 파라미터 s가 잘못된 값이 들어왔다?
			
			//저장 길이 꽉찼다?
			
			//문제가 발생 했다!
			throw new ListFullException();
			
			// return 10
			// return 20
		}
	}
	
	void showList() {
		System.out.println("list 출력-----------------");
		if(list != null) {
			for(String s : list) {
				System.out.print(s + " ");
			}
		}
		System.out.println("\nlist 출력-----------------완료");
	}
}


/*-----------------------------------------------*/
// Custom Exception

class ListFullException extends Exception {}
// Exception e = new ListFullException();

class InvalidParameterValueException extends Exception {}

class SuperHungryException extends Exception {}
