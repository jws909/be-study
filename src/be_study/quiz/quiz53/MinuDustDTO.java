package be_study.quiz.quiz53;

public class MinuDustDTO {
	String searchDate;	//조회 날짜
	
	String frcstOneDt;  //첫째날예보일시
	String frcstOneCn;  //첫째날예보
	
	String frcstTwoDt;  //둘째날예보일시
	String frcstTwoCn;  //둘째날예보
	
	public String getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}
	public String getFrcstOneDt() {
		return frcstOneDt;
	}
	public void setFrcstOneDt(String frcstOneDt) {
		this.frcstOneDt = frcstOneDt;
	}
	public String getFrcstOneCn() {
		return frcstOneCn;
	}
	public void setFrcstOneCn(String frcstOneCn) {
		this.frcstOneCn = frcstOneCn;
	}
	public String getFrcstTwoDt() {
		return frcstTwoDt;
	}
	public void setFrcstTwoDt(String frcstTwoDt) {
		this.frcstTwoDt = frcstTwoDt;
	}
	public String getFrcstTwoCn() {
		return frcstTwoCn;
	}
	public void setFrcstTwoCn(String frcstTwoCn) {
		this.frcstTwoCn = frcstTwoCn;
	}
	
	@Override
	public String toString() {
		return "MinuDustDTO [searchDate=" + searchDate + ", frcstOneDt=" + frcstOneDt + ", frcstOneCn=" + frcstOneCn
				+ ", frcstTwoDt=" + frcstTwoDt + ", frcstTwoCn=" + frcstTwoCn + "]";
	}
	
}
