package j09_클래스.생성자;

public class Car {
	
	String company;
	String model;
	String color;
	
	public Car() {}

	public Car(String company, String model, String color) { // 생성자로만 호출, 3개의 매개변수가 같은 자료형이기에 기본 생성자와 전체생성자만 생성
		this.company = company;
		this.model = model;
		this.color = color;
	}
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
	

}
