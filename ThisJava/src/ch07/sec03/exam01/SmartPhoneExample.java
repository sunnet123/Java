package ch07.sec03.exam01;
/*
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : 7장 부모 생성자 호출
 */
public class SmartPhoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		//Phone으로부터 상속받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	}
}
