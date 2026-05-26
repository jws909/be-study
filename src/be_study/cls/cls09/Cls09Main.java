package be_study.cls.cls09;

public class Cls09Main {

	public static void main(String[] args) {
		
		//기본타입 정수형 변수
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		
		int[] nArr = {10, 20, 30};
		int[] nArr1 = {n1, n2, n3};
		int[] nArr2 = new int[3];
		nArr2[2] = 100;
		
		for(int i=0; i<nArr.length; i++) {
			System.out.print(nArr[i] +" ");
		}
		System.out.println();
		
		for(int n: nArr) {
			System.out.print(n +" ");
		}
		System.out.println();

		System.out.println(methodA(n3));
		System.out.println(methodA(50));
		
		methodB(nArr);
		methodB(nArr2);
		
		int[] resultC = methodC(nArr);
		methodB(resultC);
		
		System.out.println("----------------------------------");
		
		//객체 단위 활용
		Temp09 t1 = new Temp09();
		Temp09 t2 = new Temp09();
		Temp09 t3 = new Temp09();
		
		Temp09[] tArr = {new Temp09(), new Temp09(), new Temp09()};
		Temp09[] tArr1 = {t1, t2, t3};
		Temp09[] tArr2 = null;
		tArr2 = new Temp09[3];	//배열 공간 3개짜리 선언	[3]
		// null null null
		tArr2[1] = new Temp09(); //객체생성 new Temp09() 기본생성자
		// null Temp09() null
		
		//String[] sArr = new String[5];
		// null null null null null
		
		for(int i=0; i<tArr.length; i++) {
			System.out.print(tArr[i].num +" ");
			tArr[i].method();
		}
		System.out.println();
		
		for(Temp09 t : tArr) {
			System.out.print(t.num +" ");
			t.method();
		}
		System.out.println();
		
		System.out.println("----------------------------------");
		
		methodD(t2);
		methodD(tArr2[1]);
		
		methodE(tArr);	//Temp09[] 배열 전달
		
		Temp09 resultF = methodF();	//return Temp09
		methodD(resultF);
		
		Temp09[] resultG = methodG();
		methodE(resultG);
	}
	
	public static int methodA(int n) {
		return n + 10;
	}

	public static void methodB(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	
	public static int[] methodC(int[] arr) {
		//arr 매개변수 배열 -> 로직 연산~ 활용
		//return int[]
		int[] arrTemp = {5,4,3,2,1};
		return arrTemp;
	}
	
	public static void methodD(Temp09 t) {	// Temp09 t = ...
		System.out.println(t.num);
		t.method();
	}
	
	public static void methodE(Temp09[] arr) {
		System.out.println("---methodE Start---");
		for(Temp09 t : arr) {
			System.out.print(t.num +" ");
			t.method();
		}
		System.out.println("---methodE End---");
	}
	
	public static Temp09 methodF() {
		Temp09 tt = new Temp09();
		tt.num = 99;
		return tt;
//		return null;
	}
	public static Temp09[] methodG() {
		Temp09[] arr = new Temp09[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Temp09();
			arr[i].num = i+1;
		}
		return arr;
//		return null;
	}
}
