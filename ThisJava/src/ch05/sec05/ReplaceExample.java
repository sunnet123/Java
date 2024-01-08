package ch05.sec05;
/*
 * 장제목 : 5장 문자열(String) 타입
 * 이름 : 최형욱
 * 작성일 : 2024.01.04
 */
public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
