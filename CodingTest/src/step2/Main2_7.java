package step2;

import java.util.Scanner;

public class Main2_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Hour = sc.nextInt();
		int Minute = sc.nextInt();
		int Cooking = sc.nextInt();
		
		int totalMinute = Hour * 60 + Minute + Cooking;
		int endHour = totalMinute / 60 % 24;
		int endMinute = totalMinute % 60;
		
		System.out.println(endHour + " " + endMinute);
	}
}
