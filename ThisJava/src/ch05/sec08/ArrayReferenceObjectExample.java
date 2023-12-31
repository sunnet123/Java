package ch05.sec08;
/*
 * 장제목 : 5장 객체를 참조하는 배열
 * 이름 : 최형욱
 * 작성일 : 2024.01.05
 */
public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);// true: 같은 객체 참조
		System.out.println(strArray[0] == strArray[2]);// false: 다른 객체 참조
		System.out.println(strArray[0].equals(strArray[2]));// true: 문자열이 동일
	}
}
