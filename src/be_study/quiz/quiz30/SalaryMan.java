package be_study.quiz.quiz30;

public class SalaryMan {
	int salary;
	
	SalaryMan(){
		salary = 1000000;
	}
	
	SalaryMan(int salary){
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		int result = 0;
		
		result = salary*12 + salary*5;
		
		return result;
	}
	
}
