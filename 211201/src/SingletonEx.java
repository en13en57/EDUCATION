import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


// 장점
// 안드로이드 앱 같은 경우 각 액티비티나 클래스별로 주요 클래스들을 일일이 전달하기가 번거롭기 때문에 
// 싱글톤 클래스를 만들어 어디서나 접근하도록 설계하는 것이 편하기 때문...

// 1. 인스턴스가 절대적으로 한개만 존재하는 것을 보증하고 싶을 경우 사용.
// 2. 두 번째 이용시부터는 객체 로딩 시간이 현저하게 줄어 성능이 좋아지는 장


// 단점
// 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유시킬 경우
// 다른 클래스의 인스턴스들 간에 결합도가 높아져 "개방-폐쇄 원칙" 을 위배하게 된다.
// (=객체 지향 설계 원칙에 어긋남)

// 따라서 수정이 어려워지고 테스트하기 어려워진다.


// 싱글톤 디자인 패턴 : 프로그램 내에서 객체를 1개만 만들어 재사용하는 방법
class Singleton{
	// 1. 자신의 객체를 정적 멤버로 가진다.
	private static Singleton instance = new Singleton();
	// 2. 밖에서 객체를 생성하지 못하도록 생성자를 private으로 만든다.
	private Singleton() {}
	// 3. 밖에서 객체를 사용할(얻을) 수 있는 정적 메서드를 만들어 준다.
	public static Singleton getInstance() {
		return instance;
	}
	//--------------------------------------------------------------------
	

}
class Some{
	
}
public class SingletonEx {
	public static void main(String[] args) {
			// Singleton s1 = new Singleton(); // 에러! 생성자가 private이다. 호출할 수 없다.

			Singleton s1 = Singleton.getInstance();
			Singleton s2 = Singleton.getInstance();
			Singleton s3 = Singleton.getInstance();
	
			// 해시코드란? 자바가상머신(JVM)이 객체를 구분하기 위하여 붙이는 일련번호
			// 아래 3개의 해시코드가 모두 동일하다는것은 세개가 모두 객체 1개를 공유한다.
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s3.hashCode());
			System.out.println();
			// 일반적인 클래스는 객체마다 고유한 해시코드값을 가진다.
			Some some1 = new Some();
			Some some2 = new Some();
			System.out.println(some1.hashCode());
			System.out.println(some2.hashCode());
	
			
			Date date1 = new Date();
			Date date2 = new Date(1,2,3);
			Calendar calendar1 = Calendar.getInstance();
			Calendar calendar2 = Calendar.getInstance();
	
			System.out.println(date1.hashCode());
			System.out.println(date2.hashCode());
			System.out.println(calendar1.hashCode());
			System.out.println(calendar2.hashCode());
			System.out.println();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			System.out.println(sdf.format(date1));
			System.out.println(sdf.format(date2));

			calendar1.set(Calendar.DAY_OF_MONTH, 11);
			System.out.println(sdf.format(date1));
			System.out.println(sdf.format(date2));
					
			System.out.println(date1.hashCode());
			System.out.println(date2.hashCode());
			System.out.println(calendar1.hashCode());
			System.out.println(calendar2.hashCode());
			System.out.println();
					
	}
}
