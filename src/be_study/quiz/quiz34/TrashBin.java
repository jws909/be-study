package be_study.quiz.quiz34;

public class TrashBin {
	double volume;				//용량
	String color;				//색상
	double binFillPercentage;	//몇 퍼센트 차있는지
	boolean isOpened;			//열렸는지 닫혔는지
	
	public void openBin() {
		isOpened = true;
	}
	
	public void fillBin() {	//한번 버릴때마다 10%씩 찬다고 가정
		binFillPercentage += 10;
		if(binFillPercentage >= 100) {
			this.clearBin();
		}
	}
	
	public void closeBin() {
		isOpened = false;
	}
	
	public void clearBin() {
		binFillPercentage = 0;
		System.out.println("쓰레기통을 비웠습니다.");
	}
	
}
