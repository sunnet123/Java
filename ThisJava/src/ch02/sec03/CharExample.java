package ch02.sec03;
/*
 * 장제목 : 2장 문자타입
 * 이름 : 최형욱
 * 작성일 : 2023.12.27
 */
public class CharExample {

	public static void main(String[] args) {
		char c1 = 'A';		// 문자 저장
		char c2 = 65;		// 유니코드 직접 저장
		
		char c3 = '가';		// 문자 저장
		char c4 = 44032;	// 유니코드 직접 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
