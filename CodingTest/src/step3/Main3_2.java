package step3;

import java.util.Scanner;

public class Main3_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i=0; i<count;i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int answer = num1 + num2;
			System.out.println(answer);
		}
	}
}
