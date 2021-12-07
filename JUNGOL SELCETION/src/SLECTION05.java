import java.util.Scanner;

/* 선택제어문 - 자가진단5
	두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고
	력하는 프로그램을 작성하시오.
 * 
 */
public class SLECTION05 {
	public static void main(String[] args) {
		double a,b;
		String grade = "C";
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();	
		b = sc.nextDouble();
		if(a>=4.0 && b>=4.0) grade = "A";
		else if(a>=3.0 && b>=3.0) grade = "B";
		System.out.println("당신의 등급은 " + grade + "입니다.");
	}
}
