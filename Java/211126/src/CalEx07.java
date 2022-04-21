import kr.green.util.MyDateUtil;

public class CalEx07 {
	public static void main(String[] args) {
		for (int j = 2000; j <= 2001; j++) {
			for (int i = 1; i <= 12; i++) {
				System.out.print(i + " : " + MyDateUtil.getLastDay(j, i));
				System.out.println(" : " + MyDateUtil.getLastDay2(j, i));
			}
		}
	}
}
