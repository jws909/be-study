package be_study.cls.cls12;

import java.util.ArrayList;

public class ClassRoomMain {

	public static void main(String[] args) {
		
		ClassRoom room1 = new ClassRoom();
		room1.floor = 7;
		room1.roomNumber = 3;
		room1.area = 66.7;	//제곱미터
		room1.hasWhiteBoard = true;
		
		WhiteBoard wb = new WhiteBoard();
		wb.sizeX = 1600;
		wb.sizeY = 900;
		wb.price = 200000;
		wb.isMagnetic = true;
		
		room1.whiteBoard = wb;
		room1.setWhiteBoard(wb);
		
		AirCon ac = new AirCon();
		room1.airCon = ac;
		
//		room1.airCon
//		room1.whiteBoard
		
		ArrayList<Desk> deskList = new ArrayList<Desk>();
//		deskList.add(new Desk());
		
		for(int i=1; i<=10; i++) {
			Desk d = new Desk();
			d.sizeX = 800;
			d.sizeY = 600;
			d.color = "blue";
			
			deskList.add(d);
		}
		
		for(int i=1; i<=5; i++) {
			deskList.add(new Desk(1200, 600, "black"));
		}
		
		//10+5개 책상이 들어있는 deskList
		room1.setDeskList(deskList); // deskList -> room1(ClassRoom)에 부품으로 저장
		
		room1.deskList.add(new Desk(2000, 1200, "oak"));
		room1.addDesk(new Desk(2000, 1200, "oak"));
		
		ClassRoom room2 = new ClassRoom(wb, ac);
		room2.addDesk(new Desk(2000, 1200, "oak")); //NullPointerException
		//addDesk에 if조건으로 deskList가 null일 경우 초기화
		room2.addDesk(1000, 800, "white");
		
	}

}
