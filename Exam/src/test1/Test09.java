package test1;

/*
 * 
 * 날짜 : 2023/12/28
 * 이름 : 최형욱
 * 내용 : 자바 반복문 연습문제
 */
public class Test09 {

	public static void main(String[] args) {
	
		int count = 0;
		
		for(int i=1; i<=9; i++) {
			if(i<=5) {
				count = i;	// i값이 5이하인 경우 : count 변수는 i값과 같은 값을 가짐
			} else {
				--count;	// i값이 5를 넘어가는 경우: count 변수는 1씩 감소
			}
			
			for(int j=1; j<=5-count; j++) {
				System.out.print(" ");	// 왼쪽 공백
			}
			
			for(int k=1; k<=2*count-1; k++) {
				System.out.print("*");	// 별 출력
			}
			
			System.out.print("\n");	// 줄바꿈
		}
	}

}
