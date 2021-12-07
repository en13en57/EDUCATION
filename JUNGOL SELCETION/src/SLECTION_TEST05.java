import java.util.Scanner;

/* 선택제어문 - 형성평가4

1~12사이의 정수를 입력받아 평년의 경우 입력받은 월을 입력받아 
평년의 경우 해당 월의 날수를 출력하는 프로그램을 작성하시오.


 */
public class SLECTION_TEST05 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		switch(a) {
		case 1 : 
			System.out.println("31");
			break;
		case 2 :
			System.out.println("28");
			break;
		case 3 :
			System.out.println("31");
			break;
		case 4 :
			System.out.println("30");
			break;
		case 5 :
			System.out.println("31");
			break;
		case 6 :
			System.out.println("30");
			break;
		case 7 :
			System.out.println("31");
			break;
		case 8 :
			System.out.println("31");
			break;
		case 9 :
			System.out.println("30");
			break;
		case 10 :
			System.out.println("31");
			break;
		case 11 :
			System.out.println("30");
			break;
		default :
			System.out.println("31");
			break;
	
		}
	
	}
}
