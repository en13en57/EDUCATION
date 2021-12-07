// 내가 만든 클래스에서 깊은복사를 지원하는 clone()메서드를 사용하려면 2가지 작업을 해주어야 한다.
// 1. Cloneable 인터페이스를 구현해 주어야 한다. Cloneable 인터페이스는 깊은복사가 가능하다는 표시 인터페이스이다
// 2. clone()메서드를 오버라이딩 해 주어야 한다. 왜? protected멤버이기 때문에 클래스 밖에서 사용할 수 없다.
// 3. 오버라이드 clone()메서드
// 4. 부모클래스를 자식클래스에 대입하지 못하므로 형변환을 먼저 하여주어야한다
// 5. 예외사항 이므로 try -catch를 사용하여야한다.
class Point implements Cloneable{ // 표시인터페이스
	int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	// 2.

	@Override
	protected Object clone() throws CloneNotSupportedException { // 예외사항임.
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class CloneEx {
	public static void main(String[] args) {
		Point point1 = new Point(1,10);
		Point point2 = point1; // 얕은 복사 : 내용이 아닌 주소가 복사된다. 객체는 1개다.

		System.out.println(point1);
		System.out.println(point2);
	
		System.out.println(point1.hashCode());
		System.out.println(point2.hashCode()); // 해시코드가 같다. 같은 객체를 참조하고 있다.
	
		point1.x = 100; // 1개만 변경
	
		System.out.println(point1);
		System.out.println(point2); // 두개값이 모두 변경되었다. (같은 객체를 참조하고 있다.)
	
		// 깊은 복사 : 내용이 복사
		// 1. 새로운 객체를 만든다.
		Point point3 = new Point(0,0);
		// 2.필드값을 하나하나 복사해 주어야 한다.
		point3.x = point1.x;
		point3.y = point1.y;
		System.out.println();
		System.out.println(point1);
		System.out.println(point3); // 두개의 내용이 같다.
		System.out.println(point1.hashCode());
		System.out.println(point3.hashCode()); // 해시코드가 다르다. 다른 객체를 참조하고 있다.
		point1.y=200; // 1개만 변경
		System.out.println(point1);
		System.out.println(point3); // 한개값만 변경되었다. 다른객체를 참조하고있다.
	
		// clone() : 최고 조상인 Object의 메서드로 깊은 복사를 지원해주는 메서드이다.
		// 			 접근 지정자가 protected이다.
		// 			 그래서 clone()메서드를 사용하려면 두가지 작업을 해주어야 한다.
		try {
			// return타입이 object이므로 형변환해서 대입하고 예외처리를 해주어야 한다.
			Point point4 = (Point) point1.clone(); // 깊은 복사가 되었다.
			System.out.println(point1);
			System.out.println(point4); // 두개의 내용이 같다.
			System.out.println(point1.hashCode());
			System.out.println(point4.hashCode()); // 해시코드가 다르다. 다른 객체를 참조하고 있다.
			point1.y=500; // 1개만 변경
			System.out.println(point1);
			System.out.println(point4); // 한개값만 변경되었다. 다른객체를 참조하고있다.
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
