package step3;

import java.util.Scanner;

public class Main3_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int bt = size/4;
		for(int i=0; i<bt; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
