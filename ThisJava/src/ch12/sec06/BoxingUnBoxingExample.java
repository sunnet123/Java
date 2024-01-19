package ch12.sec06;
/*
 * 날짜 : 2024/01/19
 * 이름 : 최형욱
 * 내용 : 12장 포장 클래스
 */

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		//Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//Unboxing
		int value = obj;
		System.out.println("value: " + value);
		
		//연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
}
