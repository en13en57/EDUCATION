import java.util.Scanner;

/* 연산자 - 형성평가4
 *  두 정수를 입력받아 첫 번째 수는 전치증가연산자를 사용하고
 *  두 번째 수는 후치감소연산자를 사용하여 출력하고 바뀐 값을 다시 출력하는 프로그램을 작성하시오.
 *  
 */
public class OPERATOR_TEST04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(++a+" "+b--);
		System.out.print(a+" "+b);
		 
		
		sc.close();

	}
}
