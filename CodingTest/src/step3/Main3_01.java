package step3;

import java.util.Scanner;

public class Main3_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int gugudan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(gugudan + " * " + i + " = " + gugudan*i);
		}
	}
}
