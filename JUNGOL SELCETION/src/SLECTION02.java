import java.util.Scanner;

/* 선택제어문 - 자가진단2
 * “몸무게+100-키”를 비만수치 공식이라고 하자.
 * 키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고,
 * 비만수치가 0보다 크면 다음줄에 비만("Obesity")이라는 메시지를 출력하는 프로그램을 작성하시오.
 * 
 * 
 */
public class SLECTION02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height, weight;
		height = sc.nextInt();
		weight = sc.nextInt();
		if(height<=0 || weight<=0) {
			System.out.println("어떻게 키랑 몸무게가 0보다 작냐?");
			
		}
			System.out.println("비만수치 : " + (weight+100-height));
			if((weight+100-height)>0) {
				System.out.println("Obesity");
			}
		
		
 		
		sc.close();
	
	}
}
