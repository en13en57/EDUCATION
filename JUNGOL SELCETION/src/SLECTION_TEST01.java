import java.util.Scanner;

/* 선택제어문 - 형성평가1

​두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.

 */
public class SLECTION_TEST01 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b) System.out.println(a-b);
		else System.out.println(b-a);
	}
	
	}

