package be_study.inherit.inheri05.v4;

public class FloorCleaner extends Cleaner {
	
	public void doClean() {
		this.cleanFloor();
	}
	
	public void cleanFloor() {
		System.out.println("바닥닦기~");
	}

}
