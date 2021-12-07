import java.util.Scanner;

/*
 체질량지수는 자신
 */
// 1.
// 2. 생성장 생성
// 3. 게터세터 생성
// 4. get BMI 추가
// 5. 오버라이딩
// 6. 오버라이드 string.format
class BMI{
	private double height;
	private double weight;
	
	public BMI(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getBMI() {
		double bmi = weight/(height/100)*(height/100);
		return bmi;
	}
	public String getResult() {
		String result = "";
		double bmi = getBMI();
		if(bmi<18.5)
			result = "저체중";
		else if(bmi<23)
			result = "정상";
		else if(bmi<25)
			result = "과체중";
		else
			result = "비만";
		return result;
	}
	@Override
	public String toString() {
		return getBMI() + "(" + getResult() + ")";
	}

}


public class BMIEx {
	public static void main(String[] args) {

		BMI bmi2 = new BMI(176,68);
		System.out.println(bmi2);
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("몸무게 : ");
		double weight = sc.nextDouble();
		System.out.println("키 : ");
		double height = sc.nextDouble();
		
		double bmi = weight/(height/100)*(height/100);
		System.out.println("당신의 bmi 지수 : " + bmi);
		String result = "";
		if(bmi<18.5)
			result = "저체중";
		else if(bmi<23)
			result = "정상";
		else if(bmi<25)
			result = "과체중";
		else
			result = "비만";
		System.out.println(result);
		sc.close();
		
		
	}

}
