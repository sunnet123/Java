package ch03.sec11;
/*
 * 장제목 : 3장 삼항(조건) 연산자
 * 이름 : 최형욱
 * 작성일 : 2024.01.02
 */
public class ConditionalOperationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
