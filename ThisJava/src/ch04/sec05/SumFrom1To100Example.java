package ch04.sec05;
/*
 * 장제목 : 4장 while 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class SumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
