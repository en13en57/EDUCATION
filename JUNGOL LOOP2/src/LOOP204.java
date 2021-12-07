import java.util.Scanner;

/* 반복제어문2-자가진단4

 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
 
 */
public class LOOP204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = n; i <= 100; i++) {
			if(n>100) break;
			sum += i;
		}
		System.out.print(sum);
		sc.close();
	}
}
