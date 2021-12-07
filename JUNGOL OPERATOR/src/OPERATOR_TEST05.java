import java.util.Scanner;

/* 연산자 - 형성평가5
 *  민수와 기영이의 키와 몸무게를 입력받아 
 *  민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
 *  (JAVA는 1 이면 true, 0 이면 false를 출력한다.)
 */
public class OPERATOR_TEST05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("민수의 키");
		int mheight = sc.nextInt();
		System.out.println("민수의 몸무게");
		int mweight = sc.nextInt();
		System.out.println("기영의 키");
		int kheight = sc.nextInt();
		System.out.println("기영의 몸무게");
		int kweight = sc.nextInt();
		
		boolean a = (mheight>kheight) && (mweight>kweight);
		
		System.out.println(a);
		 
		
		sc.close();

	}
}
