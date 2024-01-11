package ch08.sec07;
/*
 * 날짜 : 2024/01/11
 * 이름 : 최형욱
 * 내용 : 8장 private 메소드
 */ 

public class ServiceExample {
	public static void main(String[] args) {
		
		//인터페이스 변수 선언과 구현 객체 타입
		Service service = new ServiceImpl();
		
		//디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();
		
		//정적메소드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}
}
