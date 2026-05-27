package be_study.quiz.quiz30;

public class StudentMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setMajor("컴퓨터공학");
		stu1.setStuId(1234);
		
		System.out.println(stu1.getMajor() +"과 학번:"+ stu1.getStuId());

	}

}
