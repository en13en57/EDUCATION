import java.util.Scanner;

/* 선택제어문 - 자가진단7

영문 대문자를 입력받아 

'A'이면 “Excellent”, 

'B'이면 “Good”, 

'C'이면 “Usually”, 

'D'이면 “Effort”, 

'F'이면 “Failure”, 

그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
	
 */
public class SLECTION07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		if(word.equals("A")) System.out.println("Excellent");
		else if(word.equals("B")) System.out.println("Good");
		else if(word.equals("C")) System.out.println("Usually");
		else if(word.equals("D")) System.out.println("Effort");
		else if(word.equals("F")) System.out.println("Failure");
		else System.out.println("error");

	
	}
}

/*
import java.util.*;

public class Main {
 public static void main(String[] args) {
  String s;
  int age;
     Scanner sc = new Scanner(System.in);
     s = sc.next();
     age = sc.nextInt();
  if (s.equals("F")  && age >= 18) System.out.println("WOMAN");
  if (s.equals("F") && age < 18) System.out.println("GIRL");
  if (s.equals("M") && age >= 18) System.out.println("MAN");
  if (s.equals("M") && age < 18) System.out.println("BOY");
 }
}
*/