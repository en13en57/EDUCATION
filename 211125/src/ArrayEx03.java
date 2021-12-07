import java.util.Arrays;

/*
 * 3행 3열의 배열을 만들고
 * 
 * 1   2   3   4   5 
  10   9   8   7   6 
  11  12  13  14  15 
  20  19  18  17  16 
  21  22  23  24  25 
 *
 * 
 * 
 * 
 * * 로 초기화한 후에 출력하시오 
 */

public class ArrayEx03 {
	public static void main(String[] args) {
		int row = 5, col = 5;
		int ar[][] = new int[row][col]; // C/C++과 다르게 배열 선언시 변수를 사용가능 하다

		for (int i = 0; i < ar.length; i++)
			for (int j = 0; j < ar[i].length; j++)
				//  원래는 ar[i][j] = i * row + j + 1;
				
				// 짝수행은 늘어나고 홀수행은 줄어든다.
				ar[i][j] = i%2==0 ? i*row + j + 1 : (i+1)*row-j; // 첫째행을 홀수 짝수로 나누어 true false로 +1 -1 하여줌
			
		// 짝수 행의 경우
		// i의 값  : 0   2   4 행 값이 늘어난다. + j
		// 만들 값 : 1  11  21
		// 공식    : i * 행값 + 1
		// 값이 늘어 나야 하므로 늘어나는 j값을 더해준다.
		
		// 홀수 행의 경우
		// i의 값  : 1    3   행 값이 늘어난다. + j
		// 만들 값 : 10  20   
		// 공식    : (i+1) * 행값
		// 값이 줄어 들어야 하므로 늘어나는 j값을 빼준다.
		
		arrayPrint(ar);

		for (int i = 0; i < ar.length; i++)
			for (int j = 0; j < ar[i].length; j++)
				// 짝수열은 늘어나고 홀수열은 줄어든다.
				ar[j][i] = i%2==0 ? i*col + j + 1 : (i+1)*col-j;
				
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
