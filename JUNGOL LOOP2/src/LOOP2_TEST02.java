import java.util.Scanner;

/* 반복제어문2- 형성평가2

100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.​

 */
public class LOOP2_TEST02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		for (; n1 <= n2; n1++) System.out.printf("%d ", n1);

		sc.close();
	}
}
