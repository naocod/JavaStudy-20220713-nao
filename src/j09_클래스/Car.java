package j09_클래스;

/*
 * 클래스: Car
 * 변수
 * 		company
 * 		model
 * 		color
 * 
 * 메소드
 * 		showCarInfo()
 * 			회사명: 
 * 			모델명:
 * 			색상:
 */

public class Car {
	
	String company;
	String model;
	String color;
	
	
	Car() {
		// 생성자의 특징 : 생성자는 무조건 주소값을 리턴한다.
		// > Car() 앞에 자료형이 생략되어있고 리턴값이 없는 이유
		// 특징2 : 무조건 클래스와 이름이 동일함
		System.out.println("생성자 호출?");
	}
	// Car()[Constructor] 생성자가 생략되어있음
	
	
	
	
	void showCarInfo() {
		System.out.println("회사명: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println();
	}
	
	
	

}
