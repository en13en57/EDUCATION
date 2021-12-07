import java.util.Scanner;

/* 반복제어문1 - 형성평가3
 * 
0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 첫째자리까지 출력한다.)
 */
public class LOOP1_TEST03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, count =0;
		while(true) {
			int i = sc.nextInt();
			if(i>100 || i<0) break;
				sum += i;
				count++;
		}
		System.out.printf("sum : %d\navg : %.1f", sum, sum/(float)count);
				
	}
}
