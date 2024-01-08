package ch05.sec04;
/*
 * 장제목 : 5장 null과 NullPointerException 
 * 이름 : 최형욱
 * 작성일 : 2024.01.04
 */
public class NullPointerExceptionExample {
	public static void main(String[] args) {
		int[] intArray = null;
		//intArray[0] = 10;	//NullPointerException
		
		String str = null;
		//System.out.println("총 문자 수 : " + str.length()); 	//NullPointerException
	}
}
