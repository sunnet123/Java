package ch09.sec07.exam02;
/*
 * 날짜 : 2024/01/17
 * 이름 : 최형욱
 * 내용 : 9장 익명 객체
 */
public class HomeExample {
	public static void main(String[] args) {
		
		//Home객체 생성
		Home home = new Home();
		
		//익명 구현 객체가 대입된 필드 사용
		home.use1();
		
		//익명 구현 객체가 대입된 로컬 변수
		home.use2();
		
		//익명 구현 객체가 대입된 매개변수 사용
		home.use3(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("난방을 끕니다.");
				
			}
			
		});
	}
}
