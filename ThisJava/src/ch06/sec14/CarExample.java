package ch06.sec14;
/*
 * 날짜 : 2024/01/08
 * 이름 : 최형욱
 * 내용 : 6장 Getter와 Setter
 */
public class CarExample {
	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: " + myCar.getSpeed());
	}
}
