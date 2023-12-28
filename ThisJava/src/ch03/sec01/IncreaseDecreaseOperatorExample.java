package ch03.sec01;
/*
 * 장제목 : 3장 부호/증감 연산자
 * 이름 : 최형욱
 * 작성일 : 2023.12.28
 */
public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("-----------------------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("-----------------------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
