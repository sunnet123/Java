package ch05.sec05;
/*
 * 장제목 : 5장 문자열 잘라내기
 * 이름 : 최형욱
 * 작성일 : 2024.01.04
 */
public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815-123467";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
