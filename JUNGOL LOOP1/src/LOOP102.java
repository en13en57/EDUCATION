import java.util.Scanner;

/* 반복제어문1 - 자가진단2
 100 이하의 양의 정수만 입력된다.
while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.
 
 */
public class LOOP102 {
	public static void main(String[] args) {
		int num;
		int i=1, sum=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
			while(i<=num) {
			sum += i;
			i++;
		}
			System.out.println(sum);
		sc.close();
				
	}
}
