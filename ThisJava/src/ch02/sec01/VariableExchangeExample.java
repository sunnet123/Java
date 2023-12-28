package ch02.sec01;
/*
 * 장제목 : 2장 변수선언
 * 이름 : 최형욱
 * 작성일 : 2023.12.27
 */
public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}

}
