package step3;

import java.util.Scanner;

public class Main3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count;
		int sum = 0;
		for(count=0; count<=n; count++) {
			
			sum += count;
		}
		System.out.println(sum);
		
		
	}
}
