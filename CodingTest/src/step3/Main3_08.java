package step3;

import java.util.Scanner;

public class Main3_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum = a + b;
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);
		}
	}
}
