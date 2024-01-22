package step2;

import java.util.Scanner;

public class Main2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 시간(H) 입력
        int H = scanner.nextInt();

        // 분(M) 입력
        int M = scanner.nextInt();

        // 알람 시간 계산
        int total = H * 60 + M;  // 입력 받은 시간을 분 단위로 변환
        int adjust = total - 45;  // 45분을 빼줌

        if (adjust < 0) {
        	adjust += 24 * 60;  // 음수일 경우 24시간(1440분)을 더해줌
	    }

	    int adjustHours = adjust / 60;
	    int adjustedMinutesInHour = adjust % 60;

	    System.out.println(adjustHours + " " + adjustedMinutesInHour);

	    scanner.close();
    }
}