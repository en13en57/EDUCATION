import java.util.Scanner;

/* 선택제어문 - 자가진단9

​3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 
수들 중 최소값을 출력하는 프로그램을 작성하시오.
 

 */
public class SLECTION09 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int temp = a>b ? b:a;
		temp = temp>c ? c:temp;
			System.out.println(temp);
		}
	
	}

