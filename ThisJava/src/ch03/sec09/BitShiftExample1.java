package ch03.sec09;
/*
 * 장제목 : 3장 비트 이동 연산자
 * 이름 : 최형욱
 * 작성일 : 2023.12.28
 */
public class BitShiftExample1 {

	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int)Math.pow(2, 3);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int)Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
	}

}
