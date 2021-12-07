import java.util.Scanner;

/* 반복제어문3 - 자가진단3
 
 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

3
 
***
**
*
*
**
***

 */
public class LOOP303 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		sc.close();
	}
}
