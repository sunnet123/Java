package test2;
/*
 * 
 * 날짜 : 2023/12/29
 * 이름 : 최형욱
 * 내용 : 자바 팩토리얼 재귀 메서드 연습문제
 */
public class Test08 {

	public static void main(String[] args) {
		
		System.out.println("3! = " + fatorial(3));
		System.out.println("4! = " + fatorial(4));
		System.out.println("5! = " + fatorial(5));
	}
	
	public static int fatorial(int n) {
		if(n <= 1)
		{
			return 1;
		}
		
		return n * fatorial(n-1);
	}

}
