package ch06.sec09;
/*
 * 날짜 : 2024/01/08
 * 이름 : 최형욱
 * 내용 : 6장 인스턴스 멤버
 */
public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car youarCar = new Car("벤츠");
		
		myCar.run();
		youarCar.run();
	}
}
