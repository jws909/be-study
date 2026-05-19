package be_study.refer;

public class Arr05 {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i=0; i<5; i++) {	//변수 i : index 역할
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		System.out.println("=====향상된 for문=====");
		
		for(int v : arr) {
			System.out.print(v +" ");
		}
		System.out.println();

		int idx=0;
		for(int v : arr) {
			System.out.printf("arr[%d] = %d\n", idx, v);
			idx++;
		}
		System.out.println();
		
		
		int[] scores = {90, 95, 100, 85, 80};
		int sum = 0;
		
		for(int i=0; i<scores.length; i++)
			sum += scores[i];
		System.out.println(sum);
		
		sum = 0;
		for(int s : scores)
			sum += s;
		System.out.println(sum);
		
		//{90, 95, 100, 85, 80}
		//scores 에 있는 모든 점수 -5점 감점
		
		
		//5점 감점
		for(int i=0; i<5; i++) {
			scores[i] -= 5;
		}
		
		//감점X
		//향상된 for문은 배열에 있는값을 변수s에 대입해서 보여주는것일뿐이다
		for(int s : scores) {
			s = s - 5;
		}
		
		//출력용
		for(int s : scores) {
			System.out.println(s +" ");
		}
		System.out.println();
		
	}

}
