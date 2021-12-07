import java.util.Scanner;

/* 반복제어문3 - 형성평가6
 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
 주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.

3



    1
   12
  123 
 
 */
public class LOOP3_TEST06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>=i+2;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
			}
		sc.close();
	}
}
