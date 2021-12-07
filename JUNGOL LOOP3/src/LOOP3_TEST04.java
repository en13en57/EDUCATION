import java.util.Scanner;

/* 반복제어문3 - 형성평가4
 자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.

주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.

3

*****
 ***
  *
 ***
***** 
 
 */
public class LOOP3_TEST04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i)*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
				
			}
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n-i-1;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i+3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
