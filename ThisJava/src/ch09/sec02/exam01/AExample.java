package ch09.sec02.exam01;
/*
 * 날짜 : 2024/01/16
 * 이름 : 최형욱
 * 내용 : 9장 인스턴스 멤버 클래스
 */ 
public class AExample {
	public static void main(String[] args) {
		//A 객체 생성
		A a = new A();
		
		//B 객체 생성
		A.B b = a.new B();
	}
}
