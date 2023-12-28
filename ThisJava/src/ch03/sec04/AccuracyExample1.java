package ch03.sec04;
/*
 * 장제목 : 3장 정확한 계산은 정수 연산으로
 * 이름 : 최형욱
 * 작성일 : 2023.12.28
 */
public class AccuracyExample1 {

	
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
	}

}
