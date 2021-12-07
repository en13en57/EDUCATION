import java.util.Scanner;

/* 디버깅 - 자가진단1
 2개의 실수(double)를 입력 받아서 두 수의 곱을 정수로 변환한 결과값과
 두 수를 각각 정수로 변환하여 곱을 구한 결과값을 출력하는 프로그램을 작성하고 
 프로그램 내용에 관한 설명을 주석으로 표시하시오.
 */
public class DEBUGGING01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("실수 2개를 입력하여 주세요");
		a = sc.nextDouble();
		b = sc.nextDouble();
		int c = (int)a;
		int d = (int)b;
		System.out.println((int)(a*b) + " " + c*d);
		// 출력 값 둘중 왼쪽 값은 입력받은 두수의 곱셈을 정수로 변환한 결과값이고,
		// 			오른쪽은 입력받은 두수를 먼저 정수로 변환하여 곱셈을 한 결과 값이다.
		
		
		
		sc.close();
	
	
	}
}
