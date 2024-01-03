package ch04.sec07;
/*
 * 장제목 : 4장 break 문 
 * 이름 : 최형욱
 * 작성일 : 2024.01.03
 */
public class BreakOutterExample {

	public static void main(String[] args) throws Exception{
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}

}
