import java.util.Calendar;

public class CalEx02 {
	// Calendar클래스만을 이용하여 이번달 달력 출력하기
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// 1. 년/월
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		// 2. 1일의 요일
		cal.set(Calendar.DATE, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK)-1;
		// 3. 마지막 날짜
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		// 4. 이제 출력해보자
		// 년월을 출력
		System.out.printf("%18d년 %02d월\n\n", year, month);
		// 요일 출력
		System.out.println("   일   월   화   수   목   금   토");
		// 1일의 요일을 맞추기 위해 앞에 공백을 출력하자
		for(int i=0;i<week;i++)
			System.out.print("     ");
		// 1일부터 마지막 날짜까지 출력한다. 단, 토요일이면 줄바꾼다.
		for(int i=1;i<=lastDay;i++) {
			// 날짜 출력
			System.out.printf("%5d", i);
			// 출력한 날짜의 요일을 구해서 토요일이면 줄바꿈
			cal.set(Calendar.DATE, i);
			week = cal.get(Calendar.DAY_OF_WEEK)-1;
			if(week==6) System.out.println();
		}
		
	}
}
