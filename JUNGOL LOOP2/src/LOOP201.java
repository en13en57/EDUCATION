import java.util.Scanner;

/* 반복제어문2-자가진단1
 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.
 
 */
public class LOOP201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		word = sc.next();
		for(int i=0;i<20;i++) {
			System.out.print(word);
		}
		sc.close();
	}
}
