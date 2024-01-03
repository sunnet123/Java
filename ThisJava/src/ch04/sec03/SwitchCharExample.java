package ch04.sec03;
/*
 * 장제목 : 4장 switch 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("손님입니다.");	
		}

	}

}
