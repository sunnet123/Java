package ch04.sec07;
/*
 * 장제목 : 4장 break 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
