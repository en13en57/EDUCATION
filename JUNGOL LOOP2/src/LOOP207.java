import java.util.Scanner;

/* 반복제어문2-자가진단7

아래와 같이 출력되는 프로그램을 작성하시오

2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10

 */
public class LOOP207 {
	public static void main(String[] args) {
		for(int i= 1; i<6;i++) {
			for(int j=i+1;j<=i+5;j++)
				System.out.print(j + " ");
			System.out.println();
		}
	}
}
