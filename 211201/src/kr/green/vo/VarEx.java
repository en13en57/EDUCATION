package kr.green.vo;

public class VarEx extends VarVO{
	public void show() {
		VarVO vo = new VarVO();
		
		// public    : 어디서든 접근 가능하다.
		System.out.println("public : " + vo.pubVar);
		
		// protected : 다른 패키지의 자식은 사용 가능하다.
		System.out.println("protected : " + vo.proVar); // 자식이 아니어도 같은 패키지이므로 접근 가능
		
		// default   : 같은 패키지 내에서 접근 가능하다. 
		System.out.println("default : " + vo.defVar); // 같은 패키지이므로 접근 가능
		
		// private   : 클래스 내부에서만 사용 가능하다.
 		// System.out.println("private : " + vo.priVar); // 다른 클래스 접근 불가

	}
}
