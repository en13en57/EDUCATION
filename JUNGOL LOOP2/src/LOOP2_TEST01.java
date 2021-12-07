import java.util.Scanner;

/* 반복제어문2- 형성평가1

10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.​

 */
public class LOOP2_TEST01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 1; i<=n;i++) {
			if(n<=0) break;
			System.out.println("JUNGOL");
		}
		sc.close();
	}
}
