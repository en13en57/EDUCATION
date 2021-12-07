import java.util.Scanner;

/* 선택제어문 - 자가진단3
 * 나이를 입력받아 20살 이상이면 "adult"라고 출력하고
 * 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.
 * 
 * 
 */
public class SLECTION03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age, temp;
		age = sc.nextInt();
		temp = 20-age;
		if(age>=20) {
			System.out.println("adult");
			
		}else {
			System.out.println(temp + " years later");
		}
		
 		
		sc.close();
	
	}
}
