package ch06.sec08.exam04;
/*
 * 날짜 : 2024/01/08
 * 이름 : 최형욱
 * 내용 : 6장 메소드 오버로딩
 */
public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator myCalc = new Calculator();
		
		//정사각형 넓이 구하기
		double result1 = myCalc.areaRectangle(10);
		
		//직사각형 넓이 구하기
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
		
	}
}
