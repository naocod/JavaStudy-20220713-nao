package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER = 100; // 상수의 변수명은 전부 대문자로 사용
		final int MIN_NUMBER = 0;
		
		// MAX_NUMBER = 200; 상수는 최초의 값(초기화값) 이후에 변경할 수 없음
		// 상수 > 파일경로와 같이 변경되면 않되는 값에 사용됨
		
		int number = 10;
		number = 80;
		
		System.out.println("최소값: " + MIN_NUMBER);
		System.out.println("최대값: " + MAX_NUMBER);
		System.out.println("현재값: " + number);
	
		
		
	}

}
