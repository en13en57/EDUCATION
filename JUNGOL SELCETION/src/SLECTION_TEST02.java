import java.util.Scanner;

/* 선택제어문 - 형성평가2

​정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.

 */
public class SLECTION_TEST02 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a>0) System.out.println("plus");
		else if(a<0) System.out.println("minus");
		else System.out.println("zero");
	}
	
	}

