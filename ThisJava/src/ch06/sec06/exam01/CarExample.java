package ch06.sec06.exam01;
/*
 * 날짜 : 2024/01/08
 * 이름 : 최형욱
 * 내용 : 6장 필드 선언과 사용
 * 
 */
public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//Car 객체의 필드값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("시동여부: " + myCar.start);
		System.out.println("현재속도: " + myCar.speed);
	}
}
