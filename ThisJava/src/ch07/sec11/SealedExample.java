package ch07.sec11;
/*
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : 7장 봉인된클래스
 */
public class SealedExample {
	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	}
}
