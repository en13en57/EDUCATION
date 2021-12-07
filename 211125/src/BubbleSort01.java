import java.util.Arrays;
import java.util.Random;

public class BubbleSort01 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int ar[] = new int[10];
		for (int i = 0; i < ar.length; i++)
			ar[i] = rnd.nextInt(101); // 0~100사이의 난수로 초기화

		System.out.println("원본 : " + Arrays.toString(ar));

		// Bubble Sort
		for (int i = 0; i < ar.length - 1; i++) { // n-1회전 반복 (맨 마지막 남은건 비교할 필요가 없으므로)
			for (int j = 0; j < ar.length - 1 - i; j++) { // 회전된 이후 마지막은 이미 고정되므로 -i번
				if (ar[j] > ar[j + 1]) { // 자신과 바로 옆 비교
					int temp = ar[j]; // 임시변수 이용하여 왼쪽 수가 오른쪽보다 크면 서로 바꾸기
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}

			}
			System.out.println(i+1 + "회 : " + Arrays.toString(ar));
		
		}
		System.out.println("정렬 : " + Arrays.toString(ar));
	}

}
