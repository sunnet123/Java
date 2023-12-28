package ch02.sec11;
/*
 * 장제목 : 2장 변수 사용 범위
 * 이름 : 최형욱
 * 작성일 : 2023.12.28
 */
public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;	// v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}

}
