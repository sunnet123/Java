package step2;

import java.util.Scanner;

public class Main2_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] dice = new int[3];
		
		for(int i=0; i<dice.length; i++) {
			dice[i] = sc.nextInt();
		}
		
		int prize;
		
		if(dice[0] == dice[1] && dice[1] == dice[2]) {
			
			prize = 10000 + dice[0]* 1000;
		}else if(dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
			
			prize = 1000 + dice[1] * 100;
		}else 
		{
			prize = dice[2] * 100;
		}
		
		System.out.println(prize);

	}

}
