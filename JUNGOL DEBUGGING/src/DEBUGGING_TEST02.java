import java.util.Scanner;

/* 디버깅 - 형성평가2
 실수로 된 3과목의 점수를 입력받아 총점은 정수부분의 합계를 출력하고
 평균은 실수의 평균을 구한 뒤 정수부분만 출력하는 프로그램을 작성하시오.
 */
public class DEBUGGING_TEST02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("3과목의 점수를 입력하여 주세요");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		int sum = (int)a+(int)b+(int)c;
		System.out.printf("sum : %d\navg : %.0f", sum, (a+b+c)/3.0);
		
		
		
		sc.close();
	
	
	}
}
