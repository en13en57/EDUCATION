import java.util.Scanner;

/* 연산자 - 형성평가1
 * 국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서
 * 총점과 평균을 구하는 프로그램을 작성하시오.
 * (단 평균의 소수점 이하는 버림 한다.)
 */
public class OPERATOR_TEST01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.print("국어 점수 : ");
		a = sc.nextInt();
		System.out.print("영어 점수 : ");
		b = sc.nextInt();
		System.out.print("수학 점수 : ");
		c = sc.nextInt();
		System.out.print("컴퓨터 점수 : ");
		d = sc.nextInt();
	
		int sum = a+b+c+d;	
		double avg = sum/4;
		System.out.printf("합계 : %d\n평균 : %.0f", sum, avg);
		 
		
		sc.close();

	}
}
