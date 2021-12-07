import java.util.Scanner;

/* 선택제어문 - 자가진단6
	남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
	성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), 
 	"BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
 
 */
public class SLECTION06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = sc.next();
		int age = sc.nextInt();
		if(gender.equals("M") && age >= 18) System.out.println("MAN");
		if(gender.equals("M") && age < 18) System.out.println("BOY");
		if(gender.equals("F") && age >= 18) System.out.println("WOMAN");
		if(gender.equals("F") && age < 18) System.out.println("GIRL");
	
	
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