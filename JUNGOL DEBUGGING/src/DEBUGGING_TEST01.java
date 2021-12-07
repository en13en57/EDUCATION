import java.util.Scanner;

/* 디버깅 - 형성평가1
 정수로 된 3과목의 점수를 입력받아 평균을 구한 후 반올림하여 소수 첫째자리까지 출력하는 프로그램을 작성하시오.

 */
public class DEBUGGING_TEST01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("3과목의 점수를 입력하여 주세요");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.printf("평균 : %.1f", (a+b+c)/3.0);
		
		
		
		sc.close();
	
	
	}
}
