import java.util.Scanner;

public class Ex04_OperatorJUNGOL01 {

	public static void main(String[] args) {
		// 세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
			// 1. 몇개의 정수가 필요할까? Scanner 객체, 입련변수 3개, 합계, 평균
			// 2. 변수를 선언하자
			Scanner sc = new Scanner(System.in); // Scanner 객체
			int i, j, k, sum, avg; // 입력변수 3개, 합계, 평균
			
			// 3. 세 개의 정수를 입력 받아서
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			
			// 4, 합계의 평균을 출력하시오.
			sum = i + j + k;
			avg = sum / 3;
			System.out.println("sum : " + sum);
			System.out.println("avg : " + avg);
			
			sc.close();
	}
}