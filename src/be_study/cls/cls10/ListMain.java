package be_study.cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		//ArrayList<저장타입> 저장타입 클래스타입(참조변수) 가능
		ArrayList<String> al = new ArrayList<String>();
//		ArrayList<int> al = new ArrayList<int>();	//기본타입 불가 int double boolean ...
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		
		//Wrapper Class(기본타입을 한번 감싸서(포장) 객체참조타입으로 인식되도록 하는 클래스)
//		Integer.parseInt(null)		int
//		Double.parseDouble(null)	double
//		Boolean.parseBoolean(null)	boolean
		
		int n1 = 10;
		Integer n2 = 20;
		int n3 = n1;
		int n4 = n2;
		
		//기본 배열
		String[] sArr1 = new String[4];	//4칸짜리 배열 공간 확보
		//기본값 : null null null null
		sArr1[0] = "A";
		sArr1[1] = "B";
		sArr1[2] = "C";
		sArr1[3] = "D";
		
//		sArr1[4] = "E";	//데이터 저장 한개 더 필요 java.lang.ArrayIndexOutOfBoundsException
		String[] sArr2 = new String[5];
		for(int i=0; i<sArr1.length; i++)
			sArr2[i] = sArr1[i];
		sArr2[4] = "E";
		
		for(String s: sArr2) {
			System.out.print(s +" ");
		}
		System.out.println();
		
		
		//ArrayList
		//ArrayList<저장타입> 변수명 = new ArrayList<저장할타입>();
		
		//List<저장타입> 변수명 = new ArrayList<>();
		
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("A"); //	add() List에 값 추가
		sList.add("B");
		sList.add("C");
		sList.add("D");

		for(String s : sList) {
			System.out.print(s +" ");
		}
		System.out.println();
		
		sList.add("E");
		sList.add("F");
		sList.add("G");
		
		for(int i=0; i<sList.size(); i++) {
			//List 에서 특정 인덱스 위치의 값에 접근	list.get(index)		arr[index]
			System.out.print(sList.get(i) +" ");
		}
		System.out.println();
		
		//List 값을 보유여부 확인	.contains(값)
		System.out.println(sList.contains("B")); //true
		
		if(sList.contains("B")) {
			System.out.println("리스트에 B가 있다. contains 결과 true");
		} else {
			System.out.println("리스트 B가 없다.");
		}
		
		if(sList.contains("H") == false) {
			sList.add("H");
		}
		
		for(String s : sList) {
			System.out.print(s +" ");
		}
		System.out.println();
		
		
		// arr[2] = "H";
		// List 특정 위치 값을 저장		.set(인덱스, 값)
		
		sList.set(2, "H");
		for(String s : sList) {
			System.out.print(s +" ");
		}
		System.out.println();
		
		//값 삭제
		// List 에서 값 삭제	remove(index)	remove(값)		//arr[i] = null
		sList.remove(2);
		sList.remove("F");
		for(String s : sList) {
			System.out.print(s +" ");
		}
		System.out.println();
	}

}
