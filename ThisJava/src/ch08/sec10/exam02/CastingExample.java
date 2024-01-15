package ch08.sec10.exam02;
/*
 * 날짜 : 2024/01/15
 * 이름 : 최형욱
 * 내용 : 8장 강제 타입 변환
 */ 
public class CastingExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare();   (x)
		
		//강제 타입 변환 후 호출
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}
}
