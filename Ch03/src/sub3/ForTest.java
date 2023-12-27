package sub3;

import java.util.Scanner;

/*
 * 
 * 날짜 : 2023/12/27
 * 이름 : 최형욱
 * 내용 : Java 반복문 for 실습하기
 */
public class ForTest {

	public static void main(String[] args) {
		
		
		// for
		for(int i=1; i<=5; i++) {
			System.out.println("i : " + i);
		}
		// 1부터 10까지 합
		int sum = 0;
		for(int k=1 ; k<=10; k++) {
			sum += k;
		}
		System.out.println("1부터 10까지 합 : " + sum);
		// 1부터 10까지 짝수합
		int sum1 = 0;
		for(int k=0; k<=10; k++) {
			if(k%2==0) {
				sum1 += k;
			}
		}
		System.out.println("1부터 10까지 합 : " + sum1);
		
		// for 중첩
		for(int a=1; a<=3; a++) {
			
			System.out.println("a : " + a);
			
			for(int b=1; b<=5; b++) {
				
				System.out.println("b : " + b);
			}
		}
		
		// 구구단
		for(int x=1; x<=9; x++) {
			
			System.out.println(x+"단");
			
			for(int y=1; y<=9; y++) {
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z);
			}
			System.out.println();
			
		}
		// 별삼각형
		for(int start=10; start >= 1; start--) {
			
			for(int end=1; end <= start; end++) {
				
				System.out.print("★");
			}
			System.out.println();
		}
		/*System.out.print("입력할 숫자 : " );
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			for(int j=N-1; j>i; j--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("★");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
	}

}
