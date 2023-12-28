package sub1;
/*
 * 
 * 날짜 : 2023/12/28
 * 이름 : 최형욱
 * 내용 : 배열 실습하기
 */
public class ArrayTest {

	public static void main(String[] args) {
		
		
		// 배열
		int[] arr1 = {1, 2, 3, 4, 5};
		char[] arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "공주"};
		
		
		// 원소 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		
		System.out.println("arr2[2] : " + arr2[2]);
		
		System.out.println("arr3[3] : " + arr3[3]);
		
		
		// 배열 길이
		System.out.println("arr1 원소갯수 : " + arr1.length);
		System.out.println("arr2 원소갯수 : " + arr2.length);
		System.out.println("arr3 원소갯수 : " + arr3.length);
		
		
		// 배열 반복문
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		for(int c=0; c<arr2.length; c++) {
			System.out.print(arr2[c] + " ");
		}
		System.out.println();
		
		for(char c : arr2) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		for(int s=0; s<arr3.length; s++) {
			System.out.print(arr3[s] + " ");
		}
		System.out.println();
		
		for(String s : arr3) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		
		// 1차원
		int[] scores = {80, 60, 78, 62,92};
		int total = 0;
		
		for(int i=0; i<scores.length;i++) {
			total += scores[i];
		}
		
		System.out.println("scores 전체합 : " + total);
		
		// 2차원
		int[][] arr2d = {{1, 2, 3, 4}, 
						{5, 6, 7, 8}, 
						{9, 10, 11, 12}};
		
		System.out.println("arr2d[0][2] : " + arr2d[0][2]);	// 3
		System.out.println("arr2d[1][0] : " + arr2d[1][0]);	// 5
		System.out.println("arr2d[2][2] : " + arr2d[2][2]);	// 11
		
		for(int a=0; a<3; a++) {
			
			for(int b=0; b<4; b++) {
				System.out.println("arr2d[" + a + "][" + b +"] : " + arr2d[a][b]);
			}
		}
		
		// 3차원
		int[][][] arr3d = {{{1, 2, 3}, 
							{4, 5, 6}, 
							{7, 8, 9}}, 
							{{10, 11, 12}, 
							{13, 14, 15}, 
							{16, 17, 18}},
							{{19, 20, 21}, 
							{22, 23, 24}, 
							{25, 26, 27}}};
		
		System.out.println("arr3d[][] : " + arr3d[0][1][1]); // 5
		System.out.println("arr3d[][] : " + arr3d[1][2][1]); // 17
		System.out.println("arr3d[][] : " + arr3d[2][2][0]); // 25
							
		for(int x=0; x<3; x++) {		
			for(int y=0; y<3; y++) {
				for(int z=0; z<3; z++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", x, y, z, arr3d[x][y][z]);
				}
			}
		}
		
	}

}
