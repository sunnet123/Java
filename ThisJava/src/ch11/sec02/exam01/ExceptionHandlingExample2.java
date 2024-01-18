package ch11.sec02.exam01;
/*
 * 날짜 : 2024/01/18
 * 이름 : 최형욱
 * 내용 : 11장 예외 처리 코드
 */

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		
		try {
			int result = data.length();		// data가 null일 경우 NullPointerException 발생
			System.out.println("문자 수 : " +result);
	
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
			//System.out.println(e.toString());   // 예외 정보를 얻는 3가지 방법
			//e.printStackTrace();
		}finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);		// 매개값으로 null을 대입
		System.out.println("[프로그램 종료]");
	}
	
}
