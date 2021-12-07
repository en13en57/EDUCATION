import java.util.Scanner;

/* 반복제어문2- 형성평가6

두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 
수들의 합과 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 첫째자리까지 출력한다.)
 */
public class LOOP2_TEST06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int i = 0;
		if(a>b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for(;a<=b;a++) {
			if(a%3==0 || a%5==0) {
				sum += a;
				i++;
			}
		}
		System.out.printf("sum : %d\navg : %.1f", sum, (float)sum/(float)(i));
		sc.close();
	 }
	}	