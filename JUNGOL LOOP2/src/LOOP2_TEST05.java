import java.util.Scanner;

/* 반복제어문2- 형성평가5

10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 
출력하는 프로그램을 작성하시오.
 */
public class LOOP2_TEST05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even=0, odd=0;
		for(int i=1;i<=10;i++) {
			int a = sc.nextInt();
			a = a%2==0 ? even++ : odd++;
		}
		System.out.printf("even : %d\nodd : %d", even, odd);
		
	 }
	}	