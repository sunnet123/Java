package ch04.sec02;
/*
 * 장제목 : 4장 if문
 * 이름 : 최형욱
 * 작성일 : 2024.01.02
 */
public class IfElseExample {

	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
