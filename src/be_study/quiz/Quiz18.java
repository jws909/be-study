package be_study.quiz;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
//		*
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}

//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt();
		for(int i=1; i<num; i++)
			if(num%i == 0)
				System.out.print(i +" ");
		System.out.println(num);
		
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		
//		입력 : 3
//
//		*
//		**
//		***
//		**
//		*
		System.out.print("입력 : ");
		num = scanner.nextInt();
		
		for(int i=1; i<num; i++) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=num; i>0; i--) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		
//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		//1) 중첩반복문으로 그냥 다 더하기
		int sum = 0;
		for(int i=1; i<=10; i++) 	//i: 1, 2, 3, ~ , 10
			for(int j=1; j<=i; j++) //j: 1, 1 2, 1 2 3, ... , 1 2 ~ 10 
				sum += j;
		System.out.println(sum);
		
		//2) 갯수를 세어보면 1은 10번 2는 9번 3은 8번 ... 10은 1번 더한다.
		sum = 0;
		for(int i=1; i<=10; i++)
			sum += (i * (11-i));
		
		System.out.println(sum);
		
		//3) 누적총합과 각각의 합을 따로 저장하는 방식
		sum = 0;
		int currentSum = 0;
		for(int i=1; i<=10; i++) {
			currentSum += i;
			sum += currentSum;
		}
		System.out.println(sum);
		
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.

		//1) 반복문으로 찾기
		int lastNum = 0;
		sum = 0;
		int i = 1;
		while(sum < 100) {
			if(i%2==0)
				lastNum = -i;
			else
				lastNum = i;
			sum += lastNum;
			i++;
		}
		System.out.printf("누적합: %d, 마지막으로 더한 숫자: %d\n", sum, lastNum);
		
		//2) 누적합은 1, -1, 2, -2, 3, -3 ... 인 규칙성이 있다
		//   짝수번째는 2를 곱하면 바로 무슨 값을 더 했는지 나온다.
		//예) -3은 -6을 더한 시점, -50은 -100을 더한 시점, -100은 -200을 더한 시점
		//	 누적합이 n이라고 친다면 짝수번째는 2n을 더한 시점 홀수번째는 2n-1을 더한 시점이 된다.
		//
		int n = -100;
		if(n<0)	//짝수번째
			System.out.printf("누적합: %d, 마지막으로 더한 숫자: %d\n", n, 2*n);
		else if(n>0) //홀수번째
			System.out.printf("누적합: %d, 마지막으로 더한 숫자: %d\n", sum, 2*n-1);
		
	}

}
