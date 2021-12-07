import java.util.Arrays;

/*
 * 3행 4열의 배열을 만들고
 * 1  2  3  4 [0][0] [0][1] [0][2] [0][3]
 * 5  6  7  8 [1][0] [1][1] [1][2] [1][3]
 * 9 10 11 12 [2][0] [2][1] [2][2] [2][3]
 * 로 초기화한 후에 출력하시오 
 *
 *
 */

public class practice {
	public static void main(String[] args) {
		int row = 3, col = 4;
		int ar[][] = new int[row][col]; // C/C++과 다르게 배열 선언시 변수를 사용가능 하다

		System.out.println(Arrays.deepToString(ar));

		for (int i = 0; i < ar.length; i++)
			for (int j = 0; j < ar[i].length; j++)
				ar[i][j] = i * row + j + 1; // [0][0], [0][1], [0][2], [0][3] ....

		System.out.println(Arrays.deepToString(ar));
		
		arrayPrint(ar);

		for (int i = 0; i < ar.length; i++)
			for (int j = 0; j < ar[i].length; j++)
				ar[j][i] = i * (col-1) + j + 1; // // [0][0], [1][0], [2][0], [3][0] ....

		/* 1  4  7  10 
		 * 2  5  8  11
		 * 3  6  9  12
		 */
		
		
		
		
		arrayPrint(ar);
	}

	private static void arrayPrint(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%3d ", ar[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
