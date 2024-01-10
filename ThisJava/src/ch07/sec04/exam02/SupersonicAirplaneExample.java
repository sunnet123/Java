package ch07.sec04.exam02;
/*
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : 7장 메소드 재정의
 */
public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
