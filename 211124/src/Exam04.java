import java.util.Scanner;

/*
 * 주민번호 유효성 검사 하기
 *---------------------------
 * 생년월일-성별-지역번호-일련번호-체크번호
 * 
 * 000000 - 000000X
 * 
 * 1. 앞의12개자리에 각각 2 3 4 5 6 7 8 9 2 3 4 5를 곱한 합을 구한다.
 * 2. 합을 11로 나눈 나머지를 구한다.
 * 3. 나머지를 11에서 뺀다.
 * 4. 3의 결과를 10으로 나눈 나머지를 구한다.
 * 5. 4의 결과와 13번째 자리의 값이 같으면 맞는 주민번호이다.
 *
 *
 */
public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("사업자 번호를 입력하시오(-없이, 0은 종료)");
			String jj = sc.nextLine();
			if(jj.equals("0")) break;
			if(jj.length()!=10) {
				System.out.println(" 10자리가 아닙니다. 다시 입력하시오");
				continue;
			}
			try {
				Long.parseLong(jj); // 입력값을 숫자로 변경
			}catch (Exception e) {
				System.out.print("숫자가 아닌 문자가 있습니다");
				continue;

			}
			// 여기까지 내려오면 숫자로만 10자리 입력이 보장된다.
			String mask = "137137135"; // 규칙적이지 않으므로 그냥 입력해서 빼온다.
			int sum = 0;
			for(int i=0;i<jj.length()-1;i++) {
				sum += (jj.charAt(i) - '0') * (mask.charAt(i) - '0');
				// '1' - '0' = 1
				//  1 + '0' = '1'
				//System.out.println((jj.charAt(i) - '0') + " * " + (mask.charAt(i) - '0') + " = "
				//					+ ((jj.charAt(i) - '0') * (mask.charAt(i) - '0')));
			}
			// 마지막에서 두번째 숫자인 7에 5를 곱하고 10으로 나누어 나온 값의 몫을 더한다.
			sum += (jj.charAt(8)-'0')*5/10;
			// 10으로 나누어 나머지만 취한다.
			sum %= 10;
			// 마지막 단계로 매직키인 10에서 나머지를 빼면
			
			sum = 10 - sum;
			
			if(sum == jj.charAt(9)-'0') {
				System.out.println("맞는 사업자 번호");
			}else {
				System.out.println("틀린 사업자 번호");
			}
		
		}
		sc.close();
		// 217-81-36347 : 그누보드 사업자 번호
		// 220-81-62517 : 네이버 사업자 번호
	}
}
