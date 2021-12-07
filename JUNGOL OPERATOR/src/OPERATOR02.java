import java.util.Scanner;

/* 연산자 - 자기진단2
 * 정수 2개를 입력받아서 첫 번째 수에는 100을 증가시켜 저장하고 
 * 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성하시오.
 * 
 */
public class OPERATOR02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a+100 + " " + b%10);

/*		/public class OPERATOR02 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int a, b;
				a = sc.nextInt();
				b = sc.nextInt();
				a += 100;
				b %= 10;
				System.out.println(a + " " + b);
				
*/				sc.close();
	}
}
