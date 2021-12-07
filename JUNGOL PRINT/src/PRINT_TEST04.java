// 출력 - 형성평가 4
// 다음 출력 예와 같이 출력되는 프로그램을 작성하시오.
// 합계와 평균은 수식을 이용하세요. 
// kor 90
// mat 80
// eng 100
// sum 270
// avg 90






public class PRINT_TEST04 {
	public static void main(String[] args) {
		int kor = 90, mat = 80, eng = 100;
		int sum = kor + mat + eng;
		
		System.out.printf("kor %d\n", kor);
		System.out.printf("mat %d\n", mat);
		System.out.printf("eng %d\n", eng);
		System.out.printf("sum %d\n", sum);
		System.out.printf("avg %d\n", sum / 3);
	}

}
