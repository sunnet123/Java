package ch11.sec05;
/*
 * 날짜 : 2024/01/18
 * 이름 : 최형욱
 * 내용 : 11장 예외 떠넘기기
 */
public class ThrowsExample1 {
	public static void main(String[] args) {
		try {
			findClass();
		}catch (ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
