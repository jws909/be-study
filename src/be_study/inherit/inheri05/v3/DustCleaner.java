package be_study.inherit.inheri05.v3;

public class DustCleaner extends Cleaner {

	public void doClean() {
		this.removeDust();
	}
	
	public void removeDust() {
		System.out.println("먼지털기~");
	}
}
