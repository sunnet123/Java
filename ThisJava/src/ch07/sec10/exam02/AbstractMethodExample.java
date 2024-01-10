package ch07.sec10.exam02;
/*
 * 날짜 : 2024/01/10
 * 이름 : 최형욱
 * 내용 : 7장 추상메소드와 재정의
 */
public class AbstractMethodExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
		
	public static void animalSound(Animal animal) {
		animal.sound();
		
	}
}
