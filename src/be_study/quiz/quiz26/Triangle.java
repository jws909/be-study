package be_study.quiz.quiz26;

public class Triangle {
	int width;
	int height;
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height / 2.0;
	}
}
