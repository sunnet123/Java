package ch04.sec04;
/*
 * 장제목 : 4장 for 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
