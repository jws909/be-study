package be_study.refer;

public class Arr04 {

	public static void main(String[] args) {
		
		//배열 참조타입	vs	int 기본타입
		
		int a = 10;
		int b = a;
		System.out.println(a +" "+ b);	//10 10
		
		b = 20;
		System.out.println(a +" "+ b);	//10 20
		
		// 배열 복사
		
		//참조타입인 경우 복사
		// 얕은 복사(shallow copy) VS 깊은 복사(deep copy)
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1;	//얕은 복사
		
		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr1[i] +" ");
		System.out.println();
		
		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr2[i] +" ");
		System.out.println();
		
		arr2[0] = 99;
		System.out.println("----------값 수정 후 다시 출력----------");
		
		// 99 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr1[i] +" ");
		System.out.println();
				
		// 99 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr2[i] +" ");
		System.out.println();
		
		System.out.println("===================================");
		// 깊은 복사
		
		int[] arr3 = {10, 20, 30};	// 10	20	30
		int[] arr4 = new int[3];	// 0	0	0
		
		//for 문으로 각 변수값(int) 복사
		for(int i=0; i<3; i++)
			arr4[i] = arr3[i];
		
		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr3[i] +" ");
		System.out.println();

		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr4[i] +" ");
		System.out.println();

		arr4[0] = 99;
		System.out.println("----------값 수정 후 다시 출력----------");

		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr3[i] +" ");
		System.out.println();

		// 99 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr4[i] +" ");
		System.out.println();
		
		System.out.println("===================================");
		
		//비교
		System.out.println(arr1 == arr2);	//주소비교
		System.out.println(arr3 == arr4);	//주소비교
		
		System.out.println(arr1[2] == arr2[2]);	//값 비교	30==30
		System.out.println(arr3[2] == arr4[2]);	//값 비교	30==30
		
		// 배열 복사
		// System.arraycopy(복사할대상, 복사할대상의 위치(index), 저장할대상, 저장할대상의 위치(index), 갯수(길이));
		
		int[] arr5 = {10, 20, 30};	// 10	20	30
		int[] arr6 = new int[3];	// 0	0	0
		
//		System.arraycopy(arr5, 0, arr6, 0, 3);	//10 20 30
		System.arraycopy(arr5, 0, arr6, 1, 2);	//0 10 20
		
		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr5[i] +" ");
		System.out.println();

		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr6[i] +" ");
		System.out.println();

		arr6[0] = 99;
		System.out.println("----------값 수정 후 다시 출력----------");

		// 10 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr5[i] +" ");
		System.out.println();

		// 99 20 30
		for(int i=0; i<3; i++)
			System.out.print(arr6[i] +" ");
		System.out.println();
		
	}
	
}
