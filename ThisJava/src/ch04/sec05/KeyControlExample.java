package ch04.sec05;

import java.util.Scanner;	// Scanner를 사용하기 위해 필요
/*
 * 장제목 : 4장 while 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class KeyControlExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// Scanner생성
		boolean run = true;	// while 문의 조건식을 위한 변수 선언
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1. 종속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------");
			System.out.print("선택: ");
			
			String strNum = sc.nextLine();	// 키보드에서 입력한 내용을 읽음
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = " +speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;	// while문의 조건식을 false로 만듦
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
