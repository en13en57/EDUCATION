import java.util.Scanner;

/* 반복제어문1 - 형성평가2
 0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.

0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여

홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.
 */
public class LOOP1_TEST02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even=0, odd=0;
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			n = (n%2==0) ? even++ : odd++;
		}
		System.out.println(" 짝수 개수 : " + even + " 홀수 개수 : " + odd);
				
	}
}
