import java.util.Scanner;

/* 반복제어문3 - 자가진단6
 
 자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.

3

ABC
DE
F


 */
public class LOOP305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		char word ='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
					System.out.printf("%c", word);
					word++;
				}
			System.out.println();
		}

		sc.close();
	}
}