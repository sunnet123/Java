package ch07.sec08.exam01;
/*
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : 7장 다형성
 */
public class CarExample {
	public static void main(String[] args) {
		
		//Car 객체 생성
		Car myCar = new Car();
		
		//Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
				
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.tire = new KumhoTire();
		myCar.run();		
	}
}
