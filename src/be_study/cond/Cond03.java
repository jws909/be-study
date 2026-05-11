package be_study.cond;

public class Cond03 {

	public static void main(String[] args) {
		
		/*
		if
		...
		if
		...
		if
		...
		
		
		else 혼자 사용 X
		
		if
		else
		
		if
		els
		
		if
		
		if
		
		if 
		else
		
		
		else if 혼자 사용 X
		
		if
		else if
		...
		else if
		else
		
		*/

		
		int dice = 5;	// 1~6
		
		if(dice == 1) {
			System.out.println("1칸 전진");
		} else if(dice == 2) {
			
		} else if(dice == 3) {
			
		} else if(dice == 4) {
			
		} else if(dice == 5) {
			
		} else { // 6일때 실행
			
		}
		
		if(dice == 1) {}
		if(dice == 2) {}
		if(dice == 3) {}
		if(dice == 4) {}
		if(dice == 5) {}
		if(dice == 6) {}
		
		//
		
		// (조건식 -> 최종적으로 true false 논리형)
		
		if(dice > 10) {}
		
		if(dice > 0 && dice <= 6) {}
		
		if(dice < 1 || dice > 6) {}
		
		
		// switch (비교하려는 대상)
		dice = 1;
		switch(dice) {
		case 1:		//if(dice == 1)
			System.out.println("case 1");
			break;
		case 2:		//if(dice == 2)
			System.out.println("case 2");
			break;
		case 3:		//if(dice == 3)
			System.out.println("case 3");
			break;
		case 4:		//if(dice == 4)
			System.out.println("case 4");
			break;
		case 5:		//if(dice == 5)
			System.out.println("case 5");
			break;
		case 6:		//if(dice == 6)
			System.out.println("case 6");
			break;
		default:	//else
			System.out.println("out of case");
		}
		
		
		//------------------------------------
		
		/* 출근시간 대비 할 일
		 * 
		 * 8시	청소
		 * 9시	회의
		 * 10시	업무
		 * 11시	외근
		 */
		
		int showTime = 8; //출근시간
		
		if(showTime <= 8) {
			//청소
			//회의
			//업무
			//외근
		} else if(showTime <= 9) {
			//회의
			//업무
			//외근
		} else if(showTime <= 10) {
			//업무
			//외근
		} else if(showTime <= 11) {
			//외근
		}
		
		if(showTime <= 8) {
			//청소
		} 
		if(showTime <= 9) {
			//회의
		}
		if(showTime <= 10) {
			//업무
		}
		if(showTime <= 11) {
			//외근
		}
		
		switch (showTime) {
		case 8:
			//청소
		case 9:
			//회의
		case 10:
			//업무
		case 11:
			//외근
		
		//default:	else
		}
		
		switch (showTime) {
		case 8:
			//청소
			//회의
			//업무
			//외근
			break;
		case 9:
			//회의
			//업무
			//외근
			break;
		case 10:
			//업무
			//외근
			break;
		case 11:
			//외근
			break;
		
		//default:	else
		}
		
	}

}
