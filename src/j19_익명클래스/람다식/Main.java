package j19_익명클래스.람다식;

public class Main {

	public static void main(String[] args) {
		
		// 100 + 200 = 300
		
		
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>() { // Math 인터페이스의 T1과 T2는 Integer형식 plusMath생성
			
			@Override
			public double calc(Integer value1, Integer value2) { // 일회성으로 익명클래스 생성 clac은 double형태이며 값은 Integer 형식으로 받음
				
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath.calc(10, 20));
		
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				System.out.println("value1: " + value1);
				System.out.println("value2: " + value2);
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath2.calc(100.5, 200.5));
		
		Math<Double, Double> plusMath3 = (v1, v2) -> { // 자동으로 앞의 인터페이스 형태를 찾아줌, 매개변수 정의 ->clac메소드 리턴
			System.out.println("value1: " + v1);
			System.out.println("value2: " + v2);
			return v1 + v2; 
		
		}; //익명클래스 정의
		
		Math<Double, Double> plusMath4 = (v1, v2) -> v1 + v2;
		
		System.out.println(plusMath4.calc(50.5, 10.4));
		
	}
	
}
