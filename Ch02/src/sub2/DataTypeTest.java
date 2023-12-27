package sub2;

/*
 * 
 * 날짜 : 2023/12/26
 * 이름 : 최형욱
 * 내용 : Java 자료형 실습하기
 * 
 * 자료형(Data Type)
 * - 변수에 저장되는 데이터의 종류와 크기를 나타내는 키워드
 * - 자료형은 기본형과 참조형으로 구분
 */
public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형
		byte 	num1 = 127;  // 1byte = 8bit
		short 	num2 = 32767;
		int 	num3 = 2147483647;
		long 	num4 = 922337203685477507L;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
		// 실수형
		float	var1 = 0.123456789f; // float 8자리
		double	var2 = 0.12345678912345678; // double 17자리
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		// 논리형
		boolean value1 = true; 		// 1
		boolean value2 = false;  	// 0
		
		System.out.println("value1 : " +value1);
		System.out.println("value2 : " +value2);
		
		// 문자형
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 문자열
		String str1 = "A"; 		// String 참조형 = 객체
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
	}

}
