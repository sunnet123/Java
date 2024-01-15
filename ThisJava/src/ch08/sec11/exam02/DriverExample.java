package ch08.sec11.exam02;
/*
 * 날짜 : 2024/01/15
 * 이름 : 최형욱
 * 내용 : 8장 매개변수의 다형성
 */ 
public class DriverExample {
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//매개값으로 구현 객체 대입(다형성: 실행 결과가 다름)
		driver.driver(bus);
		driver.driver(taxi);
	}
}
