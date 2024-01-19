package ch12.sec05;
/*
 * 날짜 : 2024/01/19
 * 이름 : 최형욱
 * 내용 : 12장 문자열 클래스
 */

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}
}
