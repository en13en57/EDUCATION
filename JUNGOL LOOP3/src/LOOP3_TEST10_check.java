import java.util.Scanner;

/* 반복제어문3 - 형성평가10
 
 자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.

10 미만의 홀수만 출력하시오.

 

주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.

3

1 3 5
7 9 1
3 5 7
   
 
 */
public class LOOP3_TEST10_check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j;
		int odd = 1;
		for(i=0;i<n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(odd);
					odd=(odd+2)%10;
				}
			System.out.println();
			}
		
		sc.close();
	}
}
