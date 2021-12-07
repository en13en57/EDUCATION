import java.util.Scanner;

/* 반복제어문2- 형성평가10

 2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.

단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.

구구단 사이의 공백은 3칸이다.

 */
public class LOOP2_TEST10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 < n2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = n1; j <= n2; j++) {
					System.out.printf("%d * %d = %2d", j, i, i*j);
				}
				System.out.println();
			}	
		}else {
			for (int i = 1; i <= 9; i++) {
				for (int j = n1; j >= n2; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, i*j);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}