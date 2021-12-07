import java.util.Scanner;

/* 반복제어문3 - 형성평가7
 자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
 주의! 문자는 공백으로 구분하되 줄사이에 빈줄은 없다.

3

   ABC
   DE0
   F12
   
   
 
 */
public class LOOP3_TEST07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		char a = 'A';
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(a++);
			}
			for(int k=0;k<i;k++) {
				System.out.print(num++);
			}
			System.out.println();
			}
		sc.close();
	}
}
