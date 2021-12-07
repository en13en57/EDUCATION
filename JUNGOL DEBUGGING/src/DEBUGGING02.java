import java.util.Scanner;

/* 디버깅 - 자가진단2
 2개의 정수를 입력 받아서 첫 번째 수를 두 번째 수로 나눈 몫을 출력하고, 
 첫 번째 수를 실수로 변환하여 두 번째 수로 나눈 값을 구한 후 반올림하여 
 소수 둘째 자리까지 출력하는 프로그램을 작성하고,
 */
public class DEBUGGING02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("정수 2개를 입력하여 주세요");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.printf("첫째 수를 두번째 수로 나눈 몫 : %d 첫수 실수 변환 두번째수로 나눈 값 : %.2f", a/b, (double)a/b);
		
		
		
		sc.close();
	
	
	}
}
