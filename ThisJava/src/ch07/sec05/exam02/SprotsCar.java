package ch07.sec05.exam02;
/*
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : 7장 final 클래스와 final 메소드
 */
public class SprotsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
		
		//오버라이딩 할 수 없음
		/*
		@Override
		public void stop() {
			System.out.println("스포츠카를 멈춤");
			speed = 0;
		}
		*/
	}
}	
