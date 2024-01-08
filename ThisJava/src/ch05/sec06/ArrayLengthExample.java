package ch05.sec06;
/*
 * 장제목 : 5장 배열길이
 * 이름 : 최형욱
 * 작성일 : 2024.01.05
 */
public class ArrayLengthExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 대입
		int[] scores = {84, 90, 96};
		
		// 배열 항목의 총합 구하기
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		// 배열 항목의 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
