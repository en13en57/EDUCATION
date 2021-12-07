import java.util.Scanner;

/* 반복제어문2- 형성평가4

100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)
 */
public class LOOP2_TEST04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x;
		float avg = 0;
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			x = sc.nextInt();
			avg += x;
		}
		avg /= (float)n;
		System.out.printf("%.2f", avg);
		
	 }
	}	