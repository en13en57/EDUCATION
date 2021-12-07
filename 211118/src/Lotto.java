import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> lotto = new TreeSet<Integer>(); // 중복을 허락하지 않으면서 정렬을 지원하는 집합
		Scanner sc = new Scanner(System.in);
		System.out.print( "몇게임?");
		int game = sc.nextInt();
		while(game>0 ) { // 입력한 수 만큼 반복
			lotto.clear(); // 지우기
			while(lotto.size()<6) { // 안에 들어간 개수가 6보다 적은동안 반복
				lotto.add(random.nextInt(45)+1); // 1~45 사이의 난수를 넣는다.
			}
			System.out.println(lotto); // 출력
			game--; // 반복횟수 감소
		}
		sc.close();
	}
}
