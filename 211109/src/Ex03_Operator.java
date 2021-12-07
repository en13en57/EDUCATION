// 산술 연산자 : +, -, *, /, %
// 관계 연산자 : 연산의 결과가 논리값(true/false)이다.
//           조건문과 같이 사용된다.
//			 ==, !=, >, >=, <, <=
// 논리 연산자 : !(NOT), &&(AND), ||(OR)
// 삼항 연산자 : 연산 대상이 3개인 연산자
//  		 논리식 ? 참인경우값 : 거짓인 경우값

public class Ex03_Operator {

	public static void main(String[] args) {
		// 문제 : 1 ~ 100사이의 정수 중에서 5의 배수 또는 7의 배수만 출력 하시오
		int i = 1;
		while (i <= 100) {
			System.out.println(i % 5 == 0 || i % 7 == 0 ? i + " " : "");
			++i;
		}
		i = 1;
		while (i <= 100) {
			System.out.println(i % 5 == 0 && i % 7 == 0 ? i + " " : "");
			++i;
		}
	}
}
