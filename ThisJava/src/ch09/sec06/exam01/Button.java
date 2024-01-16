package ch09.sec06.exam01;
/*
 * 날짜 : 2024/01/16
 * 이름 : 최형욱
 * 내용 : 9장 중첩 인터페이스
 */
public class Button {
	//정적 중첩 인터페이스
	public static interface ClickListener{
		//추상 메소드
		void onClick();
	}
}
