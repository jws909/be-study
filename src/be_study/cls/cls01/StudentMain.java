package be_study.cls.cls01;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("출력");
		
		//기본타입
		int n;
		n = 10;
		
		//참조타입변수 (배열)
		int[] arr1;
		int[] arr2 = {1,2,3};
		int[] arr3 = null;
		//arr3[0] = 50;
		arr3 = new int[5];
		arr3[0] = 50;

		
		//클래스타입변수		<- 참조타입변수
		//클래스변수
		
//		Student stu1;
		Student stu1 = null;
		stu1 = new Student(); //인스턴스 객체 생성
		
		Student stu2 = new Student(); //인스턴스 객체 생성
		
		stu1.name = "김하나";
		stu2.name = "김둘";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		
		stu1.grade = 3;
		stu2.grade = 5;
		
		System.out.printf("%s는 %d학년\n", stu1.name, stu1.grade);
		System.out.printf("%s는 %d학년\n", stu2.name, stu2.grade);
		
		stu2.studentNumber = "13-1234";
		
		System.out.println(stu1.phone);
		System.out.println(stu1.studentNumber);
		
		System.out.println(stu2.phone);
		System.out.println(stu2.studentNumber);
	}

}
