import java.util.Scanner;

/* 연산자 - 형성평가3
 * 직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후
 *  가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후
 *  가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
 */
public class OPERATOR_TEST03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width, length;
		System.out.println("가로 길이");
		width = sc.nextInt();
		width += 5;
		System.out.println("세로 길이");
		length = sc.nextInt();
		length *= 2;
		System.out.printf("width = %d\nlength = %d\narea = %d", width, length, width*length);
		 
		
		sc.close();

	}
}
