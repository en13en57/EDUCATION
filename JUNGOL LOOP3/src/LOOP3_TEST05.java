import java.util.Scanner;

/* 반복제어문3 - 형성평가5
 자연수 n을 입력받아 "출력 예" 와 같이 n줄에 걸쳐 오른쪽으로 정렬된 삼각형이 출력되는
 프로그램을 작성하시오.
 주의!'*'과'*'사이에 공백이 없고 줄 사이에도 빈줄이 없다.
3



    *
  ***
***** 
 
 */
public class LOOP3_TEST05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>=2*i-n+3;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
				
			}
		sc.close();
	}
}
