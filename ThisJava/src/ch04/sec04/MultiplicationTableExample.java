package ch04.sec04;
/*
 * 장제목 : 4장 for 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class MultiplicationTableExample {
	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n <=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
	}
}
