package step3;

import java.util.Scanner;

public class Main3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			
			for(int j =1; j<= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
