import java.util.Scanner;

/* 반복제어문3 - 형성평가1
 정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 
 20개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.

평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)

 */
public class LOOP3_TEST01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, sum = 0, count = 0; 
		for(int i=0;i<20;i++) {
			n = sc.nextInt();
			if(n==0) break;
			sum += n;
			count++;
		}
		System.out.println(sum + " " + sum/count);
		sc.close();
	}
}
