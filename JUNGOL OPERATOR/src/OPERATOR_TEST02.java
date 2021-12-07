import java.util.Scanner;

/* 연산자 - 형성평가2
 * 두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
 *  35 / 10 = 3...5
 */
public class OPERATOR_TEST02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
	
		System.out.printf("%d / %d = %d...%d", a, b, a/b, a%b);
		 
		
		sc.close();

	}
}
