import java.util.Scanner;

/* 선택제어문 - 자가진단4
 *   복싱체급은 몸무게가 
	50.80kg 이하를 Flyweight, 
	
	61.23kg 이하를 Lightweight, 
	
	72.57kg 이하를 Middleweight, 
	
	88.45kg 이하를 Cruiserweight, 
	
	88.45kg 초과를 Heavyweight
	
	라고 하자.
	 
	
	몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.

 * 
 */
public class SLECTION04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String grade = "Flyweight";
		
			System.out.println("몸무게를 입력하여 주세요(0은 종료)");
			int	weight = sc.nextInt();
			
			if(weight>88.45) grade = "Heavyweight";
			else if(weight>72.57) grade = "Cruiserweight";
			else if(weight>61.23) grade = "Middleweight";
			else if(weight>50.80) grade = "Lightweight";
			
			System.out.println("당신의 계급은 " + grade + "입니다.");
			System.out.println();
		}
		
		
 		
		
	
	}

