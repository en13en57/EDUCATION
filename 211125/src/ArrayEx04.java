/*
 * 3행 3열의 배열을 만들고
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 로 초기화한 후에 90도 180도 270도 회전시켜 출력하시오. 
 */

public class ArrayEx04 {
	public static void main(String[] args) {
		int row = 3, col = 3;
		int ar[][] = new int[row][col]; // C/C++과 다르게 배열 선언시 변수를 사용가능 하다

		// 초기화
		for (int i = 0; i < ar.length; i++)
			for (int j = 0; j < ar[i].length; j++)
				ar[i][j] = i * row + j + 1;

		System.out.println("원본");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++)
		
				/*
		 123 [0][0] [0][1] [0][2] 
		 456 [1][0] [1][1] [0][2] 
		 789 [2][0] [2][1] [2][2] 
		 같은줄에서 변경되는 값은 j로 만들어 주고 
		 행이 변하면서 변경되는 값은 i로 만들어준다.
		 
				 */
				
				
				System.out.printf("%3d", ar[i][j]);
			System.out.println();
		}
		System.out.println("90도 회전");
		/*
		 741 [2][0] [1][0] [0][0] 
		 852 [2][1] [1][1] [0][1] 
		 963 [2][2] [1][2] [0][2] 
		 같은줄에서 변경되는 값은 j로 만들어 주고 
		 행이 변하면서 변경되는 값은 i로 만들어준다.
		 
		 */
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++)
				System.out.printf("%3d", ar[row-j-1][i]);
			System.out.println();
		}
		System.out.println("90도 회전");
		/*
		 987 [2][2] [2][1] [2][0] 
		 654 [1][2] [1][1] [1][0] 
		 321 [0][2] [0][1] [0][0] 
		 같은줄에서 변경되는 값은 j로 만들어 주고 
		 행이 변하면서 변경되는 값은 i로 만들어준다.
		 
		 */
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++)
				System.out.printf("%3d", ar[row-i-1][row-j-1]);
			System.out.println();
		}
		System.out.println("90도 회전");
		/*
		 369 [0][2] [1][2] [2][2] 
		 258 [0][1] [1][1] [2][1] 
		 147 [0][0] [1][0] [2][0] 
		 같은줄에서 변경되는 값은 j로 만들어 주고 
		 행이 변하면서 변경되는 값은 i로 만들어준다.
		 
		 */
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++)
				System.out.printf("%3d", ar[j][row-i-1]);
			System.out.println();
		}
		}
}
