package ch11.sec05;
/*
 * 날짜 : 2024/01/18
 * 이름 : 최형욱
 * 내용 : 11장 예외 떠넘기기
 */
public class ThrowsExample2 {
	public static void main(String[] args) throws Exception{
		
		findClass();
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class.forName("java.lang.String2");
	}
}
