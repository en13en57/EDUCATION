import java.util.Scanner;

/* 반복제어문2- 형성평가9

 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.

 

* 주의 

 ')'와 '('사이에 공백이 1칸 있다.
(1,_1) 처럼 출력한다 : '_'는 공백

 */
public class LOOP2_TEST09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++)
				System.out.printf("(%d, %d) ", i, j);
			System.out.println();
		}
		sc.close();
	 }
	}	