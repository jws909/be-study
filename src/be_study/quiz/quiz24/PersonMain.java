package be_study.quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {
//		String name;
//		String sex;
//		int age;
//		int height;
//		int weight;
//		String job;
//		String bloodType;
//		String healthy;
//		boolean isSleep;
		
		Person myProfile = new Person();
		
		myProfile.name = "홍길동";
		myProfile.sex = "남자";
		myProfile.age = 12;
		myProfile.height = 152;
		myProfile.weight = 49;
		myProfile.job = "학생";
		myProfile.bloodType = "B";
		myProfile.healthy = "건강";
		myProfile.isSleep = true;
		
		System.out.println(myProfile.name);
		System.out.println(myProfile.sex);
		System.out.println(myProfile.age);
		System.out.println(myProfile.height);
		System.out.println(myProfile.weight);
		System.out.println(myProfile.job);
		System.out.println(myProfile.bloodType);
		System.out.println(myProfile.healthy);
		System.out.println(myProfile.isSleep);
		

	}

}
