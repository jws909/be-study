package be_study.inherit.inherit05.v4;

public class DustCleaner extends Cleaner {

	public void doClean() {
		this.removeDust();
	}
	
	public void removeDust() {
		System.out.println("먼지털기~");
	}
	
	public void arrangeItem() {
		System.out.println("물건정리~");
	}
}
