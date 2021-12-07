import java.util.Scanner;

/* 반복제어문2- 형성평가8

행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
 
 3 4
 
 1 2 3 4
 2 4 6 8
 3 6 9 12
 
 */
public class LOOP2_TEST08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++)
				System.out.print(i*j + " ");
			System.out.println();
		}
		sc.close();
	 }
	}	