package ch07.sec10.exam01;
/*
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : 7장 추상클래스
 */
public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
