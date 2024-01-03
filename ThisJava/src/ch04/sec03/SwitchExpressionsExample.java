package ch04.sec03;
/*
 * 장제목 : 4장 switch 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class SwitchExpressionsExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
			}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
			}
		default -> {
			System.out.println("손님입니다.");
			}
		}
		
		switch(grade) {
			case 'A', 'a' -> System.out.println("우수 회원입니다."); // 중괄호 안에 실행문이 하나만 있을 경우에는 중괄호를 생략할 수 있다.
			case 'B', 'b' -> System.out.println("일반 회원입니다."); 
			default -> System.out.println("손님입니다."); 
		}

	}

}
