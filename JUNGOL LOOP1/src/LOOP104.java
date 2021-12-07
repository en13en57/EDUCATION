import java.util.Scanner;

/* 반복제어문1 - 자가진단4

 정수를 계속 입력받다가 100 이상의 수가 입력이 되면 
 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.

 (평균은 반올림하여 소수 첫째자리까지 출력한다.)

 */
public class LOOP104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int sum = 0,count = 0;
		while(true) {
			i = sc.nextInt();
			sum += i;
			count ++;
			if(i>=100) break; 
		}
		System.out.printf("%d\n%.1f", sum, sum/(float)count);	
				
	}
}
