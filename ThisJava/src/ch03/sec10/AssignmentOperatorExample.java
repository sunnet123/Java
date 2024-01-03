package ch03.sec10;
/*
 * 장제목 : 3장 대입 연산자
 * 이름 : 최형욱
 * 작성일 : 2024.01.02
 */
public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result="+result);
		result -= 5;
		System.out.println("result="+result);
		result *= 3;
		System.out.println("result="+result);
		result /= 5;
		System.out.println("result="+result);
		result %= 3;
		System.out.println("result="+result);
	}

}
