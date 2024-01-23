package step3;

import java.util.Scanner;

public class Main3_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		int count = sc.nextInt();
		int sum = 0;
		int totalcost = 0;
		for(int i = 0; i < count; i++) {
			int cost = sc.nextInt();
			int number = sc.nextInt();
			
			totalcost = cost * number;
			sum += totalcost;
		}
		
		if(sum == total) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
