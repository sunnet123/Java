package step1;

import java.util.Scanner;

public class Main1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result1 = a * (b % 10); // 일의 자리 곱셈
        int result2 = a * ((b / 10) % 10); // 십의 자리 곱셈
        int result3 = a * (b / 100); // 백의 자리 곱셈
        int finalResult = a * b; // 최종 결과

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(finalResult);
	}

}
