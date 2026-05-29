package be_study.inherit.inherit05.v1;

import java.util.ArrayList;
import java.util.List;

public class MainV1 {

	public static void main(String[] args) {
		
//		DustCleaner dc1 = new DustCleaner();
//		DustCleaner dc2 = new DustCleaner();
//		DustCleaner dc3 = new DustCleaner();
//		dc1.removeDust();
//		dc2.removeDust();
//		dc3.removeDust();
		
		DustCleaner[] dustArr = new DustCleaner[3];
		dustArr[0] = new DustCleaner();
		dustArr[1] = new DustCleaner();
		dustArr[2] = new DustCleaner();
		
//		ArrayList<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
//		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
		List<FloorCleaner> floorList = new ArrayList<>();
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());
		floorList.add(new FloorCleaner());

		List<WindowCleaner> windowList = new ArrayList<>();
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		windowList.add(new WindowCleaner());
		
		for(int i=0; i<dustArr.length; i++) {
			dustArr[i].removeDust();
		}
		
		for(int i=0; i<floorList.size(); i++) {
			floorList.get(i).cleanFloor();
		}
		
		for(WindowCleaner wc : windowList) {
			wc.washWindow();
		}
	}

}
