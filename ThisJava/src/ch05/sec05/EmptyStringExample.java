package ch05.sec05;
/*
 * 장제목 : 5장 문자열(String) 비교
 * 이름 : 최형욱
 * 작성일 : 2024.01.04
 */
public class EmptyStringExample {
	public static void main(String[] args) {
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}
	}
}
