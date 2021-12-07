import java.util.Scanner;

/* 반복제어문2-자가진단6

10 이하의 과목수 n이 주어진다.

정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고 

평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.


평균은 반올림하여 소수 첫째자리까지 출력한다.​
 
 */
public class LOOP206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float avg=0;
		for(int i=1;i<=n;i++) {
			if(n>10) break;
			int score = sc.nextInt();
			avg += score;
		}
		avg /=(float)n;
		System.out.printf("avg : %.1f\n", avg);
		if(avg>=80) System.out.println("pass");
		else System.out.println("fail");
		
		
		
		
		
		sc.close();
	}
}
