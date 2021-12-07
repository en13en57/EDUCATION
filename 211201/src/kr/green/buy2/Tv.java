package kr.green.buy2;

public class Tv extends Product {
	private int price;
	private int bonusPoint;
	
	public Tv(int price, int bonusPoint) {
		super(price, bonusPoint);
	}

	@Override
	public String toString() {
		return "Tv [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
	
}
