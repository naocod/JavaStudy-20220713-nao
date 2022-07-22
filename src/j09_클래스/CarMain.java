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
 * 
 * -출력-
 * 현대자동차
 * 쏘나타
 * 화이트
 * 
 * 기아
 * K5
 * 블랙
 * 
 * 현대자동차
 * 아반떼
 * 그레이
 * 
 */

public class CarMain {
	
	public static void main(String[] args) {
		
//		System.out.println((new Car()).toString()); // 변수에 저장하려면 Car 자료형이 아닌 String 자료형에 저장해야함
//		new Car();
		Car car1 = new Car(); // Car() 생성자 > 메소드처럼 호출하는 용도
		// 메소드와 형태가 비슷하지만 주소값을 리턴하기에 변수에 저장 가능
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.company = "현대자동차";
		car1.model = "쏘나타";
		car1.color = "화이트";
		
		car2.company = "기아";
		car2.model = "k5";
		car2.color = "블랙";
		
		car3.company = "현대자동차";
		car3.model = "아반떼";
		car3.color = "그레이";
		
		car1.showCarInfo();
		// 리턴이 없어 변수에 저장 안됨
		car2.showCarInfo();
		car3.showCarInfo();
		
	}
			

}
