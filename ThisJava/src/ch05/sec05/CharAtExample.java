package ch05.sec05;
/*
 * 장제목 : 5장 문자 추출
 * 이름 : 최형욱
 * 작성일 : 2024.01.04
 */
public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "9606241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}
}
