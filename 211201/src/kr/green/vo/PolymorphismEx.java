package kr.green.vo;// 다형성을 위하여 abstract를 사용하면 오버라이딩을 강제 할수있음
abstract class Shape{
	int x,y;
	public abstract void draw();
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
class Point extends Shape{
	public void draw() {
		System.out.println("(" + x + "," + y + ")점입니다.");
	}
}
class Line extends Shape{
	int width=100, height=50;
	public void draw() {
		System.out.println("(" + x + "," + y + ")~" + "(" + (x+width) + ", " + (y+height) + ")선입니다.");
	}
}
class Circle extends  Shape{
	int width, height;
	public void draw() { // 오버라이딩 안하면 오류가 나버림
	// public void show() { // 오버라이딩 안하면 오류가 나버림
		System.out.println("(" + x + "," + y + ")~" + "(" + (x+width) + ", " + (y+height) + ")내접하는 원입니다.");
	}
}
class Rect extends Shape{
	int width, height;
	public void draw() {
		System.out.println("(" + x + "," + y + ")~" + "(" + (x+width) + ", " + (y+height) + ")사각형입니다.");
	}
}
// 다형성 : 1개의 메서드가 여러가지의 형태로 발현된다.
// 1. 부모의 메서드를 오버라이딩한다. (공통의 메서드를 구현한다.)
// 2. 부모의 변수에 자식 객체를 대입한다.
// 3. 부모의 변수로 자식의 메서드를 호출한다.
public class PolymorphismEx {
	public static void main(String[] args) { 
		// 게임상에서 (shape 부모)움직여야하지만 (이하 자식)사람,차,보트 움직이는게 다름
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect()};
		for(Shape s : shapes) s.draw();

		shapes[1].move(10,10);
		shapes[1].draw();
		shapes[0].move(30,60);
		shapes[0].draw();
	
	}
}
