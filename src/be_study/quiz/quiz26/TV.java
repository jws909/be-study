package be_study.quiz.quiz26;

public class TV {
	//필드
	String company;
	int prodDate;
	int size;
	//생성자
	TV(String company, int prodDate, int size){
		this.company = company;
		this.prodDate = prodDate;
		this.size = size;
	}
	//메서드
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n", company, prodDate, size);
	}
}
