package be_study.inherit.inherit05.v4;

public class WindowCleaner extends Cleaner {
	
	public void doClean() {
		this.washWindow();
	}
	
	public void washWindow() {
		System.out.println("창문닦기~");
	}

}
